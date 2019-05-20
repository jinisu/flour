package com.rrkj.flour.oauth2.api;

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
    comments = "Source: Oauth2Service.proto")
public final class LoginGrpcServiceGrpc {

  private LoginGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "LoginGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.oauth2.api.TString,
      com.rrkj.flour.oauth2.api.TLoginResponse> getCheckAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkAccessToken",
      requestType = com.rrkj.flour.oauth2.api.TString.class,
      responseType = com.rrkj.flour.oauth2.api.TLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.oauth2.api.TString,
      com.rrkj.flour.oauth2.api.TLoginResponse> getCheckAccessTokenMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.oauth2.api.TString, com.rrkj.flour.oauth2.api.TLoginResponse> getCheckAccessTokenMethod;
    if ((getCheckAccessTokenMethod = LoginGrpcServiceGrpc.getCheckAccessTokenMethod) == null) {
      synchronized (LoginGrpcServiceGrpc.class) {
        if ((getCheckAccessTokenMethod = LoginGrpcServiceGrpc.getCheckAccessTokenMethod) == null) {
          LoginGrpcServiceGrpc.getCheckAccessTokenMethod = getCheckAccessTokenMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.oauth2.api.TString, com.rrkj.flour.oauth2.api.TLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LoginGrpcService", "checkAccessToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.oauth2.api.TString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.oauth2.api.TLoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginGrpcServiceMethodDescriptorSupplier("checkAccessToken"))
                  .build();
          }
        }
     }
     return getCheckAccessTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rrkj.flour.oauth2.api.LoginRequest,
      com.rrkj.flour.oauth2.api.TLoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.rrkj.flour.oauth2.api.LoginRequest.class,
      responseType = com.rrkj.flour.oauth2.api.TLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rrkj.flour.oauth2.api.LoginRequest,
      com.rrkj.flour.oauth2.api.TLoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.rrkj.flour.oauth2.api.LoginRequest, com.rrkj.flour.oauth2.api.TLoginResponse> getLoginMethod;
    if ((getLoginMethod = LoginGrpcServiceGrpc.getLoginMethod) == null) {
      synchronized (LoginGrpcServiceGrpc.class) {
        if ((getLoginMethod = LoginGrpcServiceGrpc.getLoginMethod) == null) {
          LoginGrpcServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.rrkj.flour.oauth2.api.LoginRequest, com.rrkj.flour.oauth2.api.TLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LoginGrpcService", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.oauth2.api.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rrkj.flour.oauth2.api.TLoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginGrpcServiceMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoginGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new LoginGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoginGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LoginGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoginGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LoginGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LoginGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkAccessToken(com.rrkj.flour.oauth2.api.TString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.oauth2.api.TLoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckAccessTokenMethod(), responseObserver);
    }

    /**
     */
    public void login(com.rrkj.flour.oauth2.api.LoginRequest request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.oauth2.api.TLoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckAccessTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.oauth2.api.TString,
                com.rrkj.flour.oauth2.api.TLoginResponse>(
                  this, METHODID_CHECK_ACCESS_TOKEN)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rrkj.flour.oauth2.api.LoginRequest,
                com.rrkj.flour.oauth2.api.TLoginResponse>(
                  this, METHODID_LOGIN)))
          .build();
    }
  }

  /**
   */
  public static final class LoginGrpcServiceStub extends io.grpc.stub.AbstractStub<LoginGrpcServiceStub> {
    private LoginGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkAccessToken(com.rrkj.flour.oauth2.api.TString request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.oauth2.api.TLoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.rrkj.flour.oauth2.api.LoginRequest request,
        io.grpc.stub.StreamObserver<com.rrkj.flour.oauth2.api.TLoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LoginGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<LoginGrpcServiceBlockingStub> {
    private LoginGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rrkj.flour.oauth2.api.TLoginResponse checkAccessToken(com.rrkj.flour.oauth2.api.TString request) {
      return blockingUnaryCall(
          getChannel(), getCheckAccessTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rrkj.flour.oauth2.api.TLoginResponse login(com.rrkj.flour.oauth2.api.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LoginGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<LoginGrpcServiceFutureStub> {
    private LoginGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.oauth2.api.TLoginResponse> checkAccessToken(
        com.rrkj.flour.oauth2.api.TString request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckAccessTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rrkj.flour.oauth2.api.TLoginResponse> login(
        com.rrkj.flour.oauth2.api.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_ACCESS_TOKEN = 0;
  private static final int METHODID_LOGIN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoginGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoginGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_ACCESS_TOKEN:
          serviceImpl.checkAccessToken((com.rrkj.flour.oauth2.api.TString) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.oauth2.api.TLoginResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.rrkj.flour.oauth2.api.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.rrkj.flour.oauth2.api.TLoginResponse>) responseObserver);
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

  private static abstract class LoginGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoginGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rrkj.flour.oauth2.api.Oauth2ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoginGrpcService");
    }
  }

  private static final class LoginGrpcServiceFileDescriptorSupplier
      extends LoginGrpcServiceBaseDescriptorSupplier {
    LoginGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class LoginGrpcServiceMethodDescriptorSupplier
      extends LoginGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoginGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LoginGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoginGrpcServiceFileDescriptorSupplier())
              .addMethod(getCheckAccessTokenMethod())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
