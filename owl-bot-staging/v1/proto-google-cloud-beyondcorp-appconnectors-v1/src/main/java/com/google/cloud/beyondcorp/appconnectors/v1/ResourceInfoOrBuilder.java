// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/beyondcorp/appconnectors/v1/resource_info.proto

package com.google.cloud.beyondcorp.appconnectors.v1;

public interface ResourceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.appconnectors.v1.ResourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Unique Id for the resource.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Required. Unique Id for the resource.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Overall health status. Overall status is derived based on the status of
   * each sub level resources.
   * </pre>
   *
   * <code>.google.cloud.beyondcorp.appconnectors.v1.HealthStatus status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Overall health status. Overall status is derived based on the status of
   * each sub level resources.
   * </pre>
   *
   * <code>.google.cloud.beyondcorp.appconnectors.v1.HealthStatus status = 2;</code>
   * @return The status.
   */
  com.google.cloud.beyondcorp.appconnectors.v1.HealthStatus getStatus();

  /**
   * <pre>
   * Specific details for the resource. This is for internal use only.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 3;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * Specific details for the resource. This is for internal use only.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 3;</code>
   * @return The resource.
   */
  com.google.protobuf.Any getResource();
  /**
   * <pre>
   * Specific details for the resource. This is for internal use only.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * The timestamp to collect the info. It is suggested to be set by
   * the topmost level resource only.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <pre>
   * The timestamp to collect the info. It is suggested to be set by
   * the topmost level resource only.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4;</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <pre>
   * The timestamp to collect the info. It is suggested to be set by
   * the topmost level resource only.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  java.util.List<com.google.cloud.beyondcorp.appconnectors.v1.ResourceInfo> 
      getSubList();
  /**
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  com.google.cloud.beyondcorp.appconnectors.v1.ResourceInfo getSub(int index);
  /**
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  int getSubCount();
  /**
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  java.util.List<? extends com.google.cloud.beyondcorp.appconnectors.v1.ResourceInfoOrBuilder> 
      getSubOrBuilderList();
  /**
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  com.google.cloud.beyondcorp.appconnectors.v1.ResourceInfoOrBuilder getSubOrBuilder(
      int index);
}