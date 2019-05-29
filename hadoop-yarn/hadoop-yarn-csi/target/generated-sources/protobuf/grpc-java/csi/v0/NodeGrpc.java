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
public final class NodeGrpc {

  private NodeGrpc() {}

  public static final String SERVICE_NAME = "csi.v0.Node";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.NodeStageVolumeRequest,
      csi.v0.Csi.NodeStageVolumeResponse> getNodeStageVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NodeStageVolume",
      requestType = csi.v0.Csi.NodeStageVolumeRequest.class,
      responseType = csi.v0.Csi.NodeStageVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.NodeStageVolumeRequest,
      csi.v0.Csi.NodeStageVolumeResponse> getNodeStageVolumeMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.NodeStageVolumeRequest, csi.v0.Csi.NodeStageVolumeResponse> getNodeStageVolumeMethod;
    if ((getNodeStageVolumeMethod = NodeGrpc.getNodeStageVolumeMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getNodeStageVolumeMethod = NodeGrpc.getNodeStageVolumeMethod) == null) {
          NodeGrpc.getNodeStageVolumeMethod = getNodeStageVolumeMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.NodeStageVolumeRequest, csi.v0.Csi.NodeStageVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Node", "NodeStageVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeStageVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeStageVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeMethodDescriptorSupplier("NodeStageVolume"))
                  .build();
          }
        }
     }
     return getNodeStageVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.NodeUnstageVolumeRequest,
      csi.v0.Csi.NodeUnstageVolumeResponse> getNodeUnstageVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NodeUnstageVolume",
      requestType = csi.v0.Csi.NodeUnstageVolumeRequest.class,
      responseType = csi.v0.Csi.NodeUnstageVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.NodeUnstageVolumeRequest,
      csi.v0.Csi.NodeUnstageVolumeResponse> getNodeUnstageVolumeMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.NodeUnstageVolumeRequest, csi.v0.Csi.NodeUnstageVolumeResponse> getNodeUnstageVolumeMethod;
    if ((getNodeUnstageVolumeMethod = NodeGrpc.getNodeUnstageVolumeMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getNodeUnstageVolumeMethod = NodeGrpc.getNodeUnstageVolumeMethod) == null) {
          NodeGrpc.getNodeUnstageVolumeMethod = getNodeUnstageVolumeMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.NodeUnstageVolumeRequest, csi.v0.Csi.NodeUnstageVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Node", "NodeUnstageVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeUnstageVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeUnstageVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeMethodDescriptorSupplier("NodeUnstageVolume"))
                  .build();
          }
        }
     }
     return getNodeUnstageVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.NodePublishVolumeRequest,
      csi.v0.Csi.NodePublishVolumeResponse> getNodePublishVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NodePublishVolume",
      requestType = csi.v0.Csi.NodePublishVolumeRequest.class,
      responseType = csi.v0.Csi.NodePublishVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.NodePublishVolumeRequest,
      csi.v0.Csi.NodePublishVolumeResponse> getNodePublishVolumeMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.NodePublishVolumeRequest, csi.v0.Csi.NodePublishVolumeResponse> getNodePublishVolumeMethod;
    if ((getNodePublishVolumeMethod = NodeGrpc.getNodePublishVolumeMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getNodePublishVolumeMethod = NodeGrpc.getNodePublishVolumeMethod) == null) {
          NodeGrpc.getNodePublishVolumeMethod = getNodePublishVolumeMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.NodePublishVolumeRequest, csi.v0.Csi.NodePublishVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Node", "NodePublishVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodePublishVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodePublishVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeMethodDescriptorSupplier("NodePublishVolume"))
                  .build();
          }
        }
     }
     return getNodePublishVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.NodeUnpublishVolumeRequest,
      csi.v0.Csi.NodeUnpublishVolumeResponse> getNodeUnpublishVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NodeUnpublishVolume",
      requestType = csi.v0.Csi.NodeUnpublishVolumeRequest.class,
      responseType = csi.v0.Csi.NodeUnpublishVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.NodeUnpublishVolumeRequest,
      csi.v0.Csi.NodeUnpublishVolumeResponse> getNodeUnpublishVolumeMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.NodeUnpublishVolumeRequest, csi.v0.Csi.NodeUnpublishVolumeResponse> getNodeUnpublishVolumeMethod;
    if ((getNodeUnpublishVolumeMethod = NodeGrpc.getNodeUnpublishVolumeMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getNodeUnpublishVolumeMethod = NodeGrpc.getNodeUnpublishVolumeMethod) == null) {
          NodeGrpc.getNodeUnpublishVolumeMethod = getNodeUnpublishVolumeMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.NodeUnpublishVolumeRequest, csi.v0.Csi.NodeUnpublishVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Node", "NodeUnpublishVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeUnpublishVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeUnpublishVolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeMethodDescriptorSupplier("NodeUnpublishVolume"))
                  .build();
          }
        }
     }
     return getNodeUnpublishVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.NodeGetIdRequest,
      csi.v0.Csi.NodeGetIdResponse> getNodeGetIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NodeGetId",
      requestType = csi.v0.Csi.NodeGetIdRequest.class,
      responseType = csi.v0.Csi.NodeGetIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.NodeGetIdRequest,
      csi.v0.Csi.NodeGetIdResponse> getNodeGetIdMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.NodeGetIdRequest, csi.v0.Csi.NodeGetIdResponse> getNodeGetIdMethod;
    if ((getNodeGetIdMethod = NodeGrpc.getNodeGetIdMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getNodeGetIdMethod = NodeGrpc.getNodeGetIdMethod) == null) {
          NodeGrpc.getNodeGetIdMethod = getNodeGetIdMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.NodeGetIdRequest, csi.v0.Csi.NodeGetIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Node", "NodeGetId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeGetIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeGetIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeMethodDescriptorSupplier("NodeGetId"))
                  .build();
          }
        }
     }
     return getNodeGetIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.NodeGetCapabilitiesRequest,
      csi.v0.Csi.NodeGetCapabilitiesResponse> getNodeGetCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NodeGetCapabilities",
      requestType = csi.v0.Csi.NodeGetCapabilitiesRequest.class,
      responseType = csi.v0.Csi.NodeGetCapabilitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.NodeGetCapabilitiesRequest,
      csi.v0.Csi.NodeGetCapabilitiesResponse> getNodeGetCapabilitiesMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.NodeGetCapabilitiesRequest, csi.v0.Csi.NodeGetCapabilitiesResponse> getNodeGetCapabilitiesMethod;
    if ((getNodeGetCapabilitiesMethod = NodeGrpc.getNodeGetCapabilitiesMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getNodeGetCapabilitiesMethod = NodeGrpc.getNodeGetCapabilitiesMethod) == null) {
          NodeGrpc.getNodeGetCapabilitiesMethod = getNodeGetCapabilitiesMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.NodeGetCapabilitiesRequest, csi.v0.Csi.NodeGetCapabilitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Node", "NodeGetCapabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeGetCapabilitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeGetCapabilitiesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeMethodDescriptorSupplier("NodeGetCapabilities"))
                  .build();
          }
        }
     }
     return getNodeGetCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csi.v0.Csi.NodeGetInfoRequest,
      csi.v0.Csi.NodeGetInfoResponse> getNodeGetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NodeGetInfo",
      requestType = csi.v0.Csi.NodeGetInfoRequest.class,
      responseType = csi.v0.Csi.NodeGetInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csi.v0.Csi.NodeGetInfoRequest,
      csi.v0.Csi.NodeGetInfoResponse> getNodeGetInfoMethod() {
    io.grpc.MethodDescriptor<csi.v0.Csi.NodeGetInfoRequest, csi.v0.Csi.NodeGetInfoResponse> getNodeGetInfoMethod;
    if ((getNodeGetInfoMethod = NodeGrpc.getNodeGetInfoMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getNodeGetInfoMethod = NodeGrpc.getNodeGetInfoMethod) == null) {
          NodeGrpc.getNodeGetInfoMethod = getNodeGetInfoMethod = 
              io.grpc.MethodDescriptor.<csi.v0.Csi.NodeGetInfoRequest, csi.v0.Csi.NodeGetInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "csi.v0.Node", "NodeGetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeGetInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csi.v0.Csi.NodeGetInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NodeMethodDescriptorSupplier("NodeGetInfo"))
                  .build();
          }
        }
     }
     return getNodeGetInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NodeStub newStub(io.grpc.Channel channel) {
    return new NodeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NodeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NodeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NodeFutureStub(channel);
  }

  /**
   */
  public static abstract class NodeImplBase implements io.grpc.BindableService {

    /**
     */
    public void nodeStageVolume(csi.v0.Csi.NodeStageVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeStageVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNodeStageVolumeMethod(), responseObserver);
    }

    /**
     */
    public void nodeUnstageVolume(csi.v0.Csi.NodeUnstageVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeUnstageVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNodeUnstageVolumeMethod(), responseObserver);
    }

    /**
     */
    public void nodePublishVolume(csi.v0.Csi.NodePublishVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodePublishVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNodePublishVolumeMethod(), responseObserver);
    }

    /**
     */
    public void nodeUnpublishVolume(csi.v0.Csi.NodeUnpublishVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeUnpublishVolumeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNodeUnpublishVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * NodeGetId is being deprecated in favor of NodeGetInfo and will be
     * removed in CSI 1.0. Existing drivers, however, may depend on this
     * RPC call and hence this RPC call MUST be implemented by the CSI
     * plugin prior to v1.0.
     * </pre>
     */
    @java.lang.Deprecated
    public void nodeGetId(csi.v0.Csi.NodeGetIdRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeGetIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNodeGetIdMethod(), responseObserver);
    }

    /**
     */
    public void nodeGetCapabilities(csi.v0.Csi.NodeGetCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeGetCapabilitiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNodeGetCapabilitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Prior to CSI 1.0 - CSI plugins MUST implement both NodeGetId and
     * NodeGetInfo RPC calls.
     * </pre>
     */
    public void nodeGetInfo(csi.v0.Csi.NodeGetInfoRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeGetInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNodeGetInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNodeStageVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.NodeStageVolumeRequest,
                csi.v0.Csi.NodeStageVolumeResponse>(
                  this, METHODID_NODE_STAGE_VOLUME)))
          .addMethod(
            getNodeUnstageVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.NodeUnstageVolumeRequest,
                csi.v0.Csi.NodeUnstageVolumeResponse>(
                  this, METHODID_NODE_UNSTAGE_VOLUME)))
          .addMethod(
            getNodePublishVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.NodePublishVolumeRequest,
                csi.v0.Csi.NodePublishVolumeResponse>(
                  this, METHODID_NODE_PUBLISH_VOLUME)))
          .addMethod(
            getNodeUnpublishVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.NodeUnpublishVolumeRequest,
                csi.v0.Csi.NodeUnpublishVolumeResponse>(
                  this, METHODID_NODE_UNPUBLISH_VOLUME)))
          .addMethod(
            getNodeGetIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.NodeGetIdRequest,
                csi.v0.Csi.NodeGetIdResponse>(
                  this, METHODID_NODE_GET_ID)))
          .addMethod(
            getNodeGetCapabilitiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.NodeGetCapabilitiesRequest,
                csi.v0.Csi.NodeGetCapabilitiesResponse>(
                  this, METHODID_NODE_GET_CAPABILITIES)))
          .addMethod(
            getNodeGetInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                csi.v0.Csi.NodeGetInfoRequest,
                csi.v0.Csi.NodeGetInfoResponse>(
                  this, METHODID_NODE_GET_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class NodeStub extends io.grpc.stub.AbstractStub<NodeStub> {
    private NodeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeStub(channel, callOptions);
    }

    /**
     */
    public void nodeStageVolume(csi.v0.Csi.NodeStageVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeStageVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNodeStageVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nodeUnstageVolume(csi.v0.Csi.NodeUnstageVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeUnstageVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNodeUnstageVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nodePublishVolume(csi.v0.Csi.NodePublishVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodePublishVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNodePublishVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nodeUnpublishVolume(csi.v0.Csi.NodeUnpublishVolumeRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeUnpublishVolumeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNodeUnpublishVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NodeGetId is being deprecated in favor of NodeGetInfo and will be
     * removed in CSI 1.0. Existing drivers, however, may depend on this
     * RPC call and hence this RPC call MUST be implemented by the CSI
     * plugin prior to v1.0.
     * </pre>
     */
    @java.lang.Deprecated
    public void nodeGetId(csi.v0.Csi.NodeGetIdRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeGetIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNodeGetIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nodeGetCapabilities(csi.v0.Csi.NodeGetCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeGetCapabilitiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNodeGetCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Prior to CSI 1.0 - CSI plugins MUST implement both NodeGetId and
     * NodeGetInfo RPC calls.
     * </pre>
     */
    public void nodeGetInfo(csi.v0.Csi.NodeGetInfoRequest request,
        io.grpc.stub.StreamObserver<csi.v0.Csi.NodeGetInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNodeGetInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NodeBlockingStub extends io.grpc.stub.AbstractStub<NodeBlockingStub> {
    private NodeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeBlockingStub(channel, callOptions);
    }

    /**
     */
    public csi.v0.Csi.NodeStageVolumeResponse nodeStageVolume(csi.v0.Csi.NodeStageVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getNodeStageVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.NodeUnstageVolumeResponse nodeUnstageVolume(csi.v0.Csi.NodeUnstageVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getNodeUnstageVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.NodePublishVolumeResponse nodePublishVolume(csi.v0.Csi.NodePublishVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getNodePublishVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.NodeUnpublishVolumeResponse nodeUnpublishVolume(csi.v0.Csi.NodeUnpublishVolumeRequest request) {
      return blockingUnaryCall(
          getChannel(), getNodeUnpublishVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NodeGetId is being deprecated in favor of NodeGetInfo and will be
     * removed in CSI 1.0. Existing drivers, however, may depend on this
     * RPC call and hence this RPC call MUST be implemented by the CSI
     * plugin prior to v1.0.
     * </pre>
     */
    @java.lang.Deprecated
    public csi.v0.Csi.NodeGetIdResponse nodeGetId(csi.v0.Csi.NodeGetIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getNodeGetIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public csi.v0.Csi.NodeGetCapabilitiesResponse nodeGetCapabilities(csi.v0.Csi.NodeGetCapabilitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), getNodeGetCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Prior to CSI 1.0 - CSI plugins MUST implement both NodeGetId and
     * NodeGetInfo RPC calls.
     * </pre>
     */
    public csi.v0.Csi.NodeGetInfoResponse nodeGetInfo(csi.v0.Csi.NodeGetInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getNodeGetInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NodeFutureStub extends io.grpc.stub.AbstractStub<NodeFutureStub> {
    private NodeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NodeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NodeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.NodeStageVolumeResponse> nodeStageVolume(
        csi.v0.Csi.NodeStageVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNodeStageVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.NodeUnstageVolumeResponse> nodeUnstageVolume(
        csi.v0.Csi.NodeUnstageVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNodeUnstageVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.NodePublishVolumeResponse> nodePublishVolume(
        csi.v0.Csi.NodePublishVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNodePublishVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.NodeUnpublishVolumeResponse> nodeUnpublishVolume(
        csi.v0.Csi.NodeUnpublishVolumeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNodeUnpublishVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NodeGetId is being deprecated in favor of NodeGetInfo and will be
     * removed in CSI 1.0. Existing drivers, however, may depend on this
     * RPC call and hence this RPC call MUST be implemented by the CSI
     * plugin prior to v1.0.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.NodeGetIdResponse> nodeGetId(
        csi.v0.Csi.NodeGetIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNodeGetIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.NodeGetCapabilitiesResponse> nodeGetCapabilities(
        csi.v0.Csi.NodeGetCapabilitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNodeGetCapabilitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Prior to CSI 1.0 - CSI plugins MUST implement both NodeGetId and
     * NodeGetInfo RPC calls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<csi.v0.Csi.NodeGetInfoResponse> nodeGetInfo(
        csi.v0.Csi.NodeGetInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNodeGetInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NODE_STAGE_VOLUME = 0;
  private static final int METHODID_NODE_UNSTAGE_VOLUME = 1;
  private static final int METHODID_NODE_PUBLISH_VOLUME = 2;
  private static final int METHODID_NODE_UNPUBLISH_VOLUME = 3;
  private static final int METHODID_NODE_GET_ID = 4;
  private static final int METHODID_NODE_GET_CAPABILITIES = 5;
  private static final int METHODID_NODE_GET_INFO = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NodeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NodeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NODE_STAGE_VOLUME:
          serviceImpl.nodeStageVolume((csi.v0.Csi.NodeStageVolumeRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.NodeStageVolumeResponse>) responseObserver);
          break;
        case METHODID_NODE_UNSTAGE_VOLUME:
          serviceImpl.nodeUnstageVolume((csi.v0.Csi.NodeUnstageVolumeRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.NodeUnstageVolumeResponse>) responseObserver);
          break;
        case METHODID_NODE_PUBLISH_VOLUME:
          serviceImpl.nodePublishVolume((csi.v0.Csi.NodePublishVolumeRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.NodePublishVolumeResponse>) responseObserver);
          break;
        case METHODID_NODE_UNPUBLISH_VOLUME:
          serviceImpl.nodeUnpublishVolume((csi.v0.Csi.NodeUnpublishVolumeRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.NodeUnpublishVolumeResponse>) responseObserver);
          break;
        case METHODID_NODE_GET_ID:
          serviceImpl.nodeGetId((csi.v0.Csi.NodeGetIdRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.NodeGetIdResponse>) responseObserver);
          break;
        case METHODID_NODE_GET_CAPABILITIES:
          serviceImpl.nodeGetCapabilities((csi.v0.Csi.NodeGetCapabilitiesRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.NodeGetCapabilitiesResponse>) responseObserver);
          break;
        case METHODID_NODE_GET_INFO:
          serviceImpl.nodeGetInfo((csi.v0.Csi.NodeGetInfoRequest) request,
              (io.grpc.stub.StreamObserver<csi.v0.Csi.NodeGetInfoResponse>) responseObserver);
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

  private static abstract class NodeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return csi.v0.Csi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Node");
    }
  }

  private static final class NodeFileDescriptorSupplier
      extends NodeBaseDescriptorSupplier {
    NodeFileDescriptorSupplier() {}
  }

  private static final class NodeMethodDescriptorSupplier
      extends NodeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NodeMethodDescriptorSupplier(String methodName) {
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
      synchronized (NodeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NodeFileDescriptorSupplier())
              .addMethod(getNodeStageVolumeMethod())
              .addMethod(getNodeUnstageVolumeMethod())
              .addMethod(getNodePublishVolumeMethod())
              .addMethod(getNodeUnpublishVolumeMethod())
              .addMethod(getNodeGetIdMethod())
              .addMethod(getNodeGetCapabilitiesMethod())
              .addMethod(getNodeGetInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
