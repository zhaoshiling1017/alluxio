// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_worker.proto

package alluxio.grpc;

/**
 * <pre>
 * next available id: 9
 * </pre>
 *
 * Protobuf type {@code alluxio.grpc.block.CreateLocalBlockRequest}
 */
public  final class CreateLocalBlockRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.block.CreateLocalBlockRequest)
    CreateLocalBlockRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateLocalBlockRequest.newBuilder() to construct.
  private CreateLocalBlockRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateLocalBlockRequest() {
    mediumType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateLocalBlockRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateLocalBlockRequest(
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
            bitField0_ |= 0x00000001;
            blockId_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000002;
            tier_ = input.readInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000004;
            spaceToReserve_ = input.readInt64();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000008;
            onlyReserveSpace_ = input.readBool();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000010;
            cleanupOnFailure_ = input.readBool();
            break;
          }
          case 58: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000020;
            mediumType_ = bs;
            break;
          }
          case 64: {
            bitField0_ |= 0x00000040;
            pinOnCreate_ = input.readBool();
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
    return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_CreateLocalBlockRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_CreateLocalBlockRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.CreateLocalBlockRequest.class, alluxio.grpc.CreateLocalBlockRequest.Builder.class);
  }

  private int bitField0_;
  public static final int BLOCK_ID_FIELD_NUMBER = 1;
  private long blockId_;
  /**
   * <code>optional int64 block_id = 1;</code>
   * @return Whether the blockId field is set.
   */
  public boolean hasBlockId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 block_id = 1;</code>
   * @return The blockId.
   */
  public long getBlockId() {
    return blockId_;
  }

  public static final int TIER_FIELD_NUMBER = 3;
  private int tier_;
  /**
   * <code>optional int32 tier = 3;</code>
   * @return Whether the tier field is set.
   */
  public boolean hasTier() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 tier = 3;</code>
   * @return The tier.
   */
  public int getTier() {
    return tier_;
  }

  public static final int SPACE_TO_RESERVE_FIELD_NUMBER = 4;
  private long spaceToReserve_;
  /**
   * <code>optional int64 space_to_reserve = 4;</code>
   * @return Whether the spaceToReserve field is set.
   */
  public boolean hasSpaceToReserve() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int64 space_to_reserve = 4;</code>
   * @return The spaceToReserve.
   */
  public long getSpaceToReserve() {
    return spaceToReserve_;
  }

  public static final int ONLY_RESERVE_SPACE_FIELD_NUMBER = 5;
  private boolean onlyReserveSpace_;
  /**
   * <pre>
   * If set, only reserve space for the block.
   * </pre>
   *
   * <code>optional bool only_reserve_space = 5;</code>
   * @return Whether the onlyReserveSpace field is set.
   */
  public boolean hasOnlyReserveSpace() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * If set, only reserve space for the block.
   * </pre>
   *
   * <code>optional bool only_reserve_space = 5;</code>
   * @return The onlyReserveSpace.
   */
  public boolean getOnlyReserveSpace() {
    return onlyReserveSpace_;
  }

  public static final int CLEANUP_ON_FAILURE_FIELD_NUMBER = 6;
  private boolean cleanupOnFailure_;
  /**
   * <code>optional bool cleanup_on_failure = 6;</code>
   * @return Whether the cleanupOnFailure field is set.
   */
  public boolean hasCleanupOnFailure() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>optional bool cleanup_on_failure = 6;</code>
   * @return The cleanupOnFailure.
   */
  public boolean getCleanupOnFailure() {
    return cleanupOnFailure_;
  }

  public static final int MEDIUM_TYPE_FIELD_NUMBER = 7;
  private volatile java.lang.Object mediumType_;
  /**
   * <code>optional string medium_type = 7;</code>
   * @return Whether the mediumType field is set.
   */
  public boolean hasMediumType() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>optional string medium_type = 7;</code>
   * @return The mediumType.
   */
  public java.lang.String getMediumType() {
    java.lang.Object ref = mediumType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        mediumType_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string medium_type = 7;</code>
   * @return The bytes for mediumType.
   */
  public com.google.protobuf.ByteString
      getMediumTypeBytes() {
    java.lang.Object ref = mediumType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mediumType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PIN_ON_CREATE_FIELD_NUMBER = 8;
  private boolean pinOnCreate_;
  /**
   * <code>optional bool pin_on_create = 8;</code>
   * @return Whether the pinOnCreate field is set.
   */
  public boolean hasPinOnCreate() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <code>optional bool pin_on_create = 8;</code>
   * @return The pinOnCreate.
   */
  public boolean getPinOnCreate() {
    return pinOnCreate_;
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
      output.writeInt64(1, blockId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(3, tier_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(4, spaceToReserve_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeBool(5, onlyReserveSpace_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeBool(6, cleanupOnFailure_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, mediumType_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      output.writeBool(8, pinOnCreate_);
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
        .computeInt64Size(1, blockId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, tier_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, spaceToReserve_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, onlyReserveSpace_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, cleanupOnFailure_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, mediumType_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, pinOnCreate_);
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
    if (!(obj instanceof alluxio.grpc.CreateLocalBlockRequest)) {
      return super.equals(obj);
    }
    alluxio.grpc.CreateLocalBlockRequest other = (alluxio.grpc.CreateLocalBlockRequest) obj;

    if (hasBlockId() != other.hasBlockId()) return false;
    if (hasBlockId()) {
      if (getBlockId()
          != other.getBlockId()) return false;
    }
    if (hasTier() != other.hasTier()) return false;
    if (hasTier()) {
      if (getTier()
          != other.getTier()) return false;
    }
    if (hasSpaceToReserve() != other.hasSpaceToReserve()) return false;
    if (hasSpaceToReserve()) {
      if (getSpaceToReserve()
          != other.getSpaceToReserve()) return false;
    }
    if (hasOnlyReserveSpace() != other.hasOnlyReserveSpace()) return false;
    if (hasOnlyReserveSpace()) {
      if (getOnlyReserveSpace()
          != other.getOnlyReserveSpace()) return false;
    }
    if (hasCleanupOnFailure() != other.hasCleanupOnFailure()) return false;
    if (hasCleanupOnFailure()) {
      if (getCleanupOnFailure()
          != other.getCleanupOnFailure()) return false;
    }
    if (hasMediumType() != other.hasMediumType()) return false;
    if (hasMediumType()) {
      if (!getMediumType()
          .equals(other.getMediumType())) return false;
    }
    if (hasPinOnCreate() != other.hasPinOnCreate()) return false;
    if (hasPinOnCreate()) {
      if (getPinOnCreate()
          != other.getPinOnCreate()) return false;
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
    if (hasBlockId()) {
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBlockId());
    }
    if (hasTier()) {
      hash = (37 * hash) + TIER_FIELD_NUMBER;
      hash = (53 * hash) + getTier();
    }
    if (hasSpaceToReserve()) {
      hash = (37 * hash) + SPACE_TO_RESERVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSpaceToReserve());
    }
    if (hasOnlyReserveSpace()) {
      hash = (37 * hash) + ONLY_RESERVE_SPACE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOnlyReserveSpace());
    }
    if (hasCleanupOnFailure()) {
      hash = (37 * hash) + CLEANUP_ON_FAILURE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getCleanupOnFailure());
    }
    if (hasMediumType()) {
      hash = (37 * hash) + MEDIUM_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMediumType().hashCode();
    }
    if (hasPinOnCreate()) {
      hash = (37 * hash) + PIN_ON_CREATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getPinOnCreate());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.CreateLocalBlockRequest parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.CreateLocalBlockRequest prototype) {
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
   * <pre>
   * next available id: 9
   * </pre>
   *
   * Protobuf type {@code alluxio.grpc.block.CreateLocalBlockRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.block.CreateLocalBlockRequest)
      alluxio.grpc.CreateLocalBlockRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_CreateLocalBlockRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_CreateLocalBlockRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.CreateLocalBlockRequest.class, alluxio.grpc.CreateLocalBlockRequest.Builder.class);
    }

    // Construct using alluxio.grpc.CreateLocalBlockRequest.newBuilder()
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
      blockId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      tier_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      spaceToReserve_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      onlyReserveSpace_ = false;
      bitField0_ = (bitField0_ & ~0x00000008);
      cleanupOnFailure_ = false;
      bitField0_ = (bitField0_ & ~0x00000010);
      mediumType_ = "";
      bitField0_ = (bitField0_ & ~0x00000020);
      pinOnCreate_ = false;
      bitField0_ = (bitField0_ & ~0x00000040);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_CreateLocalBlockRequest_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.CreateLocalBlockRequest getDefaultInstanceForType() {
      return alluxio.grpc.CreateLocalBlockRequest.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.CreateLocalBlockRequest build() {
      alluxio.grpc.CreateLocalBlockRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.CreateLocalBlockRequest buildPartial() {
      alluxio.grpc.CreateLocalBlockRequest result = new alluxio.grpc.CreateLocalBlockRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blockId_ = blockId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tier_ = tier_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.spaceToReserve_ = spaceToReserve_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.onlyReserveSpace_ = onlyReserveSpace_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.cleanupOnFailure_ = cleanupOnFailure_;
        to_bitField0_ |= 0x00000010;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        to_bitField0_ |= 0x00000020;
      }
      result.mediumType_ = mediumType_;
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.pinOnCreate_ = pinOnCreate_;
        to_bitField0_ |= 0x00000040;
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
      if (other instanceof alluxio.grpc.CreateLocalBlockRequest) {
        return mergeFrom((alluxio.grpc.CreateLocalBlockRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.CreateLocalBlockRequest other) {
      if (other == alluxio.grpc.CreateLocalBlockRequest.getDefaultInstance()) return this;
      if (other.hasBlockId()) {
        setBlockId(other.getBlockId());
      }
      if (other.hasTier()) {
        setTier(other.getTier());
      }
      if (other.hasSpaceToReserve()) {
        setSpaceToReserve(other.getSpaceToReserve());
      }
      if (other.hasOnlyReserveSpace()) {
        setOnlyReserveSpace(other.getOnlyReserveSpace());
      }
      if (other.hasCleanupOnFailure()) {
        setCleanupOnFailure(other.getCleanupOnFailure());
      }
      if (other.hasMediumType()) {
        bitField0_ |= 0x00000020;
        mediumType_ = other.mediumType_;
        onChanged();
      }
      if (other.hasPinOnCreate()) {
        setPinOnCreate(other.getPinOnCreate());
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
      alluxio.grpc.CreateLocalBlockRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.CreateLocalBlockRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long blockId_ ;
    /**
     * <code>optional int64 block_id = 1;</code>
     * @return Whether the blockId field is set.
     */
    public boolean hasBlockId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 block_id = 1;</code>
     * @return The blockId.
     */
    public long getBlockId() {
      return blockId_;
    }
    /**
     * <code>optional int64 block_id = 1;</code>
     * @param value The blockId to set.
     * @return This builder for chaining.
     */
    public Builder setBlockId(long value) {
      bitField0_ |= 0x00000001;
      blockId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 block_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      blockId_ = 0L;
      onChanged();
      return this;
    }

    private int tier_ ;
    /**
     * <code>optional int32 tier = 3;</code>
     * @return Whether the tier field is set.
     */
    public boolean hasTier() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 tier = 3;</code>
     * @return The tier.
     */
    public int getTier() {
      return tier_;
    }
    /**
     * <code>optional int32 tier = 3;</code>
     * @param value The tier to set.
     * @return This builder for chaining.
     */
    public Builder setTier(int value) {
      bitField0_ |= 0x00000002;
      tier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 tier = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTier() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tier_ = 0;
      onChanged();
      return this;
    }

    private long spaceToReserve_ ;
    /**
     * <code>optional int64 space_to_reserve = 4;</code>
     * @return Whether the spaceToReserve field is set.
     */
    public boolean hasSpaceToReserve() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int64 space_to_reserve = 4;</code>
     * @return The spaceToReserve.
     */
    public long getSpaceToReserve() {
      return spaceToReserve_;
    }
    /**
     * <code>optional int64 space_to_reserve = 4;</code>
     * @param value The spaceToReserve to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceToReserve(long value) {
      bitField0_ |= 0x00000004;
      spaceToReserve_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 space_to_reserve = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceToReserve() {
      bitField0_ = (bitField0_ & ~0x00000004);
      spaceToReserve_ = 0L;
      onChanged();
      return this;
    }

    private boolean onlyReserveSpace_ ;
    /**
     * <pre>
     * If set, only reserve space for the block.
     * </pre>
     *
     * <code>optional bool only_reserve_space = 5;</code>
     * @return Whether the onlyReserveSpace field is set.
     */
    public boolean hasOnlyReserveSpace() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * If set, only reserve space for the block.
     * </pre>
     *
     * <code>optional bool only_reserve_space = 5;</code>
     * @return The onlyReserveSpace.
     */
    public boolean getOnlyReserveSpace() {
      return onlyReserveSpace_;
    }
    /**
     * <pre>
     * If set, only reserve space for the block.
     * </pre>
     *
     * <code>optional bool only_reserve_space = 5;</code>
     * @param value The onlyReserveSpace to set.
     * @return This builder for chaining.
     */
    public Builder setOnlyReserveSpace(boolean value) {
      bitField0_ |= 0x00000008;
      onlyReserveSpace_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, only reserve space for the block.
     * </pre>
     *
     * <code>optional bool only_reserve_space = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnlyReserveSpace() {
      bitField0_ = (bitField0_ & ~0x00000008);
      onlyReserveSpace_ = false;
      onChanged();
      return this;
    }

    private boolean cleanupOnFailure_ ;
    /**
     * <code>optional bool cleanup_on_failure = 6;</code>
     * @return Whether the cleanupOnFailure field is set.
     */
    public boolean hasCleanupOnFailure() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional bool cleanup_on_failure = 6;</code>
     * @return The cleanupOnFailure.
     */
    public boolean getCleanupOnFailure() {
      return cleanupOnFailure_;
    }
    /**
     * <code>optional bool cleanup_on_failure = 6;</code>
     * @param value The cleanupOnFailure to set.
     * @return This builder for chaining.
     */
    public Builder setCleanupOnFailure(boolean value) {
      bitField0_ |= 0x00000010;
      cleanupOnFailure_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool cleanup_on_failure = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCleanupOnFailure() {
      bitField0_ = (bitField0_ & ~0x00000010);
      cleanupOnFailure_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object mediumType_ = "";
    /**
     * <code>optional string medium_type = 7;</code>
     * @return Whether the mediumType field is set.
     */
    public boolean hasMediumType() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional string medium_type = 7;</code>
     * @return The mediumType.
     */
    public java.lang.String getMediumType() {
      java.lang.Object ref = mediumType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mediumType_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string medium_type = 7;</code>
     * @return The bytes for mediumType.
     */
    public com.google.protobuf.ByteString
        getMediumTypeBytes() {
      java.lang.Object ref = mediumType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mediumType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string medium_type = 7;</code>
     * @param value The mediumType to set.
     * @return This builder for chaining.
     */
    public Builder setMediumType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
      mediumType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string medium_type = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearMediumType() {
      bitField0_ = (bitField0_ & ~0x00000020);
      mediumType_ = getDefaultInstance().getMediumType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string medium_type = 7;</code>
     * @param value The bytes for mediumType to set.
     * @return This builder for chaining.
     */
    public Builder setMediumTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
      mediumType_ = value;
      onChanged();
      return this;
    }

    private boolean pinOnCreate_ ;
    /**
     * <code>optional bool pin_on_create = 8;</code>
     * @return Whether the pinOnCreate field is set.
     */
    public boolean hasPinOnCreate() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional bool pin_on_create = 8;</code>
     * @return The pinOnCreate.
     */
    public boolean getPinOnCreate() {
      return pinOnCreate_;
    }
    /**
     * <code>optional bool pin_on_create = 8;</code>
     * @param value The pinOnCreate to set.
     * @return This builder for chaining.
     */
    public Builder setPinOnCreate(boolean value) {
      bitField0_ |= 0x00000040;
      pinOnCreate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool pin_on_create = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearPinOnCreate() {
      bitField0_ = (bitField0_ & ~0x00000040);
      pinOnCreate_ = false;
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.block.CreateLocalBlockRequest)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.block.CreateLocalBlockRequest)
  private static final alluxio.grpc.CreateLocalBlockRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.CreateLocalBlockRequest();
  }

  public static alluxio.grpc.CreateLocalBlockRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CreateLocalBlockRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateLocalBlockRequest>() {
    @java.lang.Override
    public CreateLocalBlockRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateLocalBlockRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateLocalBlockRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateLocalBlockRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.CreateLocalBlockRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

