// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

public interface JobInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.job.JobInfo)
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
   * <code>optional string errorMessage = 2;</code>
   * @return Whether the errorMessage field is set.
   */
  boolean hasErrorMessage();
  /**
   * <code>optional string errorMessage = 2;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <code>optional string errorMessage = 2;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <code>optional .alluxio.grpc.job.Status status = 4;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>optional .alluxio.grpc.job.Status status = 4;</code>
   * @return The status.
   */
  alluxio.grpc.Status getStatus();

  /**
   * <code>optional int64 lastUpdated = 6;</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>optional int64 lastUpdated = 6;</code>
   * @return The lastUpdated.
   */
  long getLastUpdated();

  /**
   * <code>optional .alluxio.grpc.job.JobType type = 8;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .alluxio.grpc.job.JobType type = 8;</code>
   * @return The type.
   */
  alluxio.grpc.JobType getType();

  /**
   * <code>optional bytes result = 9;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>optional bytes result = 9;</code>
   * @return The result.
   */
  com.google.protobuf.ByteString getResult();

  /**
   * <pre>
   * Some jobs don't have these do not have these
   * </pre>
   *
   * <code>optional string name = 7;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Some jobs don't have these do not have these
   * </pre>
   *
   * <code>optional string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Some jobs don't have these do not have these
   * </pre>
   *
   * <code>optional string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int64 parentId = 10;</code>
   * @return Whether the parentId field is set.
   */
  boolean hasParentId();
  /**
   * <code>optional int64 parentId = 10;</code>
   * @return The parentId.
   */
  long getParentId();

  /**
   * <code>repeated .alluxio.grpc.job.JobInfo children = 11;</code>
   */
  java.util.List<alluxio.grpc.JobInfo> 
      getChildrenList();
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo children = 11;</code>
   */
  alluxio.grpc.JobInfo getChildren(int index);
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo children = 11;</code>
   */
  int getChildrenCount();
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo children = 11;</code>
   */
  java.util.List<? extends alluxio.grpc.JobInfoOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo children = 11;</code>
   */
  alluxio.grpc.JobInfoOrBuilder getChildrenOrBuilder(
      int index);

  /**
   * <code>optional string workerHost = 12;</code>
   * @return Whether the workerHost field is set.
   */
  boolean hasWorkerHost();
  /**
   * <code>optional string workerHost = 12;</code>
   * @return The workerHost.
   */
  java.lang.String getWorkerHost();
  /**
   * <code>optional string workerHost = 12;</code>
   * @return The bytes for workerHost.
   */
  com.google.protobuf.ByteString
      getWorkerHostBytes();

  /**
   * <code>optional string description = 13;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 13;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 13;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Around for backwards compatibility
   * </pre>
   *
   * <code>repeated .alluxio.grpc.job.JobUnused unused0 = 3;</code>
   */
  java.util.List<alluxio.grpc.JobUnused> 
      getUnused0List();
  /**
   * <pre>
   * Around for backwards compatibility
   * </pre>
   *
   * <code>repeated .alluxio.grpc.job.JobUnused unused0 = 3;</code>
   */
  alluxio.grpc.JobUnused getUnused0(int index);
  /**
   * <pre>
   * Around for backwards compatibility
   * </pre>
   *
   * <code>repeated .alluxio.grpc.job.JobUnused unused0 = 3;</code>
   */
  int getUnused0Count();
  /**
   * <pre>
   * Around for backwards compatibility
   * </pre>
   *
   * <code>repeated .alluxio.grpc.job.JobUnused unused0 = 3;</code>
   */
  java.util.List<? extends alluxio.grpc.JobUnusedOrBuilder> 
      getUnused0OrBuilderList();
  /**
   * <pre>
   * Around for backwards compatibility
   * </pre>
   *
   * <code>repeated .alluxio.grpc.job.JobUnused unused0 = 3;</code>
   */
  alluxio.grpc.JobUnusedOrBuilder getUnused0OrBuilder(
      int index);

  /**
   * <pre>
   * formerly result
   * </pre>
   *
   * <code>optional string unused1 = 5;</code>
   * @return Whether the unused1 field is set.
   */
  boolean hasUnused1();
  /**
   * <pre>
   * formerly result
   * </pre>
   *
   * <code>optional string unused1 = 5;</code>
   * @return The unused1.
   */
  java.lang.String getUnused1();
  /**
   * <pre>
   * formerly result
   * </pre>
   *
   * <code>optional string unused1 = 5;</code>
   * @return The bytes for unused1.
   */
  com.google.protobuf.ByteString
      getUnused1Bytes();
}
