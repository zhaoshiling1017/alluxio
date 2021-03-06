// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface CreateDirectoryPOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.CreateDirectoryPOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool recursive = 1;</code>
   * @return Whether the recursive field is set.
   */
  boolean hasRecursive();
  /**
   * <code>optional bool recursive = 1;</code>
   * @return The recursive.
   */
  boolean getRecursive();

  /**
   * <code>optional bool allowExists = 2;</code>
   * @return Whether the allowExists field is set.
   */
  boolean hasAllowExists();
  /**
   * <code>optional bool allowExists = 2;</code>
   * @return The allowExists.
   */
  boolean getAllowExists();

  /**
   * <code>optional .alluxio.grpc.PMode mode = 3;</code>
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   * <code>optional .alluxio.grpc.PMode mode = 3;</code>
   * @return The mode.
   */
  alluxio.grpc.PMode getMode();
  /**
   * <code>optional .alluxio.grpc.PMode mode = 3;</code>
   */
  alluxio.grpc.PModeOrBuilder getModeOrBuilder();

  /**
   * <code>optional .alluxio.grpc.file.WritePType writeType = 4;</code>
   * @return Whether the writeType field is set.
   */
  boolean hasWriteType();
  /**
   * <code>optional .alluxio.grpc.file.WritePType writeType = 4;</code>
   * @return The writeType.
   */
  alluxio.grpc.WritePType getWriteType();

  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 5;</code>
   * @return Whether the commonOptions field is set.
   */
  boolean hasCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 5;</code>
   * @return The commonOptions.
   */
  alluxio.grpc.FileSystemMasterCommonPOptions getCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 5;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder getCommonOptionsOrBuilder();
}
