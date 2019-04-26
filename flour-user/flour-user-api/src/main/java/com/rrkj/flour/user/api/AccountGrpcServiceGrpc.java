package com.rrkj.flour.user.api;

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
    comments = "Source: UserService.proto")
public final class AccountGrpcServiceGrpc {

  private AccountGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "AccountGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TString,
      com.rrkj.flour.user.api.ListAccount> getQueryByUidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryByUid",
      requestType = com.rrkj.flour.user.api.TString.class,
      responseType = com.rrkj.flour.user.api.ListAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TString,
      com.rrkj.flour.user.api.ListAccount> getQueryByUidMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TString, com.rrkj.flour.user.api.ListAccount> getQueryByUidMethod;
    if ((getQueryByUidMethod = AccountGrpcServiceGrpc.getQueryByUidMethod) == null) {
      synchronized (AccountGrpcServiceGrpc.class) {
        if ((getQueryByUidMethod = AccountGrpcServiceGrpc.getQueryByUidMethod) == null) {
          AccountGrpcServiceGrpc.getQueryByUidMethod = getQueryByUidMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TString, com.rrkj.flour.user.api.ListAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AccountGrpcService", "queryByUid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.ListAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountGrpcServiceMethodDescriptorSupplier("queryByUid"))
                  .build();
          }
        }
     }
     return getQueryByUidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TId,
      com.rrkj.flour.user.api.ListAccount> getQueryByUseridMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryByUserid",
      requestType = com.rrkj.flour.user.api.TId.class,
      responseType = com.rrkj.flour.user.api.ListAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TId,
      com.rrkj.flour.user.api.ListAccount> getQueryByUseridMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TId, com.rrkj.flour.user.api.ListAccount> getQueryByUseridMethod;
    if ((getQueryByUseridMethod = AccountGrpcServiceGrpc.getQueryByUseridMethod) == null) {
      synchronized (AccountGrpcServiceGrpc.class) {
        if ((getQueryByUseridMethod = AccountGrpcServiceGrpc.getQueryByUseridMethod) == null) {
          AccountGrpcServiceGrpc.getQueryByUseridMethod = getQueryByUseridMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TId, com.rrkj.flour.user.api.ListAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AccountGrpcService", "queryByUserid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.ListAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountGrpcServiceMethodDescriptorSupplier("queryByUserid"))
                  .build();
          }
        }
     }
     return getQueryByUseridMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUseridAndType,
      com.rrkj.flour.user.api.ListAccount> getQueryByUseridAndTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryByUseridAndType",
      requestType = com.rrkj.flour.user.api.TUseridAndType.class,
      responseType = com.rrkj.flour.user.api.ListAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUseridAndType,
      com.rrkj.flour.user.api.ListAccount> getQueryByUseridAndTypeMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUseridAndType, com.rrkj.flour.user.api.ListAccount> getQueryByUseridAndTypeMethod;
    if ((getQueryByUseridAndTypeMethod = AccountGrpcServiceGrpc.getQueryByUseridAndTypeMethod) == null) {
      synchronized (AccountGrpcServiceGrpc.class) {
        if ((getQueryByUseridAndTypeMethod = AccountGrpcServiceGrpc.getQueryByUseridAndTypeMethod) == null) {
          AccountGrpcServiceGrpc.getQueryByUseridAndTypeMethod = getQueryByUseridAndTypeMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TUseridAndType, com.rrkj.flour.user.api.ListAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AccountGrpcService", "queryByUseridAndType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TUseridAndType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.ListAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountGrpcServiceMethodDescriptorSupplier("queryByUseridAndType"))
                  .build();
          }
        }
     }
     return getQueryByUseridAndTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TAccount,
      com.rrkj.flour.user.api.TAccount> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.rrkj.flour.user.api.TAccount.class,
      responseType = com.rrkj.flour.user.api.TAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TAccount,
      com.rrkj.flour.user.api.TAccount> getCreateMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TAccount, com.rrkj.flour.user.api.TAccount> getCreateMethod;
    if ((getCreateMethod = AccountGrpcServiceGrpc.getCreateMethod) == null) {
      synchronized (AccountGrpcServiceGrpc.class) {
        if ((getCreateMethod = AccountGrpcServiceGrpc.getCreateMethod) == null) {
          AccountGrpcServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TAccount, com.rrkj.flour.user.api.TAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AccountGrpcService", "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountGrpcServiceMethodDescriptorSupplier("create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TAccount,
      com.rrkj.flour.user.api.TAccount> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.rrkj.flour.user.api.TAccount.class,
      responseType = com.rrkj.flour.user.api.TAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TAccount,
      com.rrkj.flour.user.api.TAccount> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TAccount, com.rrkj.flour.user.api.TAccount> getUpdateMethod;
    if ((getUpdateMethod = AccountGrpcServiceGrpc.getUpdateMethod) == null) {
      synchronized (AccountGrpcServiceGrpc.class) {
        if ((getUpdateMethod = AccountGrpcServiceGrpc.getUpdateMethod) == null) {
          AccountGrpcServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TAccount, com.rrkj.flour.user.api.TAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AccountGrpcService", "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountGrpcServiceMethodDescriptorSupplier("update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TId,
      com.rrkj.flour.user.api.TRBool> getRemoveByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeById",
      requestType = com.rrkj.flour.user.api.TId.class,
      responseType = com.rrkj.flour.user.api.TRBool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TId,
      com.rrkj.flour.user.api.TRBool> getRemoveByIdMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TId, com.rrkj.flour.user.api.TRBool> getRemoveByIdMethod;
    if ((getRemoveByIdMethod = AccountGrpcServiceGrpc.getRemoveByIdMethod) == null) {
      synchronized (AccountGrpcServiceGrpc.class) {
        if ((getRemoveByIdMethod = AccountGrpcServiceGrpc.getRemoveByIdMethod) == null) {
          AccountGrpcServiceGrpc.getRemoveByIdMethod = getRemoveByIdMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TId, com.rrkj.flour.user.api.TRBool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AccountGrpcService", "removeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TRBool.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountGrpcServiceMethodDescriptorSupplier("removeById"))
                  .build();
          }
        }
     }
     return getRemoveByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new AccountGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryByUid(com.rrkj.flour.user.api.TString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByUidMethod(), responseObserver);
    }

    /**
     */
    public void queryByUserid(com.rrkj.flour.user.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByUseridMethod(), responseObserver);
    }

    /**
     */
    public void queryByUseridAndType(com.rrkj.flour.user.api.TUseridAndType request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByUseridAndTypeMethod(), responseObserver);
    }

    /**
     */
    public void create(com.rrkj.flour.user.api.TAccount request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(com.rrkj.flour.user.api.TAccount request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void removeById(com.rrkj.flour.user.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TRBool> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryByUidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TString,
                com.rrkj.flour.user.api.ListAccount>(
                  this, METHODID_QUERY_BY_UID)))
          .addMethod(
            getQueryByUseridMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TId,
                com.rrkj.flour.user.api.ListAccount>(
                  this, METHODID_QUERY_BY_USERID)))
          .addMethod(
            getQueryByUseridAndTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TUseridAndType,
                com.rrkj.flour.user.api.ListAccount>(
                  this, METHODID_QUERY_BY_USERID_AND_TYPE)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TAccount,
                com.rrkj.flour.user.api.TAccount>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TAccount,
                com.rrkj.flour.user.api.TAccount>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getRemoveByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TId,
                com.rrkj.flour.user.api.TRBool>(
                  this, METHODID_REMOVE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class AccountGrpcServiceStub extends io.grpc.stub.AbstractStub<AccountGrpcServiceStub> {
    private AccountGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryByUid(com.rrkj.flour.user.api.TString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByUidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryByUserid(com.rrkj.flour.user.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByUseridMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryByUseridAndType(com.rrkj.flour.user.api.TUseridAndType request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByUseridAndTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.rrkj.flour.user.api.TAccount request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.rrkj.flour.user.api.TAccount request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeById(com.rrkj.flour.user.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TRBool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountGrpcServiceBlockingStub> {
    private AccountGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rrkj.flour.user.api.ListAccount queryByUid(com.rrkj.flour.user.api.TString request) {
      return blockingUnaryCall(
          getChannel(), getQueryByUidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.ListAccount queryByUserid(com.rrkj.flour.user.api.TId request) {
      return blockingUnaryCall(
          getChannel(), getQueryByUseridMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.ListAccount queryByUseridAndType(com.rrkj.flour.user.api.TUseridAndType request) {
      return blockingUnaryCall(
          getChannel(), getQueryByUseridAndTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.TAccount create(com.rrkj.flour.user.api.TAccount request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.TAccount update(com.rrkj.flour.user.api.TAccount request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.TRBool removeById(com.rrkj.flour.user.api.TId request) {
      return blockingUnaryCall(
          getChannel(), getRemoveByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<AccountGrpcServiceFutureStub> {
    private AccountGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.ListAccount> queryByUid(
        com.rrkj.flour.user.api.TString request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByUidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.ListAccount> queryByUserid(
        com.rrkj.flour.user.api.TId request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByUseridMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.ListAccount> queryByUseridAndType(
        com.rrkj.flour.user.api.TUseridAndType request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByUseridAndTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.TAccount> create(
        com.rrkj.flour.user.api.TAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.TAccount> update(
        com.rrkj.flour.user.api.TAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.TRBool> removeById(
        com.rrkj.flour.user.api.TId request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_BY_UID = 0;
  private static final int METHODID_QUERY_BY_USERID = 1;
  private static final int METHODID_QUERY_BY_USERID_AND_TYPE = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_REMOVE_BY_ID = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_BY_UID:
          serviceImpl.queryByUid((com.rrkj.flour.user.api.TString) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListAccount>) responseObserver);
          break;
        case METHODID_QUERY_BY_USERID:
          serviceImpl.queryByUserid((com.rrkj.flour.user.api.TId) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListAccount>) responseObserver);
          break;
        case METHODID_QUERY_BY_USERID_AND_TYPE:
          serviceImpl.queryByUseridAndType((com.rrkj.flour.user.api.TUseridAndType) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListAccount>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.rrkj.flour.user.api.TAccount) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TAccount>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.rrkj.flour.user.api.TAccount) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TAccount>) responseObserver);
          break;
        case METHODID_REMOVE_BY_ID:
          serviceImpl.removeById((com.rrkj.flour.user.api.TId) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TRBool>) responseObserver);
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

  private static abstract class AccountGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rrkj.flour.user.api.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountGrpcService");
    }
  }

  private static final class AccountGrpcServiceFileDescriptorSupplier
      extends AccountGrpcServiceBaseDescriptorSupplier {
    AccountGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class AccountGrpcServiceMethodDescriptorSupplier
      extends AccountGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountGrpcServiceFileDescriptorSupplier())
              .addMethod(getQueryByUidMethod())
              .addMethod(getQueryByUseridMethod())
              .addMethod(getQueryByUseridAndTypeMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getRemoveByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
