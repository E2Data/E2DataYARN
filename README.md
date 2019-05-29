# E2Data YARN

The E2Data software stack employs the Apache YARN resource management framework in order to dynamically acquire resources and dispatch tasks to them. Traditionally, the  resource types YARN could manage was memory and virtual cores. As per YARN 3.x.x hardware accelerators such as GPUs and FPGAs are also supported. This is of crucial importance for E2Data, whose aim is to establish heterogeneous processing in modern big data frameworks (e.g., Apache Flink). Given two diverse sets of tasks and hardware resources, the E2Data scheduler identifies the optimal mapping between the two and enforces its execution. As it is YARN that allocates resources during execution, it should be able to get as input a hardware device and dispatch a task to it. However, in a YARN installation, when GPUs or FPGAs are the case, a NodeManager can only be aware that an accelerator exists or not. It cannot tell the differences among various similar devices and cannot pick the specific one that the user (or a scheduler) instructs it to.

For tackling this deficiency, we have modified YARN to support multiple GPU types. This document presents the outline of our approach as well as some technical information.

## Approach Outline

The key idea of our approach is that we handle each GPU as a different resource type. By default, YARN considers two distinct resource types for accelerators:
1. yarn.io/gpu
2. yarn.io/fpga

We extend this list by attaching the model of a device to the name of its type. For example, considering a Tesla V100-SXM2-32GB GPU is available, we need to declare in YARN’s configuration that the corresponding NodeManager supports the yarn.io/gpu-teslav100sxm232gb resource type. For ensuring that a specific device is uniquely described within a cluster, we make the following naming convention: We get as model name the one that is returned by the nvidia-smi utility. We then remove all spaces, replace any "-" characters with the empty character and turn all letters to lowercase.

## Requirements

1. Maven 3.3.0+
2. Hadoop 3.1.1

## Build

1. Clone hadoop from the official repo.
2. Replace the *hadoop-yarn-project* folder with the content of this repository.
3. Run the following command:
`mvn install -Dcontainer-executor.conf.dir=<path of container-executor.cfg> -DskipTests -Pnative -Pdist -Dtar`

If the build process finishes successfully, a tar file with YARN's binaries should appear under: `$HADOOP_HOME/hadoop-dist/target`

## Setup

1. Decompress Hadoop tar file
2. Replace the default configuration with the sample one and modify it according to your local settings
3. Take care of permissions as follows:
`$ chown root $HADOOP_HOME/bin/container-executor`
`$ chmod u+s $HADOOP_HOME/bin/container-executor`
`$ chmod u-rwx $HADOOP_HOME/bin/container-executor`
`$ chmod g+s,o-rwx $HADOOP_HOME/bin/container-executor`
 
###### Notes

1. The path hierarchy of container-executor.cfg that is declared during the build phase should belong to the root user. In our setup, this is under `/opt/hadoop-container-conf`.
2. By default, YARN uses the *DefaultContainerExecutor*. For enabling isolation when using hardware accelerators, we must enforce the use of the *LinuxContainerExecutor*. The *LinuxContainerExecutor* achieves isolation by employing cgroups. Thus, cgroups should be mounted in the target machine. For testing whether Linux containers are correctly set up, we can run: `$HADOOP_HOME/bin/container-executor --checksetup`
3. For correctly deploying YARN with cgroups in our setup, we had to manually create the yarn hierarchy as:
- `cgcreate -t <user>:<group> -a <user>:<group> -g cpu:yarn`
- `cgcreate -t <user>:<group> -a <user>:<group> -g devices:yarn`
4. Useful links on YARN and Linux containers:
- https://hadoop.apache.org/docs/current/hadoop-yarn/hadoop-yarn-site/SecureContainer.html
- https://hadoop.apache.org/docs/r3.1.1/hadoop-project-dist/hadoop-common/SecureMode.html
- https://hadoop.apache.org/docs/r3.1.1/hadoop-yarn/hadoop-yarn-site/UsingGpus.html


