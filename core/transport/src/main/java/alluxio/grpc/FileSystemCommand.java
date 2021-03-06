// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.file.FileSystemCommand}
 */
public  final class FileSystemCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.file.FileSystemCommand)
    FileSystemCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileSystemCommand.newBuilder() to construct.
  private FileSystemCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileSystemCommand() {
    commandType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileSystemCommand();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FileSystemCommand(
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
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            alluxio.grpc.CommandType value = alluxio.grpc.CommandType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              commandType_ = rawValue;
            }
            break;
          }
          case 18: {
            alluxio.grpc.FileSystemCommandOptions.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = commandOptions_.toBuilder();
            }
            commandOptions_ = input.readMessage(alluxio.grpc.FileSystemCommandOptions.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commandOptions_);
              commandOptions_ = subBuilder.buildPartial();
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
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_FileSystemCommand_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_FileSystemCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.FileSystemCommand.class, alluxio.grpc.FileSystemCommand.Builder.class);
  }

  private int bitField0_;
  public static final int COMMANDTYPE_FIELD_NUMBER = 1;
  private int commandType_;
  /**
   * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
   * @return Whether the commandType field is set.
   */
  public boolean hasCommandType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
   * @return The commandType.
   */
  public alluxio.grpc.CommandType getCommandType() {
    @SuppressWarnings("deprecation")
    alluxio.grpc.CommandType result = alluxio.grpc.CommandType.valueOf(commandType_);
    return result == null ? alluxio.grpc.CommandType.Unknown : result;
  }

  public static final int COMMANDOPTIONS_FIELD_NUMBER = 2;
  private alluxio.grpc.FileSystemCommandOptions commandOptions_;
  /**
   * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
   * @return Whether the commandOptions field is set.
   */
  public boolean hasCommandOptions() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
   * @return The commandOptions.
   */
  public alluxio.grpc.FileSystemCommandOptions getCommandOptions() {
    return commandOptions_ == null ? alluxio.grpc.FileSystemCommandOptions.getDefaultInstance() : commandOptions_;
  }
  /**
   * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
   */
  public alluxio.grpc.FileSystemCommandOptionsOrBuilder getCommandOptionsOrBuilder() {
    return commandOptions_ == null ? alluxio.grpc.FileSystemCommandOptions.getDefaultInstance() : commandOptions_;
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
      output.writeEnum(1, commandType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getCommandOptions());
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
        .computeEnumSize(1, commandType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCommandOptions());
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
    if (!(obj instanceof alluxio.grpc.FileSystemCommand)) {
      return super.equals(obj);
    }
    alluxio.grpc.FileSystemCommand other = (alluxio.grpc.FileSystemCommand) obj;

    if (hasCommandType() != other.hasCommandType()) return false;
    if (hasCommandType()) {
      if (commandType_ != other.commandType_) return false;
    }
    if (hasCommandOptions() != other.hasCommandOptions()) return false;
    if (hasCommandOptions()) {
      if (!getCommandOptions()
          .equals(other.getCommandOptions())) return false;
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
    if (hasCommandType()) {
      hash = (37 * hash) + COMMANDTYPE_FIELD_NUMBER;
      hash = (53 * hash) + commandType_;
    }
    if (hasCommandOptions()) {
      hash = (37 * hash) + COMMANDOPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCommandOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.FileSystemCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FileSystemCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FileSystemCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FileSystemCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FileSystemCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FileSystemCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FileSystemCommand parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.FileSystemCommand prototype) {
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
   * Protobuf type {@code alluxio.grpc.file.FileSystemCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.file.FileSystemCommand)
      alluxio.grpc.FileSystemCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_FileSystemCommand_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_FileSystemCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.FileSystemCommand.class, alluxio.grpc.FileSystemCommand.Builder.class);
    }

    // Construct using alluxio.grpc.FileSystemCommand.newBuilder()
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
        getCommandOptionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      commandType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (commandOptionsBuilder_ == null) {
        commandOptions_ = null;
      } else {
        commandOptionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_FileSystemCommand_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.FileSystemCommand getDefaultInstanceForType() {
      return alluxio.grpc.FileSystemCommand.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.FileSystemCommand build() {
      alluxio.grpc.FileSystemCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.FileSystemCommand buildPartial() {
      alluxio.grpc.FileSystemCommand result = new alluxio.grpc.FileSystemCommand(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.commandType_ = commandType_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (commandOptionsBuilder_ == null) {
          result.commandOptions_ = commandOptions_;
        } else {
          result.commandOptions_ = commandOptionsBuilder_.build();
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
      if (other instanceof alluxio.grpc.FileSystemCommand) {
        return mergeFrom((alluxio.grpc.FileSystemCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.FileSystemCommand other) {
      if (other == alluxio.grpc.FileSystemCommand.getDefaultInstance()) return this;
      if (other.hasCommandType()) {
        setCommandType(other.getCommandType());
      }
      if (other.hasCommandOptions()) {
        mergeCommandOptions(other.getCommandOptions());
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
      alluxio.grpc.FileSystemCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.FileSystemCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int commandType_ = 0;
    /**
     * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
     * @return Whether the commandType field is set.
     */
    public boolean hasCommandType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
     * @return The commandType.
     */
    public alluxio.grpc.CommandType getCommandType() {
      @SuppressWarnings("deprecation")
      alluxio.grpc.CommandType result = alluxio.grpc.CommandType.valueOf(commandType_);
      return result == null ? alluxio.grpc.CommandType.Unknown : result;
    }
    /**
     * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
     * @param value The commandType to set.
     * @return This builder for chaining.
     */
    public Builder setCommandType(alluxio.grpc.CommandType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      commandType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.CommandType commandType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommandType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      commandType_ = 0;
      onChanged();
      return this;
    }

    private alluxio.grpc.FileSystemCommandOptions commandOptions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.FileSystemCommandOptions, alluxio.grpc.FileSystemCommandOptions.Builder, alluxio.grpc.FileSystemCommandOptionsOrBuilder> commandOptionsBuilder_;
    /**
     * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
     * @return Whether the commandOptions field is set.
     */
    public boolean hasCommandOptions() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
     * @return The commandOptions.
     */
    public alluxio.grpc.FileSystemCommandOptions getCommandOptions() {
      if (commandOptionsBuilder_ == null) {
        return commandOptions_ == null ? alluxio.grpc.FileSystemCommandOptions.getDefaultInstance() : commandOptions_;
      } else {
        return commandOptionsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
     */
    public Builder setCommandOptions(alluxio.grpc.FileSystemCommandOptions value) {
      if (commandOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commandOptions_ = value;
        onChanged();
      } else {
        commandOptionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
     */
    public Builder setCommandOptions(
        alluxio.grpc.FileSystemCommandOptions.Builder builderForValue) {
      if (commandOptionsBuilder_ == null) {
        commandOptions_ = builderForValue.build();
        onChanged();
      } else {
        commandOptionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
     */
    public Builder mergeCommandOptions(alluxio.grpc.FileSystemCommandOptions value) {
      if (commandOptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            commandOptions_ != null &&
            commandOptions_ != alluxio.grpc.FileSystemCommandOptions.getDefaultInstance()) {
          commandOptions_ =
            alluxio.grpc.FileSystemCommandOptions.newBuilder(commandOptions_).mergeFrom(value).buildPartial();
        } else {
          commandOptions_ = value;
        }
        onChanged();
      } else {
        commandOptionsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
     */
    public Builder clearCommandOptions() {
      if (commandOptionsBuilder_ == null) {
        commandOptions_ = null;
        onChanged();
      } else {
        commandOptionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
     */
    public alluxio.grpc.FileSystemCommandOptions.Builder getCommandOptionsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCommandOptionsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
     */
    public alluxio.grpc.FileSystemCommandOptionsOrBuilder getCommandOptionsOrBuilder() {
      if (commandOptionsBuilder_ != null) {
        return commandOptionsBuilder_.getMessageOrBuilder();
      } else {
        return commandOptions_ == null ?
            alluxio.grpc.FileSystemCommandOptions.getDefaultInstance() : commandOptions_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.file.FileSystemCommandOptions commandOptions = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.FileSystemCommandOptions, alluxio.grpc.FileSystemCommandOptions.Builder, alluxio.grpc.FileSystemCommandOptionsOrBuilder> 
        getCommandOptionsFieldBuilder() {
      if (commandOptionsBuilder_ == null) {
        commandOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.FileSystemCommandOptions, alluxio.grpc.FileSystemCommandOptions.Builder, alluxio.grpc.FileSystemCommandOptionsOrBuilder>(
                getCommandOptions(),
                getParentForChildren(),
                isClean());
        commandOptions_ = null;
      }
      return commandOptionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.file.FileSystemCommand)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.file.FileSystemCommand)
  private static final alluxio.grpc.FileSystemCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.FileSystemCommand();
  }

  public static alluxio.grpc.FileSystemCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<FileSystemCommand>
      PARSER = new com.google.protobuf.AbstractParser<FileSystemCommand>() {
    @java.lang.Override
    public FileSystemCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FileSystemCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileSystemCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileSystemCommand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.FileSystemCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

