// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface AttachDatabasePResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.AttachDatabasePResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TODO(gpang): remove in favor of status
   * </pre>
   *
   * <code>optional bool success = 1;</code>
   * @return Whether the success field is set.
   */
  boolean hasSuccess();
  /**
   * <pre>
   * TODO(gpang): remove in favor of status
   * </pre>
   *
   * <code>optional bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>optional .alluxio.grpc.table.SyncStatus sync_status = 2;</code>
   * @return Whether the syncStatus field is set.
   */
  boolean hasSyncStatus();
  /**
   * <code>optional .alluxio.grpc.table.SyncStatus sync_status = 2;</code>
   * @return The syncStatus.
   */
  alluxio.grpc.table.SyncStatus getSyncStatus();
  /**
   * <code>optional .alluxio.grpc.table.SyncStatus sync_status = 2;</code>
   */
  alluxio.grpc.table.SyncStatusOrBuilder getSyncStatusOrBuilder();
}
