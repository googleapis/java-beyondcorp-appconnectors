/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/beyondcorp/appconnectors/v1/app_connector_instance_config.proto

package com.google.cloud.beyondcorp.appconnectors.v1;

public interface AppConnectorInstanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.appconnectors.v1.AppConnectorInstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A monotonically increasing number generated and maintained
   * by the API provider. Every time a config changes in the backend, the
   * sequenceNumber should be bumped up to reflect the change.
   * </pre>
   *
   * <code>int64 sequence_number = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sequenceNumber.
   */
  long getSequenceNumber();

  /**
   *
   *
   * <pre>
   * The SLM instance agent configuration.
   * </pre>
   *
   * <code>.google.protobuf.Any instance_config = 2;</code>
   *
   * @return Whether the instanceConfig field is set.
   */
  boolean hasInstanceConfig();
  /**
   *
   *
   * <pre>
   * The SLM instance agent configuration.
   * </pre>
   *
   * <code>.google.protobuf.Any instance_config = 2;</code>
   *
   * @return The instanceConfig.
   */
  com.google.protobuf.Any getInstanceConfig();
  /**
   *
   *
   * <pre>
   * The SLM instance agent configuration.
   * </pre>
   *
   * <code>.google.protobuf.Any instance_config = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getInstanceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * NotificationConfig defines the notification mechanism that the remote
   * instance should subscribe to in order to receive notification.
   * </pre>
   *
   * <code>.google.cloud.beyondcorp.appconnectors.v1.NotificationConfig notification_config = 3;
   * </code>
   *
   * @return Whether the notificationConfig field is set.
   */
  boolean hasNotificationConfig();
  /**
   *
   *
   * <pre>
   * NotificationConfig defines the notification mechanism that the remote
   * instance should subscribe to in order to receive notification.
   * </pre>
   *
   * <code>.google.cloud.beyondcorp.appconnectors.v1.NotificationConfig notification_config = 3;
   * </code>
   *
   * @return The notificationConfig.
   */
  com.google.cloud.beyondcorp.appconnectors.v1.NotificationConfig getNotificationConfig();
  /**
   *
   *
   * <pre>
   * NotificationConfig defines the notification mechanism that the remote
   * instance should subscribe to in order to receive notification.
   * </pre>
   *
   * <code>.google.cloud.beyondcorp.appconnectors.v1.NotificationConfig notification_config = 3;
   * </code>
   */
  com.google.cloud.beyondcorp.appconnectors.v1.NotificationConfigOrBuilder
      getNotificationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * ImageConfig defines the GCR images to run for the remote agent's control
   * plane.
   * </pre>
   *
   * <code>.google.cloud.beyondcorp.appconnectors.v1.ImageConfig image_config = 4;</code>
   *
   * @return Whether the imageConfig field is set.
   */
  boolean hasImageConfig();
  /**
   *
   *
   * <pre>
   * ImageConfig defines the GCR images to run for the remote agent's control
   * plane.
   * </pre>
   *
   * <code>.google.cloud.beyondcorp.appconnectors.v1.ImageConfig image_config = 4;</code>
   *
   * @return The imageConfig.
   */
  com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig getImageConfig();
  /**
   *
   *
   * <pre>
   * ImageConfig defines the GCR images to run for the remote agent's control
   * plane.
   * </pre>
   *
   * <code>.google.cloud.beyondcorp.appconnectors.v1.ImageConfig image_config = 4;</code>
   */
  com.google.cloud.beyondcorp.appconnectors.v1.ImageConfigOrBuilder getImageConfigOrBuilder();
}
