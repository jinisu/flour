// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserService.proto

package com.rrkj.flour.user.api;

/**
 * Protobuf service {@code UserGrpcService}
 */
public  abstract class UserGrpcService
    implements com.google.protobuf.Service {
  protected UserGrpcService() {}

  public interface Interface {
    /**
     * <code>rpc QueryByUuid(.TString) returns (.TUser);</code>
     */
    public abstract void queryByUuid(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TString request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done);

    /**
     * <code>rpc queryByPhone(.TString) returns (.ListUser);</code>
     */
    public abstract void queryByPhone(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TString request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done);

    /**
     * <code>rpc queryById(.TId) returns (.TUser);</code>
     */
    public abstract void queryById(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TId request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done);

    /**
     * <code>rpc queryByUser(.TUser) returns (.ListUser);</code>
     */
    public abstract void queryByUser(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done);

    /**
     * <code>rpc queryByNameAndLabel(.TNameAndLabel) returns (.ListUser);</code>
     */
    public abstract void queryByNameAndLabel(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TNameAndLabel request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done);

    /**
     * <code>rpc create(.TUser) returns (.TUser);</code>
     */
    public abstract void create(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done);

    /**
     * <code>rpc update(.TUser) returns (.TUser);</code>
     */
    public abstract void update(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done);

    /**
     * <code>rpc removeById(.TId) returns (.TRBool);</code>
     */
    public abstract void removeById(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TId request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TRBool> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new UserGrpcService() {
      @java.lang.Override
      public  void queryByUuid(
          com.google.protobuf.RpcController controller,
          com.rrkj.flour.user.api.TString request,
          com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done) {
        impl.queryByUuid(controller, request, done);
      }

      @java.lang.Override
      public  void queryByPhone(
          com.google.protobuf.RpcController controller,
          com.rrkj.flour.user.api.TString request,
          com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done) {
        impl.queryByPhone(controller, request, done);
      }

      @java.lang.Override
      public  void queryById(
          com.google.protobuf.RpcController controller,
          com.rrkj.flour.user.api.TId request,
          com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done) {
        impl.queryById(controller, request, done);
      }

      @java.lang.Override
      public  void queryByUser(
          com.google.protobuf.RpcController controller,
          com.rrkj.flour.user.api.TUser request,
          com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done) {
        impl.queryByUser(controller, request, done);
      }

      @java.lang.Override
      public  void queryByNameAndLabel(
          com.google.protobuf.RpcController controller,
          com.rrkj.flour.user.api.TNameAndLabel request,
          com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done) {
        impl.queryByNameAndLabel(controller, request, done);
      }

      @java.lang.Override
      public  void create(
          com.google.protobuf.RpcController controller,
          com.rrkj.flour.user.api.TUser request,
          com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done) {
        impl.create(controller, request, done);
      }

      @java.lang.Override
      public  void update(
          com.google.protobuf.RpcController controller,
          com.rrkj.flour.user.api.TUser request,
          com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done) {
        impl.update(controller, request, done);
      }

      @java.lang.Override
      public  void removeById(
          com.google.protobuf.RpcController controller,
          com.rrkj.flour.user.api.TId request,
          com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TRBool> done) {
        impl.removeById(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.queryByUuid(controller, (com.rrkj.flour.user.api.TString)request);
          case 1:
            return impl.queryByPhone(controller, (com.rrkj.flour.user.api.TString)request);
          case 2:
            return impl.queryById(controller, (com.rrkj.flour.user.api.TId)request);
          case 3:
            return impl.queryByUser(controller, (com.rrkj.flour.user.api.TUser)request);
          case 4:
            return impl.queryByNameAndLabel(controller, (com.rrkj.flour.user.api.TNameAndLabel)request);
          case 5:
            return impl.create(controller, (com.rrkj.flour.user.api.TUser)request);
          case 6:
            return impl.update(controller, (com.rrkj.flour.user.api.TUser)request);
          case 7:
            return impl.removeById(controller, (com.rrkj.flour.user.api.TId)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.rrkj.flour.user.api.TString.getDefaultInstance();
          case 1:
            return com.rrkj.flour.user.api.TString.getDefaultInstance();
          case 2:
            return com.rrkj.flour.user.api.TId.getDefaultInstance();
          case 3:
            return com.rrkj.flour.user.api.TUser.getDefaultInstance();
          case 4:
            return com.rrkj.flour.user.api.TNameAndLabel.getDefaultInstance();
          case 5:
            return com.rrkj.flour.user.api.TUser.getDefaultInstance();
          case 6:
            return com.rrkj.flour.user.api.TUser.getDefaultInstance();
          case 7:
            return com.rrkj.flour.user.api.TId.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.rrkj.flour.user.api.TUser.getDefaultInstance();
          case 1:
            return com.rrkj.flour.user.api.ListUser.getDefaultInstance();
          case 2:
            return com.rrkj.flour.user.api.TUser.getDefaultInstance();
          case 3:
            return com.rrkj.flour.user.api.ListUser.getDefaultInstance();
          case 4:
            return com.rrkj.flour.user.api.ListUser.getDefaultInstance();
          case 5:
            return com.rrkj.flour.user.api.TUser.getDefaultInstance();
          case 6:
            return com.rrkj.flour.user.api.TUser.getDefaultInstance();
          case 7:
            return com.rrkj.flour.user.api.TRBool.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc QueryByUuid(.TString) returns (.TUser);</code>
   */
  public abstract void queryByUuid(
      com.google.protobuf.RpcController controller,
      com.rrkj.flour.user.api.TString request,
      com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done);

  /**
   * <code>rpc queryByPhone(.TString) returns (.ListUser);</code>
   */
  public abstract void queryByPhone(
      com.google.protobuf.RpcController controller,
      com.rrkj.flour.user.api.TString request,
      com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done);

  /**
   * <code>rpc queryById(.TId) returns (.TUser);</code>
   */
  public abstract void queryById(
      com.google.protobuf.RpcController controller,
      com.rrkj.flour.user.api.TId request,
      com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done);

  /**
   * <code>rpc queryByUser(.TUser) returns (.ListUser);</code>
   */
  public abstract void queryByUser(
      com.google.protobuf.RpcController controller,
      com.rrkj.flour.user.api.TUser request,
      com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done);

  /**
   * <code>rpc queryByNameAndLabel(.TNameAndLabel) returns (.ListUser);</code>
   */
  public abstract void queryByNameAndLabel(
      com.google.protobuf.RpcController controller,
      com.rrkj.flour.user.api.TNameAndLabel request,
      com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done);

  /**
   * <code>rpc create(.TUser) returns (.TUser);</code>
   */
  public abstract void create(
      com.google.protobuf.RpcController controller,
      com.rrkj.flour.user.api.TUser request,
      com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done);

  /**
   * <code>rpc update(.TUser) returns (.TUser);</code>
   */
  public abstract void update(
      com.google.protobuf.RpcController controller,
      com.rrkj.flour.user.api.TUser request,
      com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done);

  /**
   * <code>rpc removeById(.TId) returns (.TRBool);</code>
   */
  public abstract void removeById(
      com.google.protobuf.RpcController controller,
      com.rrkj.flour.user.api.TId request,
      com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TRBool> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.rrkj.flour.user.api.UserServiceProto.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.queryByUuid(controller, (com.rrkj.flour.user.api.TString)request,
          com.google.protobuf.RpcUtil.<com.rrkj.flour.user.api.TUser>specializeCallback(
            done));
        return;
      case 1:
        this.queryByPhone(controller, (com.rrkj.flour.user.api.TString)request,
          com.google.protobuf.RpcUtil.<com.rrkj.flour.user.api.ListUser>specializeCallback(
            done));
        return;
      case 2:
        this.queryById(controller, (com.rrkj.flour.user.api.TId)request,
          com.google.protobuf.RpcUtil.<com.rrkj.flour.user.api.TUser>specializeCallback(
            done));
        return;
      case 3:
        this.queryByUser(controller, (com.rrkj.flour.user.api.TUser)request,
          com.google.protobuf.RpcUtil.<com.rrkj.flour.user.api.ListUser>specializeCallback(
            done));
        return;
      case 4:
        this.queryByNameAndLabel(controller, (com.rrkj.flour.user.api.TNameAndLabel)request,
          com.google.protobuf.RpcUtil.<com.rrkj.flour.user.api.ListUser>specializeCallback(
            done));
        return;
      case 5:
        this.create(controller, (com.rrkj.flour.user.api.TUser)request,
          com.google.protobuf.RpcUtil.<com.rrkj.flour.user.api.TUser>specializeCallback(
            done));
        return;
      case 6:
        this.update(controller, (com.rrkj.flour.user.api.TUser)request,
          com.google.protobuf.RpcUtil.<com.rrkj.flour.user.api.TUser>specializeCallback(
            done));
        return;
      case 7:
        this.removeById(controller, (com.rrkj.flour.user.api.TId)request,
          com.google.protobuf.RpcUtil.<com.rrkj.flour.user.api.TRBool>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.rrkj.flour.user.api.TString.getDefaultInstance();
      case 1:
        return com.rrkj.flour.user.api.TString.getDefaultInstance();
      case 2:
        return com.rrkj.flour.user.api.TId.getDefaultInstance();
      case 3:
        return com.rrkj.flour.user.api.TUser.getDefaultInstance();
      case 4:
        return com.rrkj.flour.user.api.TNameAndLabel.getDefaultInstance();
      case 5:
        return com.rrkj.flour.user.api.TUser.getDefaultInstance();
      case 6:
        return com.rrkj.flour.user.api.TUser.getDefaultInstance();
      case 7:
        return com.rrkj.flour.user.api.TId.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.rrkj.flour.user.api.TUser.getDefaultInstance();
      case 1:
        return com.rrkj.flour.user.api.ListUser.getDefaultInstance();
      case 2:
        return com.rrkj.flour.user.api.TUser.getDefaultInstance();
      case 3:
        return com.rrkj.flour.user.api.ListUser.getDefaultInstance();
      case 4:
        return com.rrkj.flour.user.api.ListUser.getDefaultInstance();
      case 5:
        return com.rrkj.flour.user.api.TUser.getDefaultInstance();
      case 6:
        return com.rrkj.flour.user.api.TUser.getDefaultInstance();
      case 7:
        return com.rrkj.flour.user.api.TRBool.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.rrkj.flour.user.api.UserGrpcService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void queryByUuid(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TString request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.rrkj.flour.user.api.TUser.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.rrkj.flour.user.api.TUser.class,
          com.rrkj.flour.user.api.TUser.getDefaultInstance()));
    }

    public  void queryByPhone(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TString request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.rrkj.flour.user.api.ListUser.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.rrkj.flour.user.api.ListUser.class,
          com.rrkj.flour.user.api.ListUser.getDefaultInstance()));
    }

    public  void queryById(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TId request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.rrkj.flour.user.api.TUser.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.rrkj.flour.user.api.TUser.class,
          com.rrkj.flour.user.api.TUser.getDefaultInstance()));
    }

    public  void queryByUser(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.rrkj.flour.user.api.ListUser.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.rrkj.flour.user.api.ListUser.class,
          com.rrkj.flour.user.api.ListUser.getDefaultInstance()));
    }

    public  void queryByNameAndLabel(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TNameAndLabel request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.ListUser> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.rrkj.flour.user.api.ListUser.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.rrkj.flour.user.api.ListUser.class,
          com.rrkj.flour.user.api.ListUser.getDefaultInstance()));
    }

    public  void create(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(5),
        controller,
        request,
        com.rrkj.flour.user.api.TUser.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.rrkj.flour.user.api.TUser.class,
          com.rrkj.flour.user.api.TUser.getDefaultInstance()));
    }

    public  void update(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TUser> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(6),
        controller,
        request,
        com.rrkj.flour.user.api.TUser.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.rrkj.flour.user.api.TUser.class,
          com.rrkj.flour.user.api.TUser.getDefaultInstance()));
    }

    public  void removeById(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TId request,
        com.google.protobuf.RpcCallback<com.rrkj.flour.user.api.TRBool> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(7),
        controller,
        request,
        com.rrkj.flour.user.api.TRBool.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.rrkj.flour.user.api.TRBool.class,
          com.rrkj.flour.user.api.TRBool.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.rrkj.flour.user.api.TUser queryByUuid(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TString request)
        throws com.google.protobuf.ServiceException;

    public com.rrkj.flour.user.api.ListUser queryByPhone(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TString request)
        throws com.google.protobuf.ServiceException;

    public com.rrkj.flour.user.api.TUser queryById(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TId request)
        throws com.google.protobuf.ServiceException;

    public com.rrkj.flour.user.api.ListUser queryByUser(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request)
        throws com.google.protobuf.ServiceException;

    public com.rrkj.flour.user.api.ListUser queryByNameAndLabel(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TNameAndLabel request)
        throws com.google.protobuf.ServiceException;

    public com.rrkj.flour.user.api.TUser create(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request)
        throws com.google.protobuf.ServiceException;

    public com.rrkj.flour.user.api.TUser update(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request)
        throws com.google.protobuf.ServiceException;

    public com.rrkj.flour.user.api.TRBool removeById(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TId request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.rrkj.flour.user.api.TUser queryByUuid(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TString request)
        throws com.google.protobuf.ServiceException {
      return (com.rrkj.flour.user.api.TUser) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.rrkj.flour.user.api.TUser.getDefaultInstance());
    }


    public com.rrkj.flour.user.api.ListUser queryByPhone(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TString request)
        throws com.google.protobuf.ServiceException {
      return (com.rrkj.flour.user.api.ListUser) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.rrkj.flour.user.api.ListUser.getDefaultInstance());
    }


    public com.rrkj.flour.user.api.TUser queryById(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TId request)
        throws com.google.protobuf.ServiceException {
      return (com.rrkj.flour.user.api.TUser) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.rrkj.flour.user.api.TUser.getDefaultInstance());
    }


    public com.rrkj.flour.user.api.ListUser queryByUser(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request)
        throws com.google.protobuf.ServiceException {
      return (com.rrkj.flour.user.api.ListUser) channel.callBlockingMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.rrkj.flour.user.api.ListUser.getDefaultInstance());
    }


    public com.rrkj.flour.user.api.ListUser queryByNameAndLabel(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TNameAndLabel request)
        throws com.google.protobuf.ServiceException {
      return (com.rrkj.flour.user.api.ListUser) channel.callBlockingMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.rrkj.flour.user.api.ListUser.getDefaultInstance());
    }


    public com.rrkj.flour.user.api.TUser create(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request)
        throws com.google.protobuf.ServiceException {
      return (com.rrkj.flour.user.api.TUser) channel.callBlockingMethod(
        getDescriptor().getMethods().get(5),
        controller,
        request,
        com.rrkj.flour.user.api.TUser.getDefaultInstance());
    }


    public com.rrkj.flour.user.api.TUser update(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TUser request)
        throws com.google.protobuf.ServiceException {
      return (com.rrkj.flour.user.api.TUser) channel.callBlockingMethod(
        getDescriptor().getMethods().get(6),
        controller,
        request,
        com.rrkj.flour.user.api.TUser.getDefaultInstance());
    }


    public com.rrkj.flour.user.api.TRBool removeById(
        com.google.protobuf.RpcController controller,
        com.rrkj.flour.user.api.TId request)
        throws com.google.protobuf.ServiceException {
      return (com.rrkj.flour.user.api.TRBool) channel.callBlockingMethod(
        getDescriptor().getMethods().get(7),
        controller,
        request,
        com.rrkj.flour.user.api.TRBool.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:UserGrpcService)
}

