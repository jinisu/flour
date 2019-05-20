package com.rrkj.flour.authorize.api;

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
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: AuthorizeService.proto")
public final class PermissionGrpcServiceGrpc {

  private PermissionGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "PermissionGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId,
      com.rrkj.flour.authorize.api.TPermission> getQueryByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryById",
      requestType = com.rrkj.flour.authorize.api.TId.class,
      responseType = com.rrkj.flour.authorize.api.TPermission.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId,
      com.rrkj.flour.authorize.api.TPermission> getQueryByIdMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId, com.rrkj.flour.authorize.api.TPermission> getQueryByIdMethod;
    if ((getQueryByIdMethod = PermissionGrpcServiceGrpc.getQueryByIdMethod) == null) {
      synchronized (PermissionGrpcServiceGrpc.class) {
        if ((getQueryByIdMethod = PermissionGrpcServiceGrpc.getQueryByIdMethod) == null) {
          PermissionGrpcServiceGrpc.getQueryByIdMethod = getQueryByIdMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.authorize.api.TId, com.rrkj.flour.authorize.api.TPermission>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PermissionGrpcService", "queryById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.TId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.TPermission.getDefaultInstance()))
                  .setSchemaDescriptor(new PermissionGrpcServiceMethodDescriptorSupplier("queryById"))
                  .build();
          }
        }
     }
     return getQueryByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TIdAndString,
      com.rrkj.flour.authorize.api.ListTPermission> getQueryPermissionByRoleidAndAppKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryPermissionByRoleidAndAppKey",
      requestType = com.rrkj.flour.authorize.api.TIdAndString.class,
      responseType = com.rrkj.flour.authorize.api.ListTPermission.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TIdAndString,
      com.rrkj.flour.authorize.api.ListTPermission> getQueryPermissionByRoleidAndAppKeyMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TIdAndString, com.rrkj.flour.authorize.api.ListTPermission> getQueryPermissionByRoleidAndAppKeyMethod;
    if ((getQueryPermissionByRoleidAndAppKeyMethod = PermissionGrpcServiceGrpc.getQueryPermissionByRoleidAndAppKeyMethod) == null) {
      synchronized (PermissionGrpcServiceGrpc.class) {
        if ((getQueryPermissionByRoleidAndAppKeyMethod = PermissionGrpcServiceGrpc.getQueryPermissionByRoleidAndAppKeyMethod) == null) {
          PermissionGrpcServiceGrpc.getQueryPermissionByRoleidAndAppKeyMethod = getQueryPermissionByRoleidAndAppKeyMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.authorize.api.TIdAndString, com.rrkj.flour.authorize.api.ListTPermission>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PermissionGrpcService", "queryPermissionByRoleidAndAppKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.TIdAndString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.ListTPermission.getDefaultInstance()))
                  .setSchemaDescriptor(new PermissionGrpcServiceMethodDescriptorSupplier("queryPermissionByRoleidAndAppKey"))
                  .build();
          }
        }
     }
     return getQueryPermissionByRoleidAndAppKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId,
      com.rrkj.flour.authorize.api.ListTPermission> getQueryPermissionByRoleidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryPermissionByRoleid",
      requestType = com.rrkj.flour.authorize.api.TId.class,
      responseType = com.rrkj.flour.authorize.api.ListTPermission.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId,
      com.rrkj.flour.authorize.api.ListTPermission> getQueryPermissionByRoleidMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId, com.rrkj.flour.authorize.api.ListTPermission> getQueryPermissionByRoleidMethod;
    if ((getQueryPermissionByRoleidMethod = PermissionGrpcServiceGrpc.getQueryPermissionByRoleidMethod) == null) {
      synchronized (PermissionGrpcServiceGrpc.class) {
        if ((getQueryPermissionByRoleidMethod = PermissionGrpcServiceGrpc.getQueryPermissionByRoleidMethod) == null) {
          PermissionGrpcServiceGrpc.getQueryPermissionByRoleidMethod = getQueryPermissionByRoleidMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.authorize.api.TId, com.rrkj.flour.authorize.api.ListTPermission>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PermissionGrpcService", "queryPermissionByRoleid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.TId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.ListTPermission.getDefaultInstance()))
                  .setSchemaDescriptor(new PermissionGrpcServiceMethodDescriptorSupplier("queryPermissionByRoleid"))
                  .build();
          }
        }
     }
     return getQueryPermissionByRoleidMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PermissionGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new PermissionGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PermissionGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PermissionGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PermissionGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PermissionGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PermissionGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryById(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.TPermission> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryPermissionByRoleidAndAppKey(com.rrkj.flour.authorize.api.TIdAndString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryPermissionByRoleidAndAppKeyMethod(), responseObserver);
    }

    /**
     */
    public void queryPermissionByRoleid(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryPermissionByRoleidMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.authorize.api.TId,
                com.rrkj.flour.authorize.api.TPermission>(
                  this, METHODID_QUERY_BY_ID)))
          .addMethod(
            getQueryPermissionByRoleidAndAppKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.authorize.api.TIdAndString,
                com.rrkj.flour.authorize.api.ListTPermission>(
                  this, METHODID_QUERY_PERMISSION_BY_ROLEID_AND_APP_KEY)))
          .addMethod(
            getQueryPermissionByRoleidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.authorize.api.TId,
                com.rrkj.flour.authorize.api.ListTPermission>(
                  this, METHODID_QUERY_PERMISSION_BY_ROLEID)))
          .build();
    }
  }

  /**
   */
  public static final class PermissionGrpcServiceStub extends io.grpc.stub.AbstractStub<PermissionGrpcServiceStub> {
    private PermissionGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PermissionGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PermissionGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PermissionGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryById(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.TPermission> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPermissionByRoleidAndAppKey(com.rrkj.flour.authorize.api.TIdAndString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryPermissionByRoleidAndAppKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPermissionByRoleid(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryPermissionByRoleidMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PermissionGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<PermissionGrpcServiceBlockingStub> {
    private PermissionGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PermissionGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PermissionGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PermissionGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rrkj.flour.authorize.api.TPermission queryById(com.rrkj.flour.authorize.api.TId request) {
      return blockingUnaryCall(
          getChannel(), getQueryByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.authorize.api.ListTPermission queryPermissionByRoleidAndAppKey(com.rrkj.flour.authorize.api.TIdAndString request) {
      return blockingUnaryCall(
          getChannel(), getQueryPermissionByRoleidAndAppKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.authorize.api.ListTPermission queryPermissionByRoleid(com.rrkj.flour.authorize.api.TId request) {
      return blockingUnaryCall(
          getChannel(), getQueryPermissionByRoleidMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PermissionGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<PermissionGrpcServiceFutureStub> {
    private PermissionGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PermissionGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PermissionGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PermissionGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.authorize.api.TPermission> queryById(
        com.rrkj.flour.authorize.api.TId request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.authorize.api.ListTPermission> queryPermissionByRoleidAndAppKey(
        com.rrkj.flour.authorize.api.TIdAndString request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryPermissionByRoleidAndAppKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.authorize.api.ListTPermission> queryPermissionByRoleid(
        com.rrkj.flour.authorize.api.TId request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryPermissionByRoleidMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_BY_ID = 0;
  private static final int METHODID_QUERY_PERMISSION_BY_ROLEID_AND_APP_KEY = 1;
  private static final int METHODID_QUERY_PERMISSION_BY_ROLEID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PermissionGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PermissionGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_BY_ID:
          serviceImpl.queryById((com.rrkj.flour.authorize.api.TId) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.TPermission>) responseObserver);
          break;
        case METHODID_QUERY_PERMISSION_BY_ROLEID_AND_APP_KEY:
          serviceImpl.queryPermissionByRoleidAndAppKey((com.rrkj.flour.authorize.api.TIdAndString) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission>) responseObserver);
          break;
        case METHODID_QUERY_PERMISSION_BY_ROLEID:
          serviceImpl.queryPermissionByRoleid((com.rrkj.flour.authorize.api.TId) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission>) responseObserver);
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

  private static abstract class PermissionGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PermissionGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rrkj.flour.authorize.api.AuthorizeServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PermissionGrpcService");
    }
  }

  private static final class PermissionGrpcServiceFileDescriptorSupplier
      extends PermissionGrpcServiceBaseDescriptorSupplier {
    PermissionGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class PermissionGrpcServiceMethodDescriptorSupplier
      extends PermissionGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PermissionGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PermissionGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PermissionGrpcServiceFileDescriptorSupplier())
              .addMethod(getQueryByIdMethod())
              .addMethod(getQueryPermissionByRoleidAndAppKeyMethod())
              .addMethod(getQueryPermissionByRoleidMethod())
              .build();
        }
      }
    }
    return result;
  }
}
