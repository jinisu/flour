// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AuthorizeService.proto

package com.rrkj.flour.authorize.api;

/**
 * Protobuf type {@code TRole}
 */
public  final class TRole extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TRole)
    TRoleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TRole.newBuilder() to construct.
  private TRole(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TRole() {
    name_ = "";
    title_ = "";
    icon_ = "";
    label_ = "";
    descr_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TRole(
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

            title_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            icon_ = s;
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
    return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TRole_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TRole_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rrkj.flour.authorize.api.TRole.class, com.rrkj.flour.authorize.api.TRole.Builder.class);
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

  public static final int TITLE_FIELD_NUMBER = 3;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 3;</code>
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICON_FIELD_NUMBER = 4;
  private volatile java.lang.Object icon_;
  /**
   * <code>string icon = 4;</code>
   */
  public java.lang.String getIcon() {
    java.lang.Object ref = icon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      icon_ = s;
      return s;
    }
  }
  /**
   * <code>string icon = 4;</code>
   */
  public com.google.protobuf.ByteString
      getIconBytes() {
    java.lang.Object ref = icon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      icon_ = b;
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
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, title_);
    }
    if (!getIconBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, icon_);
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
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, title_);
    }
    if (!getIconBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, icon_);
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
    if (!(obj instanceof com.rrkj.flour.authorize.api.TRole)) {
      return super.equals(obj);
    }
    com.rrkj.flour.authorize.api.TRole other = (com.rrkj.flour.authorize.api.TRole) obj;

    if (getId()
        != other.getId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getIcon()
        .equals(other.getIcon())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + ICON_FIELD_NUMBER;
    hash = (53 * hash) + getIcon().hashCode();
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

  public static com.rrkj.flour.authorize.api.TRole parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.authorize.api.TRole parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TRole parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.authorize.api.TRole parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TRole parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.authorize.api.TRole parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TRole parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.authorize.api.TRole parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TRole parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.authorize.api.TRole parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rrkj.flour.authorize.api.TRole parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.authorize.api.TRole parseFrom(
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
  public static Builder newBuilder(com.rrkj.flour.authorize.api.TRole prototype) {
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
   * Protobuf type {@code TRole}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TRole)
      com.rrkj.flour.authorize.api.TRoleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TRole_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TRole_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rrkj.flour.authorize.api.TRole.class, com.rrkj.flour.authorize.api.TRole.Builder.class);
    }

    // Construct using com.rrkj.flour.authorize.api.TRole.newBuilder()
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

      title_ = "";

      icon_ = "";

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
      return com.rrkj.flour.authorize.api.AuthorizeServiceProto.internal_static_TRole_descriptor;
    }

    @java.lang.Override
    public com.rrkj.flour.authorize.api.TRole getDefaultInstanceForType() {
      return com.rrkj.flour.authorize.api.TRole.getDefaultInstance();
    }

    @java.lang.Override
    public com.rrkj.flour.authorize.api.TRole build() {
      com.rrkj.flour.authorize.api.TRole result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rrkj.flour.authorize.api.TRole buildPartial() {
      com.rrkj.flour.authorize.api.TRole result = new com.rrkj.flour.authorize.api.TRole(this);
      result.id_ = id_;
      result.name_ = name_;
      result.title_ = title_;
      result.icon_ = icon_;
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
      if (other instanceof com.rrkj.flour.authorize.api.TRole) {
        return mergeFrom((com.rrkj.flour.authorize.api.TRole)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rrkj.flour.authorize.api.TRole other) {
      if (other == com.rrkj.flour.authorize.api.TRole.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getIcon().isEmpty()) {
        icon_ = other.icon_;
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
      com.rrkj.flour.authorize.api.TRole parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rrkj.flour.authorize.api.TRole) e.getUnfinishedMessage();
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

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 3;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 3;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 3;</code>
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 3;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object icon_ = "";
    /**
     * <code>string icon = 4;</code>
     */
    public java.lang.String getIcon() {
      java.lang.Object ref = icon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        icon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string icon = 4;</code>
     */
    public com.google.protobuf.ByteString
        getIconBytes() {
      java.lang.Object ref = icon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        icon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string icon = 4;</code>
     */
    public Builder setIcon(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      icon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string icon = 4;</code>
     */
    public Builder clearIcon() {
      
      icon_ = getDefaultInstance().getIcon();
      onChanged();
      return this;
    }
    /**
     * <code>string icon = 4;</code>
     */
    public Builder setIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      icon_ = value;
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


    // @@protoc_insertion_point(builder_scope:TRole)
  }

  // @@protoc_insertion_point(class_scope:TRole)
  private static final com.rrkj.flour.authorize.api.TRole DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rrkj.flour.authorize.api.TRole();
  }

  public static com.rrkj.flour.authorize.api.TRole getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TRole>
      PARSER = new com.google.protobuf.AbstractParser<TRole>() {
    @java.lang.Override
    public TRole parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TRole(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TRole> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TRole> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rrkj.flour.authorize.api.TRole getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

