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
public final class UserGrpcServiceGrpc {

  private UserGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "UserGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TString,
      com.rrkj.flour.user.api.TUser> getQueryByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryByUuid",
      requestType = com.rrkj.flour.user.api.TString.class,
      responseType = com.rrkj.flour.user.api.TUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TString,
      com.rrkj.flour.user.api.TUser> getQueryByUuidMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TString, com.rrkj.flour.user.api.TUser> getQueryByUuidMethod;
    if ((getQueryByUuidMethod = UserGrpcServiceGrpc.getQueryByUuidMethod) == null) {
      synchronized (UserGrpcServiceGrpc.class) {
        if ((getQueryByUuidMethod = UserGrpcServiceGrpc.getQueryByUuidMethod) == null) {
          UserGrpcServiceGrpc.getQueryByUuidMethod = getQueryByUuidMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TString, com.rrkj.flour.user.api.TUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserGrpcService", "QueryByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TUser.getDefaultInstance()))
                  .setSchemaDescriptor(new UserGrpcServiceMethodDescriptorSupplier("QueryByUuid"))
                  .build();
          }
        }
     }
     return getQueryByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TString,
      com.rrkj.flour.user.api.ListUser> getQueryByPhoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryByPhone",
      requestType = com.rrkj.flour.user.api.TString.class,
      responseType = com.rrkj.flour.user.api.ListUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TString,
      com.rrkj.flour.user.api.ListUser> getQueryByPhoneMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TString, com.rrkj.flour.user.api.ListUser> getQueryByPhoneMethod;
    if ((getQueryByPhoneMethod = UserGrpcServiceGrpc.getQueryByPhoneMethod) == null) {
      synchronized (UserGrpcServiceGrpc.class) {
        if ((getQueryByPhoneMethod = UserGrpcServiceGrpc.getQueryByPhoneMethod) == null) {
          UserGrpcServiceGrpc.getQueryByPhoneMethod = getQueryByPhoneMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TString, com.rrkj.flour.user.api.ListUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserGrpcService", "queryByPhone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.ListUser.getDefaultInstance()))
                  .setSchemaDescriptor(new UserGrpcServiceMethodDescriptorSupplier("queryByPhone"))
                  .build();
          }
        }
     }
     return getQueryByPhoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TId,
      com.rrkj.flour.user.api.TUser> getQueryByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryById",
      requestType = com.rrkj.flour.user.api.TId.class,
      responseType = com.rrkj.flour.user.api.TUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TId,
      com.rrkj.flour.user.api.TUser> getQueryByIdMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TId, com.rrkj.flour.user.api.TUser> getQueryByIdMethod;
    if ((getQueryByIdMethod = UserGrpcServiceGrpc.getQueryByIdMethod) == null) {
      synchronized (UserGrpcServiceGrpc.class) {
        if ((getQueryByIdMethod = UserGrpcServiceGrpc.getQueryByIdMethod) == null) {
          UserGrpcServiceGrpc.getQueryByIdMethod = getQueryByIdMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TId, com.rrkj.flour.user.api.TUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserGrpcService", "queryById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TUser.getDefaultInstance()))
                  .setSchemaDescriptor(new UserGrpcServiceMethodDescriptorSupplier("queryById"))
                  .build();
          }
        }
     }
     return getQueryByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUser,
      com.rrkj.flour.user.api.ListUser> getQueryByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryByUser",
      requestType = com.rrkj.flour.user.api.TUser.class,
      responseType = com.rrkj.flour.user.api.ListUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUser,
      com.rrkj.flour.user.api.ListUser> getQueryByUserMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUser, com.rrkj.flour.user.api.ListUser> getQueryByUserMethod;
    if ((getQueryByUserMethod = UserGrpcServiceGrpc.getQueryByUserMethod) == null) {
      synchronized (UserGrpcServiceGrpc.class) {
        if ((getQueryByUserMethod = UserGrpcServiceGrpc.getQueryByUserMethod) == null) {
          UserGrpcServiceGrpc.getQueryByUserMethod = getQueryByUserMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TUser, com.rrkj.flour.user.api.ListUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserGrpcService", "queryByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.ListUser.getDefaultInstance()))
                  .setSchemaDescriptor(new UserGrpcServiceMethodDescriptorSupplier("queryByUser"))
                  .build();
          }
        }
     }
     return getQueryByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TNameAndLabel,
      com.rrkj.flour.user.api.ListUser> getQueryByNameAndLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryByNameAndLabel",
      requestType = com.rrkj.flour.user.api.TNameAndLabel.class,
      responseType = com.rrkj.flour.user.api.ListUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TNameAndLabel,
      com.rrkj.flour.user.api.ListUser> getQueryByNameAndLabelMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TNameAndLabel, com.rrkj.flour.user.api.ListUser> getQueryByNameAndLabelMethod;
    if ((getQueryByNameAndLabelMethod = UserGrpcServiceGrpc.getQueryByNameAndLabelMethod) == null) {
      synchronized (UserGrpcServiceGrpc.class) {
        if ((getQueryByNameAndLabelMethod = UserGrpcServiceGrpc.getQueryByNameAndLabelMethod) == null) {
          UserGrpcServiceGrpc.getQueryByNameAndLabelMethod = getQueryByNameAndLabelMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TNameAndLabel, com.rrkj.flour.user.api.ListUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserGrpcService", "queryByNameAndLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TNameAndLabel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.ListUser.getDefaultInstance()))
                  .setSchemaDescriptor(new UserGrpcServiceMethodDescriptorSupplier("queryByNameAndLabel"))
                  .build();
          }
        }
     }
     return getQueryByNameAndLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUser,
      com.rrkj.flour.user.api.TUser> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.rrkj.flour.user.api.TUser.class,
      responseType = com.rrkj.flour.user.api.TUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUser,
      com.rrkj.flour.user.api.TUser> getCreateMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUser, com.rrkj.flour.user.api.TUser> getCreateMethod;
    if ((getCreateMethod = UserGrpcServiceGrpc.getCreateMethod) == null) {
      synchronized (UserGrpcServiceGrpc.class) {
        if ((getCreateMethod = UserGrpcServiceGrpc.getCreateMethod) == null) {
          UserGrpcServiceGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TUser, com.rrkj.flour.user.api.TUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserGrpcService", "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TUser.getDefaultInstance()))
                  .setSchemaDescriptor(new UserGrpcServiceMethodDescriptorSupplier("create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUser,
      com.rrkj.flour.user.api.TUser> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.rrkj.flour.user.api.TUser.class,
      responseType = com.rrkj.flour.user.api.TUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUser,
      com.rrkj.flour.user.api.TUser> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.user.api.TUser, com.rrkj.flour.user.api.TUser> getUpdateMethod;
    if ((getUpdateMethod = UserGrpcServiceGrpc.getUpdateMethod) == null) {
      synchronized (UserGrpcServiceGrpc.class) {
        if ((getUpdateMethod = UserGrpcServiceGrpc.getUpdateMethod) == null) {
          UserGrpcServiceGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TUser, com.rrkj.flour.user.api.TUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserGrpcService", "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TUser.getDefaultInstance()))
                  .setSchemaDescriptor(new UserGrpcServiceMethodDescriptorSupplier("update"))
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
    if ((getRemoveByIdMethod = UserGrpcServiceGrpc.getRemoveByIdMethod) == null) {
      synchronized (UserGrpcServiceGrpc.class) {
        if ((getRemoveByIdMethod = UserGrpcServiceGrpc.getRemoveByIdMethod) == null) {
          UserGrpcServiceGrpc.getRemoveByIdMethod = getRemoveByIdMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.user.api.TId, com.rrkj.flour.user.api.TRBool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserGrpcService", "removeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.user.api.TRBool.getDefaultInstance()))
                  .setSchemaDescriptor(new UserGrpcServiceMethodDescriptorSupplier("removeById"))
                  .build();
          }
        }
     }
     return getRemoveByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new UserGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryByUuid(com.rrkj.flour.user.api.TString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByUuidMethod(), responseObserver);
    }

    /**
     */
    public void queryByPhone(com.rrkj.flour.user.api.TString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListUser> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByPhoneMethod(), responseObserver);
    }

    /**
     */
    public void queryById(com.rrkj.flour.user.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByIdMethod(), responseObserver);
    }

    /**
     */
    public void queryByUser(com.rrkj.flour.user.api.TUser request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListUser> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByUserMethod(), responseObserver);
    }

    /**
     */
    public void queryByNameAndLabel(com.rrkj.flour.user.api.TNameAndLabel request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListUser> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryByNameAndLabelMethod(), responseObserver);
    }

    /**
     */
    public void create(com.rrkj.flour.user.api.TUser request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(com.rrkj.flour.user.api.TUser request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser> responseObserver) {
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
            getQueryByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TString,
                com.rrkj.flour.user.api.TUser>(
                  this, METHODID_QUERY_BY_UUID)))
          .addMethod(
            getQueryByPhoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TString,
                com.rrkj.flour.user.api.ListUser>(
                  this, METHODID_QUERY_BY_PHONE)))
          .addMethod(
            getQueryByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TId,
                com.rrkj.flour.user.api.TUser>(
                  this, METHODID_QUERY_BY_ID)))
          .addMethod(
            getQueryByUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TUser,
                com.rrkj.flour.user.api.ListUser>(
                  this, METHODID_QUERY_BY_USER)))
          .addMethod(
            getQueryByNameAndLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TNameAndLabel,
                com.rrkj.flour.user.api.ListUser>(
                  this, METHODID_QUERY_BY_NAME_AND_LABEL)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TUser,
                com.rrkj.flour.user.api.TUser>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.user.api.TUser,
                com.rrkj.flour.user.api.TUser>(
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
  public static final class UserGrpcServiceStub extends io.grpc.stub.AbstractStub<UserGrpcServiceStub> {
    private UserGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryByUuid(com.rrkj.flour.user.api.TString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryByPhone(com.rrkj.flour.user.api.TString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByPhoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryById(com.rrkj.flour.user.api.TId request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryByUser(com.rrkj.flour.user.api.TUser request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryByNameAndLabel(com.rrkj.flour.user.api.TNameAndLabel request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryByNameAndLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(com.rrkj.flour.user.api.TUser request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.rrkj.flour.user.api.TUser request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser> responseObserver) {
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
  public static final class UserGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<UserGrpcServiceBlockingStub> {
    private UserGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rrkj.flour.user.api.TUser queryByUuid(com.rrkj.flour.user.api.TString request) {
      return blockingUnaryCall(
          getChannel(), getQueryByUuidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.ListUser queryByPhone(com.rrkj.flour.user.api.TString request) {
      return blockingUnaryCall(
          getChannel(), getQueryByPhoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.TUser queryById(com.rrkj.flour.user.api.TId request) {
      return blockingUnaryCall(
          getChannel(), getQueryByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.ListUser queryByUser(com.rrkj.flour.user.api.TUser request) {
      return blockingUnaryCall(
          getChannel(), getQueryByUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.ListUser queryByNameAndLabel(com.rrkj.flour.user.api.TNameAndLabel request) {
      return blockingUnaryCall(
          getChannel(), getQueryByNameAndLabelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.TUser create(com.rrkj.flour.user.api.TUser request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.user.api.TUser update(com.rrkj.flour.user.api.TUser request) {
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
  public static final class UserGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<UserGrpcServiceFutureStub> {
    private UserGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.TUser> queryByUuid(
        com.rrkj.flour.user.api.TString request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByUuidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.ListUser> queryByPhone(
        com.rrkj.flour.user.api.TString request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByPhoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.TUser> queryById(
        com.rrkj.flour.user.api.TId request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.ListUser> queryByUser(
        com.rrkj.flour.user.api.TUser request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.ListUser> queryByNameAndLabel(
        com.rrkj.flour.user.api.TNameAndLabel request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryByNameAndLabelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.TUser> create(
        com.rrkj.flour.user.api.TUser request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.user.api.TUser> update(
        com.rrkj.flour.user.api.TUser request) {
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

  private static final int METHODID_QUERY_BY_UUID = 0;
  private static final int METHODID_QUERY_BY_PHONE = 1;
  private static final int METHODID_QUERY_BY_ID = 2;
  private static final int METHODID_QUERY_BY_USER = 3;
  private static final int METHODID_QUERY_BY_NAME_AND_LABEL = 4;
  private static final int METHODID_CREATE = 5;
  private static final int METHODID_UPDATE = 6;
  private static final int METHODID_REMOVE_BY_ID = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_BY_UUID:
          serviceImpl.queryByUuid((com.rrkj.flour.user.api.TString) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser>) responseObserver);
          break;
        case METHODID_QUERY_BY_PHONE:
          serviceImpl.queryByPhone((com.rrkj.flour.user.api.TString) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListUser>) responseObserver);
          break;
        case METHODID_QUERY_BY_ID:
          serviceImpl.queryById((com.rrkj.flour.user.api.TId) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser>) responseObserver);
          break;
        case METHODID_QUERY_BY_USER:
          serviceImpl.queryByUser((com.rrkj.flour.user.api.TUser) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListUser>) responseObserver);
          break;
        case METHODID_QUERY_BY_NAME_AND_LABEL:
          serviceImpl.queryByNameAndLabel((com.rrkj.flour.user.api.TNameAndLabel) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.ListUser>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.rrkj.flour.user.api.TUser) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.rrkj.flour.user.api.TUser) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.user.api.TUser>) responseObserver);
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

  private static abstract class UserGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rrkj.flour.user.api.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserGrpcService");
    }
  }

  private static final class UserGrpcServiceFileDescriptorSupplier
      extends UserGrpcServiceBaseDescriptorSupplier {
    UserGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class UserGrpcServiceMethodDescriptorSupplier
      extends UserGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserGrpcServiceFileDescriptorSupplier())
              .addMethod(getQueryByUuidMethod())
              .addMethod(getQueryByPhoneMethod())
              .addMethod(getQueryByIdMethod())
              .addMethod(getQueryByUserMethod())
              .addMethod(getQueryByNameAndLabelMethod())
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
