// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.block.LocationBlockIdListEntry}
 */
public  final class LocationBlockIdListEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.block.LocationBlockIdListEntry)
    LocationBlockIdListEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocationBlockIdListEntry.newBuilder() to construct.
  private LocationBlockIdListEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocationBlockIdListEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocationBlockIdListEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LocationBlockIdListEntry(
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
          case 10: {
            alluxio.grpc.BlockStoreLocationProto.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = key_.toBuilder();
            }
            key_ = input.readMessage(alluxio.grpc.BlockStoreLocationProto.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(key_);
              key_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            alluxio.grpc.BlockIdList.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(alluxio.grpc.BlockIdList.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
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
    return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_LocationBlockIdListEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_LocationBlockIdListEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.LocationBlockIdListEntry.class, alluxio.grpc.LocationBlockIdListEntry.Builder.class);
  }

  private int bitField0_;
  public static final int KEY_FIELD_NUMBER = 1;
  private alluxio.grpc.BlockStoreLocationProto key_;
  /**
   * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
   * @return Whether the key field is set.
   */
  public boolean hasKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
   * @return The key.
   */
  public alluxio.grpc.BlockStoreLocationProto getKey() {
    return key_ == null ? alluxio.grpc.BlockStoreLocationProto.getDefaultInstance() : key_;
  }
  /**
   * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
   */
  public alluxio.grpc.BlockStoreLocationProtoOrBuilder getKeyOrBuilder() {
    return key_ == null ? alluxio.grpc.BlockStoreLocationProto.getDefaultInstance() : key_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private alluxio.grpc.BlockIdList value_;
  /**
   * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
   * @return Whether the value field is set.
   */
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
   * @return The value.
   */
  public alluxio.grpc.BlockIdList getValue() {
    return value_ == null ? alluxio.grpc.BlockIdList.getDefaultInstance() : value_;
  }
  /**
   * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
   */
  public alluxio.grpc.BlockIdListOrBuilder getValueOrBuilder() {
    return value_ == null ? alluxio.grpc.BlockIdList.getDefaultInstance() : value_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getKey());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
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
    if (!(obj instanceof alluxio.grpc.LocationBlockIdListEntry)) {
      return super.equals(obj);
    }
    alluxio.grpc.LocationBlockIdListEntry other = (alluxio.grpc.LocationBlockIdListEntry) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.LocationBlockIdListEntry parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.LocationBlockIdListEntry prototype) {
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
   * Protobuf type {@code alluxio.grpc.block.LocationBlockIdListEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.block.LocationBlockIdListEntry)
      alluxio.grpc.LocationBlockIdListEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_LocationBlockIdListEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_LocationBlockIdListEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.LocationBlockIdListEntry.class, alluxio.grpc.LocationBlockIdListEntry.Builder.class);
    }

    // Construct using alluxio.grpc.LocationBlockIdListEntry.newBuilder()
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
        getKeyFieldBuilder();
        getValueFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        keyBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_LocationBlockIdListEntry_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.LocationBlockIdListEntry getDefaultInstanceForType() {
      return alluxio.grpc.LocationBlockIdListEntry.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.LocationBlockIdListEntry build() {
      alluxio.grpc.LocationBlockIdListEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.LocationBlockIdListEntry buildPartial() {
      alluxio.grpc.LocationBlockIdListEntry result = new alluxio.grpc.LocationBlockIdListEntry(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (keyBuilder_ == null) {
          result.key_ = key_;
        } else {
          result.key_ = keyBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
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
      if (other instanceof alluxio.grpc.LocationBlockIdListEntry) {
        return mergeFrom((alluxio.grpc.LocationBlockIdListEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.LocationBlockIdListEntry other) {
      if (other == alluxio.grpc.LocationBlockIdListEntry.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
      alluxio.grpc.LocationBlockIdListEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.LocationBlockIdListEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private alluxio.grpc.BlockStoreLocationProto key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.BlockStoreLocationProto, alluxio.grpc.BlockStoreLocationProto.Builder, alluxio.grpc.BlockStoreLocationProtoOrBuilder> keyBuilder_;
    /**
     * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
     * @return The key.
     */
    public alluxio.grpc.BlockStoreLocationProto getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? alluxio.grpc.BlockStoreLocationProto.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
     */
    public Builder setKey(alluxio.grpc.BlockStoreLocationProto value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
     */
    public Builder setKey(
        alluxio.grpc.BlockStoreLocationProto.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
     */
    public Builder mergeKey(alluxio.grpc.BlockStoreLocationProto value) {
      if (keyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            key_ != null &&
            key_ != alluxio.grpc.BlockStoreLocationProto.getDefaultInstance()) {
          key_ =
            alluxio.grpc.BlockStoreLocationProto.newBuilder(key_).mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        keyBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
     */
    public alluxio.grpc.BlockStoreLocationProto.Builder getKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
     */
    public alluxio.grpc.BlockStoreLocationProtoOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            alluxio.grpc.BlockStoreLocationProto.getDefaultInstance() : key_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.BlockStoreLocationProto, alluxio.grpc.BlockStoreLocationProto.Builder, alluxio.grpc.BlockStoreLocationProtoOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.BlockStoreLocationProto, alluxio.grpc.BlockStoreLocationProto.Builder, alluxio.grpc.BlockStoreLocationProtoOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private alluxio.grpc.BlockIdList value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.BlockIdList, alluxio.grpc.BlockIdList.Builder, alluxio.grpc.BlockIdListOrBuilder> valueBuilder_;
    /**
     * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
     * @return The value.
     */
    public alluxio.grpc.BlockIdList getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? alluxio.grpc.BlockIdList.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
     */
    public Builder setValue(alluxio.grpc.BlockIdList value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
     */
    public Builder setValue(
        alluxio.grpc.BlockIdList.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
     */
    public Builder mergeValue(alluxio.grpc.BlockIdList value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            value_ != null &&
            value_ != alluxio.grpc.BlockIdList.getDefaultInstance()) {
          value_ =
            alluxio.grpc.BlockIdList.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
     */
    public alluxio.grpc.BlockIdList.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
     */
    public alluxio.grpc.BlockIdListOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            alluxio.grpc.BlockIdList.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.BlockIdList, alluxio.grpc.BlockIdList.Builder, alluxio.grpc.BlockIdListOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.BlockIdList, alluxio.grpc.BlockIdList.Builder, alluxio.grpc.BlockIdListOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.block.LocationBlockIdListEntry)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.block.LocationBlockIdListEntry)
  private static final alluxio.grpc.LocationBlockIdListEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.LocationBlockIdListEntry();
  }

  public static alluxio.grpc.LocationBlockIdListEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LocationBlockIdListEntry>
      PARSER = new com.google.protobuf.AbstractParser<LocationBlockIdListEntry>() {
    @java.lang.Override
    public LocationBlockIdListEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LocationBlockIdListEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocationBlockIdListEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationBlockIdListEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.LocationBlockIdListEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

