/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.yarn.server.nodemanager.containermanager.linux.resources.gpu;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.StringUtils;
import org.apache.hadoop.yarn.api.records.ContainerId;
import org.apache.hadoop.yarn.exceptions.YarnException;
import org.apache.hadoop.yarn.server.nodemanager.Context;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.container.Container;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.linux.privileged.PrivilegedOperation;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.linux.privileged.PrivilegedOperationException;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.linux.privileged.PrivilegedOperationExecutor;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.linux.resources.CGroupsHandler;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.linux.resources.ResourceHandler;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.linux.resources.ResourceHandlerException;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.linux.runtime.DockerLinuxContainerRuntime;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.resourceplugin.gpu.GpuDevice;
import org.apache.hadoop.yarn.server.nodemanager.containermanager.resourceplugin.gpu.GpuDiscoverer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GpuResourceHandlerImpl implements ResourceHandler {
  final static Log LOG = LogFactory
      .getLog(GpuResourceHandlerImpl.class);

  // This will be used by container-executor to add necessary clis
  public static final String EXCLUDED_GPUS_CLI_OPTION = "--excluded_gpus";
  public static final String CONTAINER_ID_CLI_OPTION = "--container_id";

  private GpuResourceAllocator gpuAllocator;
  private CGroupsHandler cGroupsHandler;
  private PrivilegedOperationExecutor privilegedOperationExecutor;
  private String gpuProductName;

  public GpuResourceHandlerImpl(Context nmContext,
      CGroupsHandler cGroupsHandler,
      PrivilegedOperationExecutor privilegedOperationExecutor, String gpuProductName) {
    this.cGroupsHandler = cGroupsHandler;
    this.privilegedOperationExecutor = privilegedOperationExecutor;
    this.gpuProductName = gpuProductName;
    gpuAllocator = new GpuResourceAllocator(nmContext, gpuProductName);
    LOG.info("## GMYTIL ## : New GpuResourceHandlerImpl created for resource "+gpuProductName);
  }

  @Override
  public List<PrivilegedOperation> bootstrap(Configuration configuration)
      throws ResourceHandlerException {
    List<GpuDevice> usableGpus;
    try {
      usableGpus = GpuDiscoverer.getInstance()
          .getGpusUsableByYarn(gpuProductName);
      if (usableGpus == null || usableGpus.isEmpty()) {
        String message = "GPU is enabled on the NodeManager, but couldn't find "
            + "any usable GPU devices, please double check configuration.";
        LOG.error(message);
        throw new ResourceHandlerException(message);
      }
    } catch (YarnException e) {
      LOG.error("Exception when trying to get usable GPU device", e);
      throw new ResourceHandlerException(e);
    }

    for (GpuDevice gpu : usableGpus) {
      gpuAllocator.addGpu(gpu);
    }

    // And initialize cgroups
    this.cGroupsHandler.initializeCGroupController(
        CGroupsHandler.CGroupController.DEVICES);

    LOG.info("## GMYTIL ## : Cgroups initialized without an exception.");

    return null;
  }

  @Override
  public synchronized List<PrivilegedOperation> preStart(Container container)
      throws ResourceHandlerException {
    String containerIdStr = container.getContainerId().toString();

    // Assign Gpus to container if requested some.
    GpuResourceAllocator.GpuAllocation allocation = gpuAllocator.assignGpus(
        container);

    ///////////// GMYTIL code //////////////////
    if(allocation != null && !allocation.getAllowedGPUs().isEmpty()){
      LOG.info("## GMYTIL ## : gpus were allocated");
    }else{
      LOG.info("## GMYTIL ## : no gpu allocation");
    }
    ///////////// GMYTIL code //////////////////

    LOG.info("## GMYTIL ## : Ready to create cgroup in the DEVICES subsystem");
    // Create device cgroups for the container
    cGroupsHandler.createCGroup(CGroupsHandler.CGroupController.DEVICES,
        containerIdStr);
    LOG.info("## GMYTIL ## : Done");
    if (!DockerLinuxContainerRuntime.isDockerContainerRequested(
        container.getLaunchContext().getEnvironment())) {
      // Write to devices cgroup only for non-docker container. The reason is
      // docker engine runtime runc do the devices cgroups initialize in the
      // pre-hook, see:
      //   https://github.com/opencontainers/runc/blob/master/libcontainer/configs/device_defaults.go
      //
      // YARN by default runs docker container inside cgroup, if we setup cgroups
      // devices.deny for the parent cgroup for launched container, we can see
      // errors like: failed to write c *:* m to devices.allow:
      // write path-to-parent-cgroup/<container-id>/devices.allow:
      // operation not permitted.
      //
      // To avoid this happen, if docker is requested when container being
      // launched, we will not setup devices.deny for the container. Instead YARN
      // will pass --device parameter to docker engine. See NvidiaDockerV1CommandPlugin
      try {
        // Execute c-e to setup GPU isolation before launch the container
        PrivilegedOperation privilegedOperation = new PrivilegedOperation(
            PrivilegedOperation.OperationType.GPU,
            Arrays.asList(CONTAINER_ID_CLI_OPTION, containerIdStr));
        if (!allocation.getDeniedGPUs().isEmpty()) {
          List<Integer> minorNumbers = new ArrayList<>();
          for (GpuDevice deniedGpu : allocation.getDeniedGPUs()) {
            minorNumbers.add(deniedGpu.getMinorNumber());
          }
          privilegedOperation.appendArgs(Arrays.asList(EXCLUDED_GPUS_CLI_OPTION,
              StringUtils.join(",", minorNumbers)));
        }

        privilegedOperationExecutor.executePrivilegedOperation(
            privilegedOperation, true);
      } catch (PrivilegedOperationException e) {
        cGroupsHandler.deleteCGroup(CGroupsHandler.CGroupController.DEVICES,
            containerIdStr);
        LOG.warn("Could not update cgroup for container", e);
        throw new ResourceHandlerException(e);
      }

      List<PrivilegedOperation> ret = new ArrayList<>();
      ret.add(new PrivilegedOperation(
          PrivilegedOperation.OperationType.ADD_PID_TO_CGROUP,
          PrivilegedOperation.CGROUP_ARG_PREFIX + cGroupsHandler
              .getPathForCGroupTasks(CGroupsHandler.CGroupController.DEVICES,
                  containerIdStr)));

      return ret;
    }
    LOG.info("## GMYTIL ## : preStart ready -> No privileged operations needed.");
    return null;
  }

  public GpuResourceAllocator getGpuAllocator() {
    return gpuAllocator;
  }

  @Override
  public List<PrivilegedOperation> reacquireContainer(ContainerId containerId)
      throws ResourceHandlerException {
    gpuAllocator.recoverAssignedGpus(containerId);
    return null;
  }

  @Override
  public synchronized List<PrivilegedOperation> postComplete(
      ContainerId containerId) throws ResourceHandlerException {
    gpuAllocator.cleanupAssignGpus(containerId);
    cGroupsHandler.deleteCGroup(CGroupsHandler.CGroupController.DEVICES,
        containerId.toString());
    return null;
  }

  @Override
  public List<PrivilegedOperation> teardown() throws ResourceHandlerException {
    return null;
  }
}
