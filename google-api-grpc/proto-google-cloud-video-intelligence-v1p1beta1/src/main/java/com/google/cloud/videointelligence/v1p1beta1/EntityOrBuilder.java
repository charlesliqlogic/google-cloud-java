// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface EntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.Entity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Opaque entity ID. Some IDs may be available in
   * [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * </pre>
   *
   * <code>string entity_id = 1;</code>
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * Opaque entity ID. Some IDs may be available in
   * [Google Knowledge Graph Search
   * API](https://developers.google.com/knowledge-graph/).
   * </pre>
   *
   * <code>string entity_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <pre>
   * Textual description, e.g. `Fixed-gear bicycle`.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Textual description, e.g. `Fixed-gear bicycle`.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Language code for `description` in BCP-47 format.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Language code for `description` in BCP-47 format.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}
