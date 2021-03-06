// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/meta_master.proto

package alluxio.grpc;

/**
 * Protobuf enum {@code alluxio.grpc.meta.MasterInfoField}
 */
public enum MasterInfoField
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LEADER_MASTER_ADDRESS = 0;</code>
   */
  LEADER_MASTER_ADDRESS(0),
  /**
   * <code>MASTER_ADDRESSES = 1;</code>
   */
  MASTER_ADDRESSES(1),
  /**
   * <code>RPC_PORT = 2;</code>
   */
  RPC_PORT(2),
  /**
   * <code>SAFE_MODE = 3;</code>
   */
  SAFE_MODE(3),
  /**
   * <code>START_TIME_MS = 4;</code>
   */
  START_TIME_MS(4),
  /**
   * <code>UP_TIME_MS = 5;</code>
   */
  UP_TIME_MS(5),
  /**
   * <code>VERSION = 6;</code>
   */
  VERSION(6),
  /**
   * <code>WEB_PORT = 7;</code>
   */
  WEB_PORT(7),
  /**
   * <code>WORKER_ADDRESSES = 8;</code>
   */
  WORKER_ADDRESSES(8),
  /**
   * <code>ZOOKEEPER_ADDRESSES = 9;</code>
   */
  ZOOKEEPER_ADDRESSES(9),
  ;

  /**
   * <code>LEADER_MASTER_ADDRESS = 0;</code>
   */
  public static final int LEADER_MASTER_ADDRESS_VALUE = 0;
  /**
   * <code>MASTER_ADDRESSES = 1;</code>
   */
  public static final int MASTER_ADDRESSES_VALUE = 1;
  /**
   * <code>RPC_PORT = 2;</code>
   */
  public static final int RPC_PORT_VALUE = 2;
  /**
   * <code>SAFE_MODE = 3;</code>
   */
  public static final int SAFE_MODE_VALUE = 3;
  /**
   * <code>START_TIME_MS = 4;</code>
   */
  public static final int START_TIME_MS_VALUE = 4;
  /**
   * <code>UP_TIME_MS = 5;</code>
   */
  public static final int UP_TIME_MS_VALUE = 5;
  /**
   * <code>VERSION = 6;</code>
   */
  public static final int VERSION_VALUE = 6;
  /**
   * <code>WEB_PORT = 7;</code>
   */
  public static final int WEB_PORT_VALUE = 7;
  /**
   * <code>WORKER_ADDRESSES = 8;</code>
   */
  public static final int WORKER_ADDRESSES_VALUE = 8;
  /**
   * <code>ZOOKEEPER_ADDRESSES = 9;</code>
   */
  public static final int ZOOKEEPER_ADDRESSES_VALUE = 9;


  public final int getNumber() {
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MasterInfoField valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MasterInfoField forNumber(int value) {
    switch (value) {
      case 0: return LEADER_MASTER_ADDRESS;
      case 1: return MASTER_ADDRESSES;
      case 2: return RPC_PORT;
      case 3: return SAFE_MODE;
      case 4: return START_TIME_MS;
      case 5: return UP_TIME_MS;
      case 6: return VERSION;
      case 7: return WEB_PORT;
      case 8: return WORKER_ADDRESSES;
      case 9: return ZOOKEEPER_ADDRESSES;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MasterInfoField>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MasterInfoField> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MasterInfoField>() {
          public MasterInfoField findValueByNumber(int number) {
            return MasterInfoField.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return alluxio.grpc.MetaMasterProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final MasterInfoField[] VALUES = values();

  public static MasterInfoField valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MasterInfoField(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:alluxio.grpc.meta.MasterInfoField)
}

