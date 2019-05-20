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
public final class RoleGrpcServiceGrpc {

  private RoleGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "RoleGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId,
      com.rrkj.flour.authorize.api.TRole> getQueryByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryById",
      requestType = com.rrkj.flour.authorize.api.TId.class,
      responseType = com.rrkj.flour.authorize.api.TRole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId,
      com.rrkj.flour.authorize.api.TRole> getQueryByIdMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId, com.rrkj.flour.authorize.api.TRole> getQueryByIdMethod;
    if ((getQueryByIdMethod = RoleGrpcServiceGrpc.getQueryByIdMethod) == null) {
      synchronized (RoleGrpcServiceGrpc.class) {
        if ((getQueryByIdMethod = RoleGrpcServiceGrpc.getQueryByIdMethod) == null) {
          RoleGrpcServiceGrpc.getQueryByIdMethod = getQueryByIdMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.authorize.api.TId, com.rrkj.flour.authorize.api.TRole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RoleGrpcService", "queryById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.TId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.TRole.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleGrpcServiceMethodDescriptorSupplier("queryById"))
                  .build();
          }
        }
     }
     return getQueryByIdMethod;
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
    if ((getQueryPermissionByRoleidMethod = RoleGrpcServiceGrpc.getQueryPermissionByRoleidMethod) == null) {
      synchronized (RoleGrpcServiceGrpc.class) {
        if ((getQueryPermissionByRoleidMethod = RoleGrpcServiceGrpc.getQueryPermissionByRoleidMethod) == null) {
          RoleGrpcServiceGrpc.getQueryPermissionByRoleidMethod = getQueryPermissionByRoleidMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.authorize.api.TId, com.rrkj.flour.authorize.api.ListTPermission>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RoleGrpcService", "queryPermissionByRoleid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.TId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.ListTPermission.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleGrpcServiceMethodDescriptorSupplier("queryPermissionByRoleid"))
                  .build();
          }
        }
     }
     return getQueryPermissionByRoleidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId,
      com.rrkj.flour.authorize.api.ListTRole> getQueryByUseridMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryByUserid",
      requestType = com.rrkj.flour.authorize.api.TId.class,
      responseType = com.rrkj.flour.authorize.api.ListTRole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId,
      com.rrkj.flour.authorize.api.ListTRole> getQueryByUseridMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.authorize.api.TId, com.rrkj.flour.authorize.api.ListTRole> getQueryByUseridMethod;
    if ((getQueryByUseridMethod = RoleGrpcServiceGrpc.getQueryByUseridMethod) == null) {
      synchronized (RoleGrpcServiceGrpc.class) {
        if ((getQueryByUseridMethod = RoleGrpcServiceGrpc.getQueryByUseridMethod) == null) {
          RoleGrpcServiceGrpc.getQueryByUseridMethod = getQueryByUseridMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.authorize.api.TId, com.rrkj.flour.authorize.api.ListTRole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RoleGrpcService", "queryByUserid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.TId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.authorize.api.ListTRole.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleGrpcServiceMethodDescriptorSupplier("queryByUserid"))
                  .build();
          }
        }
     }
     return getQueryByUseridMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new RoleGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RoleGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RoleGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RoleGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryById(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.TRole> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryPermissionByRoleid(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryPermissionByRoleidMethod(), responseObserver);
    }

    /**
     */
    public void queryByUserid(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTRole> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByUseridMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.authorize.api.TId,
                com.rrkj.flour.authorize.api.TRole>(
                  this, METHODID_QUERY_BY_ID)))
          .addMethod(
            getQueryPermissionByRoleidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.authorize.api.TId,
                com.rrkj.flour.authorize.api.ListTPermission>(
                  this, METHODID_QUERY_PERMISSION_BY_ROLEID)))
          .addMethod(
            getQueryByUseridMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.authorize.api.TId,
                com.rrkj.flour.authorize.api.ListTRole>(
                  this, METHODID_QUERY_BY_USERID)))
          .build();
    }
  }

  /**
   */
  public static final class RoleGrpcServiceStub extends io.grpc.stub.AbstractStub<RoleGrpcServiceStub> {
    private RoleGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryById(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.TRole> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPermissionByRoleid(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryPermissionByRoleidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryByUserid(com.rrkj.flour.authorize.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTRole> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByUseridMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RoleGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<RoleGrpcServiceBlockingStub> {
    private RoleGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rrkj.flour.authorize.api.TRole queryById(com.rrkj.flour.authorize.api.TId request) {
      return blockingUnaryCall(
          getChannel(), getQueryByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.authorize.api.ListTPermission queryPermissionByRoleid(com.rrkj.flour.authorize.api.TId request) {
      return blockingUnaryCall(
          getChannel(), getQueryPermissionByRoleidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.authorize.api.ListTRole queryByUserid(com.rrkj.flour.authorize.api.TId request) {
      return blockingUnaryCall(
          getChannel(), getQueryByUseridMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RoleGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<RoleGrpcServiceFutureStub> {
    private RoleGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.authorize.api.TRole> queryById(
        com.rrkj.flour.authorize.api.TId request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.authorize.api.ListTPermission> queryPermissionByRoleid(
        com.rrkj.flour.authorize.api.TId request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryPermissionByRoleidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.authorize.api.ListTRole> queryByUserid(
        com.rrkj.flour.authorize.api.TId request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByUseridMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_BY_ID = 0;
  private static final int METHODID_QUERY_PERMISSION_BY_ROLEID = 1;
  private static final int METHODID_QUERY_BY_USERID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoleGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_BY_ID:
          serviceImpl.queryById((com.rrkj.flour.authorize.api.TId) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.TRole>) responseObserver);
          break;
        case METHODID_QUERY_PERMISSION_BY_ROLEID:
          serviceImpl.queryPermissionByRoleid((com.rrkj.flour.authorize.api.TId) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission>) responseObserver);
          break;
        case METHODID_QUERY_BY_USERID:
          serviceImpl.queryByUserid((com.rrkj.flour.authorize.api.TId) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTRole>) responseObserver);
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

  private static abstract class RoleGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rrkj.flour.authorize.api.AuthorizeServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleGrpcService");
    }
  }

  private static final class RoleGrpcServiceFileDescriptorSupplier
      extends RoleGrpcServiceBaseDescriptorSupplier {
    RoleGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class RoleGrpcServiceMethodDescriptorSupplier
      extends RoleGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleGrpcServiceFileDescriptorSupplier())
              .addMethod(getQueryByIdMethod())
              .addMethod(getQueryPermissionByRoleidMethod())
              .addMethod(getQueryByUseridMethod())
              .build();
        }
      }
    }
    return result;
  }
}
