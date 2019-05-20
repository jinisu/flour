// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AuthorizeService.proto

package com.rrkj.flour.authorize.api;

/**
 * Protobuf type {@code TPermission}
 */
public  final class TPermission extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TPermission)
    TPermissionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TPermission.newBuilder() to construct.
  private TPermission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TPermission() {
    name_ = "";
    ptype_ = "";
    permission_ = "";
    label_ = "";
    descr_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TPermission(
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

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            ptype_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            permission_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            label_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            descr_ = s;
            break;
          }
          case 56: {

            utime_ = input.readInt64();
            break;
          }
          case 64: {

            ctime_ = input.readInt64();
            break;
          }
          case 72: {

            status_ = input.readInt32();
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
    return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TPermission_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TPermission_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rrkj.flour.authorize.api.TPermission.class, com.rrkj.flour.authorize.api.TPermission.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PTYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object ptype_;
  /**
   * <code>string ptype = 3;</code>
   */
  public java.lang.String getPtype() {
    java.lang.Object ref = ptype_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ptype_ = s;
      return s;
    }
  }
  /**
   * <code>string ptype = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPtypeBytes() {
    java.lang.Object ref = ptype_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ptype_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSION_FIELD_NUMBER = 4;
  private volatile java.lang.Object permission_;
  /**
   * <code>string permission = 4;</code>
   */
  public java.lang.String getPermission() {
    java.lang.Object ref = permission_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      permission_ = s;
      return s;
    }
  }
  /**
   * <code>string permission = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPermissionBytes() {
    java.lang.Object ref = permission_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      permission_ = b;
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

  public static final int DESCR_FIELD_NUMBER = 6;
  private volatile java.lang.Object descr_;
  /**
   * <code>string descr = 6;</code>
   */
  public java.lang.String getDescr() {
    java.lang.Object ref = descr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      descr_ = s;
      return s;
    }
  }
  /**
   * <code>string descr = 6;</code>
   */
  public com.google.protobuf.ByteString
      getDescrBytes() {
    java.lang.Object ref = descr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      descr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UTIME_FIELD_NUMBER = 7;
  private long utime_;
  /**
   * <code>int64 utime = 7;</code>
   */
  public long getUtime() {
    return utime_;
  }

  public static final int CTIME_FIELD_NUMBER = 8;
  private long ctime_;
  /**
   * <code>int64 ctime = 8;</code>
   */
  public long getCtime() {
    return ctime_;
  }

  public static final int STATUS_FIELD_NUMBER = 9;
  private int status_;
  /**
   * <code>int32 status = 9;</code>
   */
  public int getStatus() {
    return status_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getPtypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ptype_);
    }
    if (!getPermissionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, permission_);
    }
    if (!getLabelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, label_);
    }
    if (!getDescrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, descr_);
    }
    if (utime_ != 0L) {
      output.writeInt64(7, utime_);
    }
    if (ctime_ != 0L) {
      output.writeInt64(8, ctime_);
    }
    if (status_ != 0) {
      output.writeInt32(9, status_);
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
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getPtypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ptype_);
    }
    if (!getPermissionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, permission_);
    }
    if (!getLabelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, label_);
    }
    if (!getDescrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, descr_);
    }
    if (utime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, utime_);
    }
    if (ctime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, ctime_);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, status_);
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
    if (!(obj instanceof com.rrkj.flour.authorize.api.TPermission)) {
      return super.equals(obj);
    }
    com.rrkj.flour.authorize.api.TPermission other = (com.rrkj.flour.authorize.api.TPermission) obj;

    if (getId()
        != other.getId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getPtype()
        .equals(other.getPtype())) return false;
    if (!getPermission()
        .equals(other.getPermission())) return false;
    if (!getLabel()
        .equals(other.getLabel())) return false;
    if (!getDescr()
        .equals(other.getDescr())) return false;
    if (getUtime()
        != other.getUtime()) return false;
    if (getCtime()
        != other.getCtime()) return false;
    if (getStatus()
        != other.getStatus()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPtype().hashCode();
    hash = (37 * hash) + PERMISSION_FIELD_NUMBER;
    hash = (53 * hash) + getPermission().hashCode();
    hash = (37 * hash) + LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getLabel().hashCode();
    hash = (37 * hash) + DESCR_FIELD_NUMBER;
    hash = (53 * hash) + getDescr().hashCode();
    hash = (37 * hash) + UTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUtime());
    hash = (37 * hash) + CTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCtime());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rrkj.flour.authorize.api.TPermission parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.authorize.api.TPermission parseFrom(
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
  public static Builder newBuilder(com.rrkj.flour.authorize.api.TPermission prototype) {
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
   * Protobuf type {@code TPermission}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TPermission)
      com.rrkj.flour.authorize.api.TPermissionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TPermission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TPermission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rrkj.flour.authorize.api.TPermission.class, com.rrkj.flour.authorize.api.TPermission.Builder.class);
    }

    // Construct using com.rrkj.flour.authorize.api.TPermission.newBuilder()
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

      name_ = "";

      ptype_ = "";

      permission_ = "";

      label_ = "";

      descr_ = "";

      utime_ = 0L;

      ctime_ = 0L;

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TPermission_descriptor;
    }

    @java.lang.Override
    public com.rrkj.flour.authorize.api.TPermission getDefaultInstanceForType() {
      return com.rrkj.flour.authorize.api.TPermission.getDefaultInstance();
    }

    @java.lang.Override
    public com.rrkj.flour.authorize.api.TPermission build() {
      com.rrkj.flour.authorize.api.TPermission result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rrkj.flour.authorize.api.TPermission buildPartial() {
      com.rrkj.flour.authorize.api.TPermission result = new com.rrkj.flour.authorize.api.TPermission(this);
      result.id_ = id_;
      result.name_ = name_;
      result.ptype_ = ptype_;
      result.permission_ = permission_;
      result.label_ = label_;
      result.descr_ = descr_;
      result.utime_ = utime_;
      result.ctime_ = ctime_;
      result.status_ = status_;
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
      if (other instanceof com.rrkj.flour.authorize.api.TPermission) {
        return mergeFrom((com.rrkj.flour.authorize.api.TPermission)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rrkj.flour.authorize.api.TPermission other) {
      if (other == com.rrkj.flour.authorize.api.TPermission.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getPtype().isEmpty()) {
        ptype_ = other.ptype_;
        onChanged();
      }
      if (!other.getPermission().isEmpty()) {
        permission_ = other.permission_;
        onChanged();
      }
      if (!other.getLabel().isEmpty()) {
        label_ = other.label_;
        onChanged();
      }
      if (!other.getDescr().isEmpty()) {
        descr_ = other.descr_;
        onChanged();
      }
      if (other.getUtime() != 0L) {
        setUtime(other.getUtime());
      }
      if (other.getCtime() != 0L) {
        setCtime(other.getCtime());
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
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
      com.rrkj.flour.authorize.api.TPermission parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rrkj.flour.authorize.api.TPermission) e.getUnfinishedMessage();
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ptype_ = "";
    /**
     * <code>string ptype = 3;</code>
     */
    public java.lang.String getPtype() {
      java.lang.Object ref = ptype_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ptype_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ptype = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPtypeBytes() {
      java.lang.Object ref = ptype_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ptype_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ptype = 3;</code>
     */
    public Builder setPtype(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ptype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ptype = 3;</code>
     */
    public Builder clearPtype() {
      
      ptype_ = getDefaultInstance().getPtype();
      onChanged();
      return this;
    }
    /**
     * <code>string ptype = 3;</code>
     */
    public Builder setPtypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ptype_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object permission_ = "";
    /**
     * <code>string permission = 4;</code>
     */
    public java.lang.String getPermission() {
      java.lang.Object ref = permission_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        permission_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string permission = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPermissionBytes() {
      java.lang.Object ref = permission_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        permission_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string permission = 4;</code>
     */
    public Builder setPermission(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      permission_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string permission = 4;</code>
     */
    public Builder clearPermission() {
      
      permission_ = getDefaultInstance().getPermission();
      onChanged();
      return this;
    }
    /**
     * <code>string permission = 4;</code>
     */
    public Builder setPermissionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      permission_ = value;
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

    private java.lang.Object descr_ = "";
    /**
     * <code>string descr = 6;</code>
     */
    public java.lang.String getDescr() {
      java.lang.Object ref = descr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        descr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string descr = 6;</code>
     */
    public com.google.protobuf.ByteString
        getDescrBytes() {
      java.lang.Object ref = descr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        descr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string descr = 6;</code>
     */
    public Builder setDescr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      descr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string descr = 6;</code>
     */
    public Builder clearDescr() {
      
      descr_ = getDefaultInstance().getDescr();
      onChanged();
      return this;
    }
    /**
     * <code>string descr = 6;</code>
     */
    public Builder setDescrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      descr_ = value;
      onChanged();
      return this;
    }

    private long utime_ ;
    /**
     * <code>int64 utime = 7;</code>
     */
    public long getUtime() {
      return utime_;
    }
    /**
     * <code>int64 utime = 7;</code>
     */
    public Builder setUtime(long value) {
      
      utime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 utime = 7;</code>
     */
    public Builder clearUtime() {
      
      utime_ = 0L;
      onChanged();
      return this;
    }

    private long ctime_ ;
    /**
     * <code>int64 ctime = 8;</code>
     */
    public long getCtime() {
      return ctime_;
    }
    /**
     * <code>int64 ctime = 8;</code>
     */
    public Builder setCtime(long value) {
      
      ctime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ctime = 8;</code>
     */
    public Builder clearCtime() {
      
      ctime_ = 0L;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 9;</code>
     */
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 9;</code>
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 9;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:TPermission)
  }

  // @@protoc_insertion_point(class_scope:TPermission)
  private static final com.rrkj.flour.authorize.api.TPermission DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rrkj.flour.authorize.api.TPermission();
  }

  public static com.rrkj.flour.authorize.api.TPermission getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TPermission>
      PARSER = new com.google.protobuf.AbstractParser<TPermission>() {
    @java.lang.Override
    public TPermission parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TPermission(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TPermission> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TPermission> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rrkj.flour.authorize.api.TPermission getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

