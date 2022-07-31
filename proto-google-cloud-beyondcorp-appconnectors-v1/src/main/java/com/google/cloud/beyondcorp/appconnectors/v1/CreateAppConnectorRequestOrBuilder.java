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
// source: google/cloud/beyondcorp/appconnectors/v1/app_connectors_service.proto

package com.google.cloud.beyondcorp.appconnectors.v1;

public interface CreateAppConnectorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.appconnectors.v1.CreateAppConnectorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource project name of the AppConnector location using the
   * form: `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource project name of the AppConnector location using the
   * form: `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. User-settable AppConnector resource ID.
   *  * Must start with a letter.
   *  * Must contain between 4-63 characters from `/[a-z][0-9]-/`.
   *  * Must end with a number or a letter.
   * </pre>
   *
   * <code>string app_connector_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The appConnectorId.
   */
  java.lang.String getAppConnectorId();
  /**
   *
   *
   * <pre>
   * Optional. User-settable AppConnector resource ID.
   *  * Must start with a letter.
   *  * Must contain between 4-63 characters from `/[a-z][0-9]-/`.
   *  * Must end with a number or a letter.
   * </pre>
   *
   * <code>string app_connector_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for appConnectorId.
   */
  com.google.protobuf.ByteString getAppConnectorIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A BeyondCorp AppConnector resource.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnectors.v1.AppConnector app_connector = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the appConnector field is set.
   */
  boolean hasAppConnector();
  /**
   *
   *
   * <pre>
   * Required. A BeyondCorp AppConnector resource.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnectors.v1.AppConnector app_connector = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The appConnector.
   */
  com.google.cloud.beyondcorp.appconnectors.v1.AppConnector getAppConnector();
  /**
   *
   *
   * <pre>
   * Required. A BeyondCorp AppConnector resource.
   * </pre>
   *
   * <code>
   * .google.cloud.beyondcorp.appconnectors.v1.AppConnector app_connector = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.beyondcorp.appconnectors.v1.AppConnectorOrBuilder getAppConnectorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set, validates request by executing a dry-run which would not
   * alter the resource in any way.
   * </pre>
   *
   * <code>bool validate_only = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
