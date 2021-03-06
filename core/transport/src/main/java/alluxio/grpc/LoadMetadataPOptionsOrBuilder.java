// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface LoadMetadataPOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.LoadMetadataPOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** whether to load metadata recursively 
   * </pre>
   *
   * <code>optional bool recursive = 1;</code>
   * @return Whether the recursive field is set.
   */
  boolean hasRecursive();
  /**
   * <pre>
   ** whether to load metadata recursively 
   * </pre>
   *
   * <code>optional bool recursive = 1;</code>
   * @return The recursive.
   */
  boolean getRecursive();

  /**
   * <code>optional bool createAncestors = 2;</code>
   * @return Whether the createAncestors field is set.
   */
  boolean hasCreateAncestors();
  /**
   * <code>optional bool createAncestors = 2;</code>
   * @return The createAncestors.
   */
  boolean getCreateAncestors();

  /**
   * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
   * @return Whether the loadDescendantType field is set.
   */
  boolean hasLoadDescendantType();
  /**
   * <code>optional .alluxio.grpc.fscommon.LoadDescendantPType loadDescendantType = 3;</code>
   * @return The loadDescendantType.
   */
  alluxio.grpc.LoadDescendantPType getLoadDescendantType();

  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
   * @return Whether the commonOptions field is set.
   */
  boolean hasCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
   * @return The commonOptions.
   */
  alluxio.grpc.FileSystemMasterCommonPOptions getCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 4;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder getCommonOptionsOrBuilder();
}
