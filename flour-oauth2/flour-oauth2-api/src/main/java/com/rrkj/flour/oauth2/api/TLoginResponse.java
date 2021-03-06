// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Oauth2Service.proto

package com.rrkj.flour.oauth2.api;

/**
 * Protobuf type {@code TLoginResponse}
 */
public  final class TLoginResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TLoginResponse)
    TLoginResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TLoginResponse.newBuilder() to construct.
  private TLoginResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TLoginResponse() {
    message_ = "";
    accessToken_ = "";
    username_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TLoginResponse(
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

            code_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            accessToken_ = s;
            break;
          }
          case 32: {

            userid_ = input.readInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 50: {
            if (!((mutable_bitField0_ & 0x00000020) != 0)) {
              data_ = com.google.protobuf.MapField.newMapField(
                  DataDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000020;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            data__ = input.readMessage(
                DataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            data_.getMutableMap().put(
                data__.getKey(), data__.getValue());
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
    return com.rrkj.flour.oauth2.api.Oauth2ServiceProto.internal_static_TLoginResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 6:
        return internalGetData();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rrkj.flour.oauth2.api.Oauth2ServiceProto.internal_static_TLoginResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rrkj.flour.oauth2.api.TLoginResponse.class, com.rrkj.flour.oauth2.api.TLoginResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>int32 code = 1;</code>
   */
  public int getCode() {
    return code_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESSTOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object accessToken_;
  /**
   * <code>string accessToken = 3;</code>
   */
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   * <code>string accessToken = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERID_FIELD_NUMBER = 4;
  private long userid_;
  /**
   * <code>int64 userid = 4;</code>
   */
  public long getUserid() {
    return userid_;
  }

  public static final int USERNAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 5;</code>
   */
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 5;</code>
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 6;
  private static final class DataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.rrkj.flour.oauth2.api.Oauth2ServiceProto.internal_static_TLoginResponse_DataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> data_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetData() {
    if (data_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          DataDefaultEntryHolder.defaultEntry);
    }
    return data_;
  }

  public int getDataCount() {
    return internalGetData().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; data = 6;</code>
   */

  public boolean containsData(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetData().getMap().containsKey(key);
  }
  /**
   * Use {@link #getDataMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getData() {
    return getDataMap();
  }
  /**
   * <code>map&lt;string, string&gt; data = 6;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getDataMap() {
    return internalGetData().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; data = 6;</code>
   */

  public java.lang.String getDataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetData().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; data = 6;</code>
   */

  public java.lang.String getDataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetData().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (code_ != 0) {
      output.writeInt32(1, code_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (!getAccessTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, accessToken_);
    }
    if (userid_ != 0L) {
      output.writeInt64(4, userid_);
    }
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, username_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetData(),
        DataDefaultEntryHolder.defaultEntry,
        6);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, code_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (!getAccessTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, accessToken_);
    }
    if (userid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, userid_);
    }
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, username_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetData().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      data__ = DataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, data__);
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
    if (!(obj instanceof com.rrkj.flour.oauth2.api.TLoginResponse)) {
      return super.equals(obj);
    }
    com.rrkj.flour.oauth2.api.TLoginResponse other = (com.rrkj.flour.oauth2.api.TLoginResponse) obj;

    if (getCode()
        != other.getCode()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getAccessToken()
        .equals(other.getAccessToken())) return false;
    if (getUserid()
        != other.getUserid()) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!internalGetData().equals(
        other.internalGetData())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + ACCESSTOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserid());
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    if (!internalGetData().getMap().isEmpty()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rrkj.flour.oauth2.api.TLoginResponse parseFrom(
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
  public static Builder newBuilder(com.rrkj.flour.oauth2.api.TLoginResponse prototype) {
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
   * Protobuf type {@code TLoginResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TLoginResponse)
      com.rrkj.flour.oauth2.api.TLoginResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rrkj.flour.oauth2.api.Oauth2ServiceProto.internal_static_TLoginResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetData();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetMutableData();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rrkj.flour.oauth2.api.Oauth2ServiceProto.internal_static_TLoginResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rrkj.flour.oauth2.api.TLoginResponse.class, com.rrkj.flour.oauth2.api.TLoginResponse.Builder.class);
    }

    // Construct using com.rrkj.flour.oauth2.api.TLoginResponse.newBuilder()
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
      code_ = 0;

      message_ = "";

      accessToken_ = "";

      userid_ = 0L;

      username_ = "";

      internalGetMutableData().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rrkj.flour.oauth2.api.Oauth2ServiceProto.internal_static_TLoginResponse_descriptor;
    }

    @java.lang.Override
    public com.rrkj.flour.oauth2.api.TLoginResponse getDefaultInstanceForType() {
      return com.rrkj.flour.oauth2.api.TLoginResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.rrkj.flour.oauth2.api.TLoginResponse build() {
      com.rrkj.flour.oauth2.api.TLoginResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rrkj.flour.oauth2.api.TLoginResponse buildPartial() {
      com.rrkj.flour.oauth2.api.TLoginResponse result = new com.rrkj.flour.oauth2.api.TLoginResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.code_ = code_;
      result.message_ = message_;
      result.accessToken_ = accessToken_;
      result.userid_ = userid_;
      result.username_ = username_;
      result.data_ = internalGetData();
      result.data_.makeImmutable();
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.rrkj.flour.oauth2.api.TLoginResponse) {
        return mergeFrom((com.rrkj.flour.oauth2.api.TLoginResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rrkj.flour.oauth2.api.TLoginResponse other) {
      if (other == com.rrkj.flour.oauth2.api.TLoginResponse.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        onChanged();
      }
      if (other.getUserid() != 0L) {
        setUserid(other.getUserid());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      internalGetMutableData().mergeFrom(
          other.internalGetData());
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
      com.rrkj.flour.oauth2.api.TLoginResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rrkj.flour.oauth2.api.TLoginResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int code_ ;
    /**
     * <code>int32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object accessToken_ = "";
    /**
     * <code>string accessToken = 3;</code>
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string accessToken = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string accessToken = 3;</code>
     */
    public Builder setAccessToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accessToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string accessToken = 3;</code>
     */
    public Builder clearAccessToken() {
      
      accessToken_ = getDefaultInstance().getAccessToken();
      onChanged();
      return this;
    }
    /**
     * <code>string accessToken = 3;</code>
     */
    public Builder setAccessTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accessToken_ = value;
      onChanged();
      return this;
    }

    private long userid_ ;
    /**
     * <code>int64 userid = 4;</code>
     */
    public long getUserid() {
      return userid_;
    }
    /**
     * <code>int64 userid = 4;</code>
     */
    public Builder setUserid(long value) {
      
      userid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 userid = 4;</code>
     */
    public Builder clearUserid() {
      
      userid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 5;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 5;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 5;</code>
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 5;</code>
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 5;</code>
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> data_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetData() {
      if (data_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DataDefaultEntryHolder.defaultEntry);
      }
      return data_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableData() {
      onChanged();;
      if (data_ == null) {
        data_ = com.google.protobuf.MapField.newMapField(
            DataDefaultEntryHolder.defaultEntry);
      }
      if (!data_.isMutable()) {
        data_ = data_.copy();
      }
      return data_;
    }

    public int getDataCount() {
      return internalGetData().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; data = 6;</code>
     */

    public boolean containsData(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetData().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDataMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getData() {
      return getDataMap();
    }
    /**
     * <code>map&lt;string, string&gt; data = 6;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getDataMap() {
      return internalGetData().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; data = 6;</code>
     */

    public java.lang.String getDataOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetData().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; data = 6;</code>
     */

    public java.lang.String getDataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetData().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearData() {
      internalGetMutableData().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; data = 6;</code>
     */

    public Builder removeData(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableData().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableData() {
      return internalGetMutableData().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; data = 6;</code>
     */
    public Builder putData(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableData().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; data = 6;</code>
     */

    public Builder putAllData(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableData().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:TLoginResponse)
  }

  // @@protoc_insertion_point(class_scope:TLoginResponse)
  private static final com.rrkj.flour.oauth2.api.TLoginResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rrkj.flour.oauth2.api.TLoginResponse();
  }

  public static com.rrkj.flour.oauth2.api.TLoginResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TLoginResponse>
      PARSER = new com.google.protobuf.AbstractParser<TLoginResponse>() {
    @java.lang.Override
    public TLoginResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TLoginResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TLoginResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TLoginResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rrkj.flour.oauth2.api.TLoginResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

