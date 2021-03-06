// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserService.proto

package com.rrkj.flour.user.api;

/**
 * Protobuf type {@code TAccount}
 */
public  final class TAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TAccount)
    TAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TAccount.newBuilder() to construct.
  private TAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TAccount() {
    openid_ = "";
    type_ = "";
    uuid_ = "";
    label_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TAccount(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            openid_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            uuid_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            label_ = s;
            break;
          }
          case 48: {

            status_ = input.readInt32();
            break;
          }
          case 56: {

            userid_ = input.readInt64();
            break;
          }
          case 66: {
            com.rrkj.flour.user.api.TUser.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(com.rrkj.flour.user.api.TUser.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
            }

            break;
          }
          case 72: {

            ctime_ = input.readInt64();
            break;
          }
          case 80: {

            utime_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rrkj.flour.user.api.UserServiceProto.internal_static_TAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rrkj.flour.user.api.UserServiceProto.internal_static_TAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rrkj.flour.user.api.TAccount.class, com.rrkj.flour.user.api.TAccount.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int OPENID_FIELD_NUMBER = 2;
  private volatile java.lang.Object openid_;
  /**
   * <code>string openid = 2;</code>
   */
  public java.lang.String getOpenid() {
    java.lang.Object ref = openid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      openid_ = s;
      return s;
    }
  }
  /**
   * <code>string openid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOpenidBytes() {
    java.lang.Object ref = openid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      openid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 3;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UUID_FIELD_NUMBER = 4;
  private volatile java.lang.Object uuid_;
  /**
   * <code>string uuid = 4;</code>
   */
  public java.lang.String getUuid() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uuid_ = s;
      return s;
    }
  }
  /**
   * <code>string uuid = 4;</code>
   */
  public com.google.protobuf.ByteString
      getUuidBytes() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABEL_FIELD_NUMBER = 5;
  private volatile java.lang.Object label_;
  /**
   * <code>string label = 5;</code>
   */
  public java.lang.String getLabel() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      label_ = s;
      return s;
    }
  }
  /**
   * <code>string label = 5;</code>
   */
  public com.google.protobuf.ByteString
      getLabelBytes() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      label_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 6;
  private int status_;
  /**
   * <code>int32 status = 6;</code>
   */
  public int getStatus() {
    return status_;
  }

  public static final int USERID_FIELD_NUMBER = 7;
  private long userid_;
  /**
   * <code>int64 userid = 7;</code>
   */
  public long getUserid() {
    return userid_;
  }

  public static final int USER_FIELD_NUMBER = 8;
  private com.rrkj.flour.user.api.TUser user_;
  /**
   * <code>.TUser user = 8;</code>
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>.TUser user = 8;</code>
   */
  public com.rrkj.flour.user.api.TUser getUser() {
    return user_ == null ? com.rrkj.flour.user.api.TUser.getDefaultInstance() : user_;
  }
  /**
   * <code>.TUser user = 8;</code>
   */
  public com.rrkj.flour.user.api.TUserOrBuilder getUserOrBuilder() {
    return getUser();
  }

  public static final int CTIME_FIELD_NUMBER = 9;
  private long ctime_;
  /**
   * <code>int64 ctime = 9;</code>
   */
  public long getCtime() {
    return ctime_;
  }

  public static final int UTIME_FIELD_NUMBER = 10;
  private long utime_;
  /**
   * <code>int64 utime = 10;</code>
   */
  public long getUtime() {
    return utime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getOpenidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, openid_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    if (!getUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uuid_);
    }
    if (!getLabelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, label_);
    }
    if (status_ != 0) {
      output.writeInt32(6, status_);
    }
    if (userid_ != 0L) {
      output.writeInt64(7, userid_);
    }
    if (user_ != null) {
      output.writeMessage(8, getUser());
    }
    if (ctime_ != 0L) {
      output.writeInt64(9, ctime_);
    }
    if (utime_ != 0L) {
      output.writeInt64(10, utime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getOpenidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, openid_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    if (!getUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uuid_);
    }
    if (!getLabelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, label_);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, status_);
    }
    if (userid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, userid_);
    }
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, getUser());
    }
    if (ctime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, ctime_);
    }
    if (utime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, utime_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.rrkj.flour.user.api.TAccount)) {
      return super.equals(obj);
    }
    com.rrkj.flour.user.api.TAccount other = (com.rrkj.flour.user.api.TAccount) obj;

    if (getId()
        != other.getId()) return false;
    if (!getOpenid()
        .equals(other.getOpenid())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getUuid()
        .equals(other.getUuid())) return false;
    if (!getLabel()
        .equals(other.getLabel())) return false;
    if (getStatus()
        != other.getStatus()) return false;
    if (getUserid()
        != other.getUserid()) return false;
    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (getCtime()
        != other.getCtime()) return false;
    if (getUtime()
        != other.getUtime()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + OPENID_FIELD_NUMBER;
    hash = (53 * hash) + getOpenid().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUuid().hashCode();
    hash = (37 * hash) + LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getLabel().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserid());
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (37 * hash) + CTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCtime());
    hash = (37 * hash) + UTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUtime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rrkj.flour.user.api.TAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.user.api.TAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.user.api.TAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.user.api.TAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.user.api.TAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.user.api.TAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.user.api.TAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.user.api.TAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rrkj.flour.user.api.TAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.user.api.TAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rrkj.flour.user.api.TAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.user.api.TAccount parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.rrkj.flour.user.api.TAccount prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code TAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TAccount)
      com.rrkj.flour.user.api.TAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rrkj.flour.user.api.UserServiceProto.internal_static_TAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rrkj.flour.user.api.UserServiceProto.internal_static_TAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rrkj.flour.user.api.TAccount.class, com.rrkj.flour.user.api.TAccount.Builder.class);
    }

    // Construct using com.rrkj.flour.user.api.TAccount.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      openid_ = "";

      type_ = "";

      uuid_ = "";

      label_ = "";

      status_ = 0;

      userid_ = 0L;

      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      ctime_ = 0L;

      utime_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rrkj.flour.user.api.UserServiceProto.internal_static_TAccount_descriptor;
    }

    @java.lang.Override
    public com.rrkj.flour.user.api.TAccount getDefaultInstanceForType() {
      return com.rrkj.flour.user.api.TAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.rrkj.flour.user.api.TAccount build() {
      com.rrkj.flour.user.api.TAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rrkj.flour.user.api.TAccount buildPartial() {
      com.rrkj.flour.user.api.TAccount result = new com.rrkj.flour.user.api.TAccount(this);
      result.id_ = id_;
      result.openid_ = openid_;
      result.type_ = type_;
      result.uuid_ = uuid_;
      result.label_ = label_;
      result.status_ = status_;
      result.userid_ = userid_;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      result.ctime_ = ctime_;
      result.utime_ = utime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.rrkj.flour.user.api.TAccount) {
        return mergeFrom((com.rrkj.flour.user.api.TAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rrkj.flour.user.api.TAccount other) {
      if (other == com.rrkj.flour.user.api.TAccount.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getOpenid().isEmpty()) {
        openid_ = other.openid_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getUuid().isEmpty()) {
        uuid_ = other.uuid_;
        onChanged();
      }
      if (!other.getLabel().isEmpty()) {
        label_ = other.label_;
        onChanged();
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (other.getUserid() != 0L) {
        setUserid(other.getUserid());
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (other.getCtime() != 0L) {
        setCtime(other.getCtime());
      }
      if (other.getUtime() != 0L) {
        setUtime(other.getUtime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.rrkj.flour.user.api.TAccount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rrkj.flour.user.api.TAccount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object openid_ = "";
    /**
     * <code>string openid = 2;</code>
     */
    public java.lang.String getOpenid() {
      java.lang.Object ref = openid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        openid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string openid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOpenidBytes() {
      java.lang.Object ref = openid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        openid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string openid = 2;</code>
     */
    public Builder setOpenid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      openid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string openid = 2;</code>
     */
    public Builder clearOpenid() {
      
      openid_ = getDefaultInstance().getOpenid();
      onChanged();
      return this;
    }
    /**
     * <code>string openid = 2;</code>
     */
    public Builder setOpenidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      openid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 3;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uuid_ = "";
    /**
     * <code>string uuid = 4;</code>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uuid = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uuid = 4;</code>
     */
    public Builder setUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 4;</code>
     */
    public Builder clearUuid() {
      
      uuid_ = getDefaultInstance().getUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 4;</code>
     */
    public Builder setUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object label_ = "";
    /**
     * <code>string label = 5;</code>
     */
    public java.lang.String getLabel() {
      java.lang.Object ref = label_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        label_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string label = 5;</code>
     */
    public com.google.protobuf.ByteString
        getLabelBytes() {
      java.lang.Object ref = label_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        label_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string label = 5;</code>
     */
    public Builder setLabel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      label_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string label = 5;</code>
     */
    public Builder clearLabel() {
      
      label_ = getDefaultInstance().getLabel();
      onChanged();
      return this;
    }
    /**
     * <code>string label = 5;</code>
     */
    public Builder setLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      label_ = value;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 6;</code>
     */
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 6;</code>
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 6;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private long userid_ ;
    /**
     * <code>int64 userid = 7;</code>
     */
    public long getUserid() {
      return userid_;
    }
    /**
     * <code>int64 userid = 7;</code>
     */
    public Builder setUserid(long value) {
      
      userid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 userid = 7;</code>
     */
    public Builder clearUserid() {
      
      userid_ = 0L;
      onChanged();
      return this;
    }

    private com.rrkj.flour.user.api.TUser user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rrkj.flour.user.api.TUser, com.rrkj.flour.user.api.TUser.Builder, com.rrkj.flour.user.api.TUserOrBuilder> userBuilder_;
    /**
     * <code>.TUser user = 8;</code>
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <code>.TUser user = 8;</code>
     */
    public com.rrkj.flour.user.api.TUser getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.rrkj.flour.user.api.TUser.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.TUser user = 8;</code>
     */
    public Builder setUser(com.rrkj.flour.user.api.TUser value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.TUser user = 8;</code>
     */
    public Builder setUser(
        com.rrkj.flour.user.api.TUser.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.TUser user = 8;</code>
     */
    public Builder mergeUser(com.rrkj.flour.user.api.TUser value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            com.rrkj.flour.user.api.TUser.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.TUser user = 8;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.TUser user = 8;</code>
     */
    public com.rrkj.flour.user.api.TUser.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.TUser user = 8;</code>
     */
    public com.rrkj.flour.user.api.TUserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.rrkj.flour.user.api.TUser.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.TUser user = 8;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.rrkj.flour.user.api.TUser, com.rrkj.flour.user.api.TUser.Builder, com.rrkj.flour.user.api.TUserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.rrkj.flour.user.api.TUser, com.rrkj.flour.user.api.TUser.Builder, com.rrkj.flour.user.api.TUserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private long ctime_ ;
    /**
     * <code>int64 ctime = 9;</code>
     */
    public long getCtime() {
      return ctime_;
    }
    /**
     * <code>int64 ctime = 9;</code>
     */
    public Builder setCtime(long value) {
      
      ctime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ctime = 9;</code>
     */
    public Builder clearCtime() {
      
      ctime_ = 0L;
      onChanged();
      return this;
    }

    private long utime_ ;
    /**
     * <code>int64 utime = 10;</code>
     */
    public long getUtime() {
      return utime_;
    }
    /**
     * <code>int64 utime = 10;</code>
     */
    public Builder setUtime(long value) {
      
      utime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 utime = 10;</code>
     */
    public Builder clearUtime() {
      
      utime_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TAccount)
  }

  // @@protoc_insertion_point(class_scope:TAccount)
  private static final com.rrkj.flour.user.api.TAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rrkj.flour.user.api.TAccount();
  }

  public static com.rrkj.flour.user.api.TAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TAccount>
      PARSER = new com.google.protobuf.AbstractParser<TAccount>() {
    @java.lang.Override
    public TAccount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TAccount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rrkj.flour.user.api.TAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

