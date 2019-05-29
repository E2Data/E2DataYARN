package csi.v0;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: csi.proto")
public final class ControllerGrpc {

  private ControllerGrpc() {}

  public static final String SERVICE_NAME = "csi.v0.Controller";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.CreateVolumeRequest,
      csi.v0.Csi.CreateVolumeResponse> getCreateVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVolume",
      requestType = csi.v0.Csi.CreateVolumeRequest.class,
      responseType = csi.v0.Csi.CreateVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.CreateVolumeRequest,
      csi.v0.Csi.CreateVolumeResponse> getCreateVolumeMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.CreateVolumeRequest, csi.v0.Csi.CreateVolumeResponse> getCreateVolumeMethod;
    if ((getCreateVolumeMethod = ControllerGrpc.getCreateVolumeMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getCreateVolumeMethod = ControllerGrpc.getCreateVolumeMethod) == null) {
          ControllerGrpc.getCreateVolumeMethod = getCreateVolumeMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.CreateVolumeRequest, csi.v0.Csi.CreateVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "CreateVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.CreateVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.CreateVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("CreateVolume"))
                  .build();
          }
        }
     }
     return getCreateVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.DeleteVolumeRequest,
      csi.v0.Csi.DeleteVolumeResponse> getDeleteVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVolume",
      requestType = csi.v0.Csi.DeleteVolumeRequest.class,
      responseType = csi.v0.Csi.DeleteVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.DeleteVolumeRequest,
      csi.v0.Csi.DeleteVolumeResponse> getDeleteVolumeMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.DeleteVolumeRequest, csi.v0.Csi.DeleteVolumeResponse> getDeleteVolumeMethod;
    if ((getDeleteVolumeMethod = ControllerGrpc.getDeleteVolumeMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getDeleteVolumeMethod = ControllerGrpc.getDeleteVolumeMethod) == null) {
          ControllerGrpc.getDeleteVolumeMethod = getDeleteVolumeMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.DeleteVolumeRequest, csi.v0.Csi.DeleteVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "DeleteVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.DeleteVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.DeleteVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("DeleteVolume"))
                  .build();
          }
        }
     }
     return getDeleteVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.ControllerPublishVolumeRequest,
      csi.v0.Csi.ControllerPublishVolumeResponse> getControllerPublishVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControllerPublishVolume",
      requestType = csi.v0.Csi.ControllerPublishVolumeRequest.class,
      responseType = csi.v0.Csi.ControllerPublishVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.ControllerPublishVolumeRequest,
      csi.v0.Csi.ControllerPublishVolumeResponse> getControllerPublishVolumeMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.ControllerPublishVolumeRequest, csi.v0.Csi.ControllerPublishVolumeResponse> getControllerPublishVolumeMethod;
    if ((getControllerPublishVolumeMethod = ControllerGrpc.getControllerPublishVolumeMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getControllerPublishVolumeMethod = ControllerGrpc.getControllerPublishVolumeMethod) == null) {
          ControllerGrpc.getControllerPublishVolumeMethod = getControllerPublishVolumeMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.ControllerPublishVolumeRequest, csi.v0.Csi.ControllerPublishVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "ControllerPublishVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ControllerPublishVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ControllerPublishVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("ControllerPublishVolume"))
                  .build();
          }
        }
     }
     return getControllerPublishVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.ControllerUnpublishVolumeRequest,
      csi.v0.Csi.ControllerUnpublishVolumeResponse> getControllerUnpublishVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControllerUnpublishVolume",
      requestType = csi.v0.Csi.ControllerUnpublishVolumeRequest.class,
      responseType = csi.v0.Csi.ControllerUnpublishVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.ControllerUnpublishVolumeRequest,
      csi.v0.Csi.ControllerUnpublishVolumeResponse> getControllerUnpublishVolumeMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.ControllerUnpublishVolumeRequest, csi.v0.Csi.ControllerUnpublishVolumeResponse> getControllerUnpublishVolumeMethod;
    if ((getControllerUnpublishVolumeMethod = ControllerGrpc.getControllerUnpublishVolumeMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getControllerUnpublishVolumeMethod = ControllerGrpc.getControllerUnpublishVolumeMethod) == null) {
          ControllerGrpc.getControllerUnpublishVolumeMethod = getControllerUnpublishVolumeMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.ControllerUnpublishVolumeRequest, csi.v0.Csi.ControllerUnpublishVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "ControllerUnpublishVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ControllerUnpublishVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ControllerUnpublishVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("ControllerUnpublishVolume"))
                  .build();
          }
        }
     }
     return getControllerUnpublishVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.ValidateVolumeCapabilitiesRequest,
      csi.v0.Csi.ValidateVolumeCapabilitiesResponse> getValidateVolumeCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateVolumeCapabilities",
      requestType = csi.v0.Csi.ValidateVolumeCapabilitiesRequest.class,
      responseType = csi.v0.Csi.ValidateVolumeCapabilitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.ValidateVolumeCapabilitiesRequest,
      csi.v0.Csi.ValidateVolumeCapabilitiesResponse> getValidateVolumeCapabilitiesMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.ValidateVolumeCapabilitiesRequest, csi.v0.Csi.ValidateVolumeCapabilitiesResponse> getValidateVolumeCapabilitiesMethod;
    if ((getValidateVolumeCapabilitiesMethod = ControllerGrpc.getValidateVolumeCapabilitiesMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getValidateVolumeCapabilitiesMethod = ControllerGrpc.getValidateVolumeCapabilitiesMethod) == null) {
          ControllerGrpc.getValidateVolumeCapabilitiesMethod = getValidateVolumeCapabilitiesMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.ValidateVolumeCapabilitiesRequest, csi.v0.Csi.ValidateVolumeCapabilitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "ValidateVolumeCapabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ValidateVolumeCapabilitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ValidateVolumeCapabilitiesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("ValidateVolumeCapabilities"))
                  .build();
          }
        }
     }
     return getValidateVolumeCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.ListVolumesRequest,
      csi.v0.Csi.ListVolumesResponse> getListVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVolumes",
      requestType = csi.v0.Csi.ListVolumesRequest.class,
      responseType = csi.v0.Csi.ListVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.ListVolumesRequest,
      csi.v0.Csi.ListVolumesResponse> getListVolumesMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.ListVolumesRequest, csi.v0.Csi.ListVolumesResponse> getListVolumesMethod;
    if ((getListVolumesMethod = ControllerGrpc.getListVolumesMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getListVolumesMethod = ControllerGrpc.getListVolumesMethod) == null) {
          ControllerGrpc.getListVolumesMethod = getListVolumesMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.ListVolumesRequest, csi.v0.Csi.ListVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "ListVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ListVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ListVolumesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("ListVolumes"))
                  .build();
          }
        }
     }
     return getListVolumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.GetCapacityRequest,
      csi.v0.Csi.GetCapacityResponse> getGetCapacityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCapacity",
      requestType = csi.v0.Csi.GetCapacityRequest.class,
      responseType = csi.v0.Csi.GetCapacityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.GetCapacityRequest,
      csi.v0.Csi.GetCapacityResponse> getGetCapacityMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.GetCapacityRequest, csi.v0.Csi.GetCapacityResponse> getGetCapacityMethod;
    if ((getGetCapacityMethod = ControllerGrpc.getGetCapacityMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getGetCapacityMethod = ControllerGrpc.getGetCapacityMethod) == null) {
          ControllerGrpc.getGetCapacityMethod = getGetCapacityMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.GetCapacityRequest, csi.v0.Csi.GetCapacityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "GetCapacity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.GetCapacityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.GetCapacityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("GetCapacity"))
                  .build();
          }
        }
     }
     return getGetCapacityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.ControllerGetCapabilitiesRequest,
      csi.v0.Csi.ControllerGetCapabilitiesResponse> getControllerGetCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControllerGetCapabilities",
      requestType = csi.v0.Csi.ControllerGetCapabilitiesRequest.class,
      responseType = csi.v0.Csi.ControllerGetCapabilitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.ControllerGetCapabilitiesRequest,
      csi.v0.Csi.ControllerGetCapabilitiesResponse> getControllerGetCapabilitiesMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.ControllerGetCapabilitiesRequest, csi.v0.Csi.ControllerGetCapabilitiesResponse> getControllerGetCapabilitiesMethod;
    if ((getControllerGetCapabilitiesMethod = ControllerGrpc.getControllerGetCapabilitiesMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getControllerGetCapabilitiesMethod = ControllerGrpc.getControllerGetCapabilitiesMethod) == null) {
          ControllerGrpc.getControllerGetCapabilitiesMethod = getControllerGetCapabilitiesMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.ControllerGetCapabilitiesRequest, csi.v0.Csi.ControllerGetCapabilitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "ControllerGetCapabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ControllerGetCapabilitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ControllerGetCapabilitiesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("ControllerGetCapabilities"))
                  .build();
          }
        }
     }
     return getControllerGetCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.CreateSnapshotRequest,
      csi.v0.Csi.CreateSnapshotResponse> getCreateSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSnapshot",
      requestType = csi.v0.Csi.CreateSnapshotRequest.class,
      responseType = csi.v0.Csi.CreateSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.CreateSnapshotRequest,
      csi.v0.Csi.CreateSnapshotResponse> getCreateSnapshotMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.CreateSnapshotRequest, csi.v0.Csi.CreateSnapshotResponse> getCreateSnapshotMethod;
    if ((getCreateSnapshotMethod = ControllerGrpc.getCreateSnapshotMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getCreateSnapshotMethod = ControllerGrpc.getCreateSnapshotMethod) == null) {
          ControllerGrpc.getCreateSnapshotMethod = getCreateSnapshotMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.CreateSnapshotRequest, csi.v0.Csi.CreateSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "CreateSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.CreateSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.CreateSnapshotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("CreateSnapshot"))
                  .build();
          }
        }
     }
     return getCreateSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.DeleteSnapshotRequest,
      csi.v0.Csi.DeleteSnapshotResponse> getDeleteSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSnapshot",
      requestType = csi.v0.Csi.DeleteSnapshotRequest.class,
      responseType = csi.v0.Csi.DeleteSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.DeleteSnapshotRequest,
      csi.v0.Csi.DeleteSnapshotResponse> getDeleteSnapshotMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.DeleteSnapshotRequest, csi.v0.Csi.DeleteSnapshotResponse> getDeleteSnapshotMethod;
    if ((getDeleteSnapshotMethod = ControllerGrpc.getDeleteSnapshotMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getDeleteSnapshotMethod = ControllerGrpc.getDeleteSnapshotMethod) == null) {
          ControllerGrpc.getDeleteSnapshotMethod = getDeleteSnapshotMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.DeleteSnapshotRequest, csi.v0.Csi.DeleteSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "DeleteSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.DeleteSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.DeleteSnapshotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("DeleteSnapshot"))
                  .build();
          }
        }
     }
     return getDeleteSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.ListSnapshotsRequest,
      csi.v0.Csi.ListSnapshotsResponse> getListSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSnapshots",
      requestType = csi.v0.Csi.ListSnapshotsRequest.class,
      responseType = csi.v0.Csi.ListSnapshotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.ListSnapshotsRequest,
      csi.v0.Csi.ListSnapshotsResponse> getListSnapshotsMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.ListSnapshotsRequest, csi.v0.Csi.ListSnapshotsResponse> getListSnapshotsMethod;
    if ((getListSnapshotsMethod = ControllerGrpc.getListSnapshotsMethod) == null) {
      synchronized (ControllerGrpc.class) {
        if ((getListSnapshotsMethod = ControllerGrpc.getListSnapshotsMethod) == null) {
          ControllerGrpc.getListSnapshotsMethod = getListSnapshotsMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.ListSnapshotsRequest, csi.v0.Csi.ListSnapshotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Controller", "ListSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ListSnapshotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.ListSnapshotsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ControllerMethodDescriptorSupplier("ListSnapshots"))
                  .build();
          }
        }
     }
     return getListSnapshotsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ControllerStub newStub(io.grpc.Channel channel) {
    return new ControllerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ControllerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ControllerFutureStub(channel);
  }

  /**
   */
  public static abstract class ControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void createVolume(csi.v0.Csi.CreateVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.CreateVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVolumeMethod(), responseObserver);
    }

    /**
     */
    public void deleteVolume(csi.v0.Csi.DeleteVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.DeleteVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVolumeMethod(), responseObserver);
    }

    /**
     */
    public void controllerPublishVolume(csi.v0.Csi.ControllerPublishVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ControllerPublishVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getControllerPublishVolumeMethod(), responseObserver);
    }

    /**
     */
    public void controllerUnpublishVolume(csi.v0.Csi.ControllerUnpublishVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ControllerUnpublishVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getControllerUnpublishVolumeMethod(), responseObserver);
    }

    /**
     */
    public void validateVolumeCapabilities(csi.v0.Csi.ValidateVolumeCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ValidateVolumeCapabilitiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateVolumeCapabilitiesMethod(), responseObserver);
    }

    /**
     */
    public void listVolumes(csi.v0.Csi.ListVolumesRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ListVolumesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVolumesMethod(), responseObserver);
    }

    /**
     */
    public void getCapacity(csi.v0.Csi.GetCapacityRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.GetCapacityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCapacityMethod(), responseObserver);
    }

    /**
     */
    public void controllerGetCapabilities(csi.v0.Csi.ControllerGetCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ControllerGetCapabilitiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getControllerGetCapabilitiesMethod(), responseObserver);
    }

    /**
     */
    public void createSnapshot(csi.v0.Csi.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.CreateSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSnapshotMethod(), responseObserver);
    }

    /**
     */
    public void deleteSnapshot(csi.v0.Csi.DeleteSnapshotRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.DeleteSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSnapshotMethod(), responseObserver);
    }

    /**
     */
    public void listSnapshots(csi.v0.Csi.ListSnapshotsRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ListSnapshotsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSnapshotsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.CreateVolumeRequest,
                csi.v0.Csi.CreateVolumeResponse>(
                  this, METHODID_CREATE_VOLUME)))
          .addMethod(
            getDeleteVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.DeleteVolumeRequest,
                csi.v0.Csi.DeleteVolumeResponse>(
                  this, METHODID_DELETE_VOLUME)))
          .addMethod(
            getControllerPublishVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.ControllerPublishVolumeRequest,
                csi.v0.Csi.ControllerPublishVolumeResponse>(
                  this, METHODID_CONTROLLER_PUBLISH_VOLUME)))
          .addMethod(
            getControllerUnpublishVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.ControllerUnpublishVolumeRequest,
                csi.v0.Csi.ControllerUnpublishVolumeResponse>(
                  this, METHODID_CONTROLLER_UNPUBLISH_VOLUME)))
          .addMethod(
            getValidateVolumeCapabilitiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.ValidateVolumeCapabilitiesRequest,
                csi.v0.Csi.ValidateVolumeCapabilitiesResponse>(
                  this, METHODID_VALIDATE_VOLUME_CAPABILITIES)))
          .addMethod(
            getListVolumesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.ListVolumesRequest,
                csi.v0.Csi.ListVolumesResponse>(
                  this, METHODID_LIST_VOLUMES)))
          .addMethod(
            getGetCapacityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.GetCapacityRequest,
                csi.v0.Csi.GetCapacityResponse>(
                  this, METHODID_GET_CAPACITY)))
          .addMethod(
            getControllerGetCapabilitiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.ControllerGetCapabilitiesRequest,
                csi.v0.Csi.ControllerGetCapabilitiesResponse>(
                  this, METHODID_CONTROLLER_GET_CAPABILITIES)))
          .addMethod(
            getCreateSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.CreateSnapshotRequest,
                csi.v0.Csi.CreateSnapshotResponse>(
                  this, METHODID_CREATE_SNAPSHOT)))
          .addMethod(
            getDeleteSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.DeleteSnapshotRequest,
                csi.v0.Csi.DeleteSnapshotResponse>(
                  this, METHODID_DELETE_SNAPSHOT)))
          .addMethod(
            getListSnapshotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.ListSnapshotsRequest,
                csi.v0.Csi.ListSnapshotsResponse>(
                  this, METHODID_LIST_SNAPSHOTS)))
          .build();
    }
  }

  /**
   */
  public static final class ControllerStub extends io.grpc.stub.AbstractStub<ControllerStub> {
    private ControllerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ControllerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControllerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ControllerStub(channel, callOptions);
    }

    /**
     */
    public void createVolume(csi.v0.Csi.CreateVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.CreateVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVolume(csi.v0.Csi.DeleteVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.DeleteVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void controllerPublishVolume(csi.v0.Csi.ControllerPublishVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ControllerPublishVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getControllerPublishVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void controllerUnpublishVolume(csi.v0.Csi.ControllerUnpublishVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ControllerUnpublishVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getControllerUnpublishVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateVolumeCapabilities(csi.v0.Csi.ValidateVolumeCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ValidateVolumeCapabilitiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateVolumeCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVolumes(csi.v0.Csi.ListVolumesRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ListVolumesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCapacity(csi.v0.Csi.GetCapacityRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.GetCapacityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCapacityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void controllerGetCapabilities(csi.v0.Csi.ControllerGetCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ControllerGetCapabilitiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getControllerGetCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSnapshot(csi.v0.Csi.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.CreateSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSnapshot(csi.v0.Csi.DeleteSnapshotRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.DeleteSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSnapshots(csi.v0.Csi.ListSnapshotsRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.ListSnapshotsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ControllerBlockingStub extends io.grpc.stub.AbstractStub<ControllerBlockingStub> {
    private ControllerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ControllerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControllerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public csi.v0.Csi.CreateVolumeResponse createVolume(csi.v0.Csi.CreateVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.DeleteVolumeResponse deleteVolume(csi.v0.Csi.DeleteVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.ControllerPublishVolumeResponse controllerPublishVolume(csi.v0.Csi.ControllerPublishVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getControllerPublishVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.ControllerUnpublishVolumeResponse controllerUnpublishVolume(csi.v0.Csi.ControllerUnpublishVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getControllerUnpublishVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.ValidateVolumeCapabilitiesResponse validateVolumeCapabilities(csi.v0.Csi.ValidateVolumeCapabilitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidateVolumeCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.ListVolumesResponse listVolumes(csi.v0.Csi.ListVolumesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVolumesMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.GetCapacityResponse getCapacity(csi.v0.Csi.GetCapacityRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCapacityMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.ControllerGetCapabilitiesResponse controllerGetCapabilities(csi.v0.Csi.ControllerGetCapabilitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), getControllerGetCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.CreateSnapshotResponse createSnapshot(csi.v0.Csi.CreateSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSnapshotMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.DeleteSnapshotResponse deleteSnapshot(csi.v0.Csi.DeleteSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSnapshotMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.ListSnapshotsResponse listSnapshots(csi.v0.Csi.ListSnapshotsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSnapshotsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ControllerFutureStub extends io.grpc.stub.AbstractStub<ControllerFutureStub> {
    private ControllerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ControllerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControllerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.CreateVolumeResponse> createVolume(
        csi.v0.Csi.CreateVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.DeleteVolumeResponse> deleteVolume(
        csi.v0.Csi.DeleteVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.ControllerPublishVolumeResponse> controllerPublishVolume(
        csi.v0.Csi.ControllerPublishVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getControllerPublishVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.ControllerUnpublishVolumeResponse> controllerUnpublishVolume(
        csi.v0.Csi.ControllerUnpublishVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getControllerUnpublishVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.ValidateVolumeCapabilitiesResponse> validateVolumeCapabilities(
        csi.v0.Csi.ValidateVolumeCapabilitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateVolumeCapabilitiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.ListVolumesResponse> listVolumes(
        csi.v0.Csi.ListVolumesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVolumesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.GetCapacityResponse> getCapacity(
        csi.v0.Csi.GetCapacityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCapacityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.ControllerGetCapabilitiesResponse> controllerGetCapabilities(
        csi.v0.Csi.ControllerGetCapabilitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getControllerGetCapabilitiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.CreateSnapshotResponse> createSnapshot(
        csi.v0.Csi.CreateSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSnapshotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.DeleteSnapshotResponse> deleteSnapshot(
        csi.v0.Csi.DeleteSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSnapshotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.ListSnapshotsResponse> listSnapshots(
        csi.v0.Csi.ListSnapshotsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VOLUME = 0;
  private static final int METHODID_DELETE_VOLUME = 1;
  private static final int METHODID_CONTROLLER_PUBLISH_VOLUME = 2;
  private static final int METHODID_CONTROLLER_UNPUBLISH_VOLUME = 3;
  private static final int METHODID_VALIDATE_VOLUME_CAPABILITIES = 4;
  private static final int METHODID_LIST_VOLUMES = 5;
  private static final int METHODID_GET_CAPACITY = 6;
  private static final int METHODID_CONTROLLER_GET_CAPABILITIES = 7;
  private static final int METHODID_CREATE_SNAPSHOT = 8;
  private static final int METHODID_DELETE_SNAPSHOT = 9;
  private static final int METHODID_LIST_SNAPSHOTS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_VOLUME:
          serviceImpl.createVolume((csi.v0.Csi.CreateVolumeRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.CreateVolumeResponse>) responseObserver);
          break;
        case METHODID_DELETE_VOLUME:
          serviceImpl.deleteVolume((csi.v0.Csi.DeleteVolumeRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.DeleteVolumeResponse>) responseObserver);
          break;
        case METHODID_CONTROLLER_PUBLISH_VOLUME:
          serviceImpl.controllerPublishVolume((csi.v0.Csi.ControllerPublishVolumeRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.ControllerPublishVolumeResponse>) responseObserver);
          break;
        case METHODID_CONTROLLER_UNPUBLISH_VOLUME:
          serviceImpl.controllerUnpublishVolume((csi.v0.Csi.ControllerUnpublishVolumeRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.ControllerUnpublishVolumeResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_VOLUME_CAPABILITIES:
          serviceImpl.validateVolumeCapabilities((csi.v0.Csi.ValidateVolumeCapabilitiesRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.ValidateVolumeCapabilitiesResponse>) responseObserver);
          break;
        case METHODID_LIST_VOLUMES:
          serviceImpl.listVolumes((csi.v0.Csi.ListVolumesRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.ListVolumesResponse>) responseObserver);
          break;
        case METHODID_GET_CAPACITY:
          serviceImpl.getCapacity((csi.v0.Csi.GetCapacityRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.GetCapacityResponse>) responseObserver);
          break;
        case METHODID_CONTROLLER_GET_CAPABILITIES:
          serviceImpl.controllerGetCapabilities((csi.v0.Csi.ControllerGetCapabilitiesRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.ControllerGetCapabilitiesResponse>) responseObserver);
          break;
        case METHODID_CREATE_SNAPSHOT:
          serviceImpl.createSnapshot((csi.v0.Csi.CreateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.CreateSnapshotResponse>) responseObserver);
          break;
        case METHODID_DELETE_SNAPSHOT:
          serviceImpl.deleteSnapshot((csi.v0.Csi.DeleteSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.DeleteSnapshotResponse>) responseObserver);
          break;
        case METHODID_LIST_SNAPSHOTS:
          serviceImpl.listSnapshots((csi.v0.Csi.ListSnapshotsRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.ListSnapshotsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ControllerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return csi.v0.Csi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Controller");
    }
  }

  private static final class ControllerFileDescriptorSupplier
      extends ControllerBaseDescriptorSupplier {
    ControllerFileDescriptorSupplier() {}
  }

  private static final class ControllerMethodDescriptorSupplier
      extends ControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ControllerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ControllerFileDescriptorSupplier())
              .addMethod(getCreateVolumeMethod())
              .addMethod(getDeleteVolumeMethod())
              .addMethod(getControllerPublishVolumeMethod())
              .addMethod(getControllerUnpublishVolumeMethod())
              .addMethod(getValidateVolumeCapabilitiesMethod())
              .addMethod(getListVolumesMethod())
              .addMethod(getGetCapacityMethod())
              .addMethod(getControllerGetCapabilitiesMethod())
              .addMethod(getCreateSnapshotMethod())
              .addMethod(getDeleteSnapshotMethod())
              .addMethod(getListSnapshotsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
