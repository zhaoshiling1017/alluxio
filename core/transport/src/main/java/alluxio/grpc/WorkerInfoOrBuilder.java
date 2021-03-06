// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_master.proto

package alluxio.grpc;

public interface WorkerInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.block.WorkerInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>optional .alluxio.grpc.WorkerNetAddress address = 2;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>optional .alluxio.grpc.WorkerNetAddress address = 2;</code>
   * @return The address.
   */
  alluxio.grpc.WorkerNetAddress getAddress();
  /**
   * <code>optional .alluxio.grpc.WorkerNetAddress address = 2;</code>
   */
  alluxio.grpc.WorkerNetAddressOrBuilder getAddressOrBuilder();

  /**
   * <code>optional int32 lastContactSec = 3;</code>
   * @return Whether the lastContactSec field is set.
   */
  boolean hasLastContactSec();
  /**
   * <code>optional int32 lastContactSec = 3;</code>
   * @return The lastContactSec.
   */
  int getLastContactSec();

  /**
   * <code>optional string state = 4;</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <code>optional string state = 4;</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <code>optional string state = 4;</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <code>optional int64 capacityBytes = 5;</code>
   * @return Whether the capacityBytes field is set.
   */
  boolean hasCapacityBytes();
  /**
   * <code>optional int64 capacityBytes = 5;</code>
   * @return The capacityBytes.
   */
  long getCapacityBytes();

  /**
   * <code>optional int64 usedBytes = 6;</code>
   * @return Whether the usedBytes field is set.
   */
  boolean hasUsedBytes();
  /**
   * <code>optional int64 usedBytes = 6;</code>
   * @return The usedBytes.
   */
  long getUsedBytes();

  /**
   * <code>optional int64 startTimeMs = 7;</code>
   * @return Whether the startTimeMs field is set.
   */
  boolean hasStartTimeMs();
  /**
   * <code>optional int64 startTimeMs = 7;</code>
   * @return The startTimeMs.
   */
  long getStartTimeMs();

  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 8;</code>
   */
  int getCapacityBytesOnTiersCount();
  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 8;</code>
   */
  boolean containsCapacityBytesOnTiers(
      java.lang.String key);
  /**
   * Use {@link #getCapacityBytesOnTiersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getCapacityBytesOnTiers();
  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getCapacityBytesOnTiersMap();
  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 8;</code>
   */

  long getCapacityBytesOnTiersOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <code>map&lt;string, int64&gt; capacityBytesOnTiers = 8;</code>
   */

  long getCapacityBytesOnTiersOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 9;</code>
   */
  int getUsedBytesOnTiersCount();
  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 9;</code>
   */
  boolean containsUsedBytesOnTiers(
      java.lang.String key);
  /**
   * Use {@link #getUsedBytesOnTiersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getUsedBytesOnTiers();
  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getUsedBytesOnTiersMap();
  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 9;</code>
   */

  long getUsedBytesOnTiersOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <code>map&lt;string, int64&gt; usedBytesOnTiers = 9;</code>
   */

  long getUsedBytesOnTiersOrThrow(
      java.lang.String key);
}
