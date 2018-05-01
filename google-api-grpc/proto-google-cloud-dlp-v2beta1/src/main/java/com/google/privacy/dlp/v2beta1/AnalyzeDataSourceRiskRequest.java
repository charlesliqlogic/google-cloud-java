// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

/**
 * <pre>
 * Request for creating a risk analysis operation.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest}
 */
public  final class AnalyzeDataSourceRiskRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest)
    AnalyzeDataSourceRiskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnalyzeDataSourceRiskRequest.newBuilder() to construct.
  private AnalyzeDataSourceRiskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnalyzeDataSourceRiskRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnalyzeDataSourceRiskRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.privacy.dlp.v2beta1.PrivacyMetric.Builder subBuilder = null;
            if (privacyMetric_ != null) {
              subBuilder = privacyMetric_.toBuilder();
            }
            privacyMetric_ = input.readMessage(com.google.privacy.dlp.v2beta1.PrivacyMetric.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(privacyMetric_);
              privacyMetric_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.privacy.dlp.v2beta1.BigQueryTable.Builder subBuilder = null;
            if (sourceTable_ != null) {
              subBuilder = sourceTable_.toBuilder();
            }
            sourceTable_ = input.readMessage(com.google.privacy.dlp.v2beta1.BigQueryTable.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sourceTable_);
              sourceTable_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_AnalyzeDataSourceRiskRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_AnalyzeDataSourceRiskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest.class, com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest.Builder.class);
  }

  public static final int PRIVACY_METRIC_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2beta1.PrivacyMetric privacyMetric_;
  /**
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
   */
  public boolean hasPrivacyMetric() {
    return privacyMetric_ != null;
  }
  /**
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.PrivacyMetric getPrivacyMetric() {
    return privacyMetric_ == null ? com.google.privacy.dlp.v2beta1.PrivacyMetric.getDefaultInstance() : privacyMetric_;
  }
  /**
   * <pre>
   * Privacy metric to compute.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.PrivacyMetricOrBuilder getPrivacyMetricOrBuilder() {
    return getPrivacyMetric();
  }

  public static final int SOURCE_TABLE_FIELD_NUMBER = 3;
  private com.google.privacy.dlp.v2beta1.BigQueryTable sourceTable_;
  /**
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
   */
  public boolean hasSourceTable() {
    return sourceTable_ != null;
  }
  /**
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
   */
  public com.google.privacy.dlp.v2beta1.BigQueryTable getSourceTable() {
    return sourceTable_ == null ? com.google.privacy.dlp.v2beta1.BigQueryTable.getDefaultInstance() : sourceTable_;
  }
  /**
   * <pre>
   * Input dataset to compute metrics over.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
   */
  public com.google.privacy.dlp.v2beta1.BigQueryTableOrBuilder getSourceTableOrBuilder() {
    return getSourceTable();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (privacyMetric_ != null) {
      output.writeMessage(1, getPrivacyMetric());
    }
    if (sourceTable_ != null) {
      output.writeMessage(3, getSourceTable());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (privacyMetric_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPrivacyMetric());
    }
    if (sourceTable_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSourceTable());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest other = (com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest) obj;

    boolean result = true;
    result = result && (hasPrivacyMetric() == other.hasPrivacyMetric());
    if (hasPrivacyMetric()) {
      result = result && getPrivacyMetric()
          .equals(other.getPrivacyMetric());
    }
    result = result && (hasSourceTable() == other.hasSourceTable());
    if (hasSourceTable()) {
      result = result && getSourceTable()
          .equals(other.getSourceTable());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPrivacyMetric()) {
      hash = (37 * hash) + PRIVACY_METRIC_FIELD_NUMBER;
      hash = (53 * hash) + getPrivacyMetric().hashCode();
    }
    if (hasSourceTable()) {
      hash = (37 * hash) + SOURCE_TABLE_FIELD_NUMBER;
      hash = (53 * hash) + getSourceTable().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request for creating a risk analysis operation.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest)
      com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_AnalyzeDataSourceRiskRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_AnalyzeDataSourceRiskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest.class, com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (privacyMetricBuilder_ == null) {
        privacyMetric_ = null;
      } else {
        privacyMetric_ = null;
        privacyMetricBuilder_ = null;
      }
      if (sourceTableBuilder_ == null) {
        sourceTable_ = null;
      } else {
        sourceTable_ = null;
        sourceTableBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_AnalyzeDataSourceRiskRequest_descriptor;
    }

    public com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest build() {
      com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest buildPartial() {
      com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest result = new com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest(this);
      if (privacyMetricBuilder_ == null) {
        result.privacyMetric_ = privacyMetric_;
      } else {
        result.privacyMetric_ = privacyMetricBuilder_.build();
      }
      if (sourceTableBuilder_ == null) {
        result.sourceTable_ = sourceTable_;
      } else {
        result.sourceTable_ = sourceTableBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest) {
        return mergeFrom((com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest other) {
      if (other == com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest.getDefaultInstance()) return this;
      if (other.hasPrivacyMetric()) {
        mergePrivacyMetric(other.getPrivacyMetric());
      }
      if (other.hasSourceTable()) {
        mergeSourceTable(other.getSourceTable());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2beta1.PrivacyMetric privacyMetric_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.PrivacyMetric, com.google.privacy.dlp.v2beta1.PrivacyMetric.Builder, com.google.privacy.dlp.v2beta1.PrivacyMetricOrBuilder> privacyMetricBuilder_;
    /**
     * <pre>
     * Privacy metric to compute.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
     */
    public boolean hasPrivacyMetric() {
      return privacyMetricBuilder_ != null || privacyMetric_ != null;
    }
    /**
     * <pre>
     * Privacy metric to compute.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.PrivacyMetric getPrivacyMetric() {
      if (privacyMetricBuilder_ == null) {
        return privacyMetric_ == null ? com.google.privacy.dlp.v2beta1.PrivacyMetric.getDefaultInstance() : privacyMetric_;
      } else {
        return privacyMetricBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Privacy metric to compute.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
     */
    public Builder setPrivacyMetric(com.google.privacy.dlp.v2beta1.PrivacyMetric value) {
      if (privacyMetricBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        privacyMetric_ = value;
        onChanged();
      } else {
        privacyMetricBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Privacy metric to compute.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
     */
    public Builder setPrivacyMetric(
        com.google.privacy.dlp.v2beta1.PrivacyMetric.Builder builderForValue) {
      if (privacyMetricBuilder_ == null) {
        privacyMetric_ = builderForValue.build();
        onChanged();
      } else {
        privacyMetricBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Privacy metric to compute.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
     */
    public Builder mergePrivacyMetric(com.google.privacy.dlp.v2beta1.PrivacyMetric value) {
      if (privacyMetricBuilder_ == null) {
        if (privacyMetric_ != null) {
          privacyMetric_ =
            com.google.privacy.dlp.v2beta1.PrivacyMetric.newBuilder(privacyMetric_).mergeFrom(value).buildPartial();
        } else {
          privacyMetric_ = value;
        }
        onChanged();
      } else {
        privacyMetricBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Privacy metric to compute.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
     */
    public Builder clearPrivacyMetric() {
      if (privacyMetricBuilder_ == null) {
        privacyMetric_ = null;
        onChanged();
      } else {
        privacyMetric_ = null;
        privacyMetricBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Privacy metric to compute.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.PrivacyMetric.Builder getPrivacyMetricBuilder() {
      
      onChanged();
      return getPrivacyMetricFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Privacy metric to compute.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.PrivacyMetricOrBuilder getPrivacyMetricOrBuilder() {
      if (privacyMetricBuilder_ != null) {
        return privacyMetricBuilder_.getMessageOrBuilder();
      } else {
        return privacyMetric_ == null ?
            com.google.privacy.dlp.v2beta1.PrivacyMetric.getDefaultInstance() : privacyMetric_;
      }
    }
    /**
     * <pre>
     * Privacy metric to compute.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.PrivacyMetric privacy_metric = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.PrivacyMetric, com.google.privacy.dlp.v2beta1.PrivacyMetric.Builder, com.google.privacy.dlp.v2beta1.PrivacyMetricOrBuilder> 
        getPrivacyMetricFieldBuilder() {
      if (privacyMetricBuilder_ == null) {
        privacyMetricBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.PrivacyMetric, com.google.privacy.dlp.v2beta1.PrivacyMetric.Builder, com.google.privacy.dlp.v2beta1.PrivacyMetricOrBuilder>(
                getPrivacyMetric(),
                getParentForChildren(),
                isClean());
        privacyMetric_ = null;
      }
      return privacyMetricBuilder_;
    }

    private com.google.privacy.dlp.v2beta1.BigQueryTable sourceTable_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.BigQueryTable, com.google.privacy.dlp.v2beta1.BigQueryTable.Builder, com.google.privacy.dlp.v2beta1.BigQueryTableOrBuilder> sourceTableBuilder_;
    /**
     * <pre>
     * Input dataset to compute metrics over.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
     */
    public boolean hasSourceTable() {
      return sourceTableBuilder_ != null || sourceTable_ != null;
    }
    /**
     * <pre>
     * Input dataset to compute metrics over.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
     */
    public com.google.privacy.dlp.v2beta1.BigQueryTable getSourceTable() {
      if (sourceTableBuilder_ == null) {
        return sourceTable_ == null ? com.google.privacy.dlp.v2beta1.BigQueryTable.getDefaultInstance() : sourceTable_;
      } else {
        return sourceTableBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Input dataset to compute metrics over.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
     */
    public Builder setSourceTable(com.google.privacy.dlp.v2beta1.BigQueryTable value) {
      if (sourceTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sourceTable_ = value;
        onChanged();
      } else {
        sourceTableBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Input dataset to compute metrics over.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
     */
    public Builder setSourceTable(
        com.google.privacy.dlp.v2beta1.BigQueryTable.Builder builderForValue) {
      if (sourceTableBuilder_ == null) {
        sourceTable_ = builderForValue.build();
        onChanged();
      } else {
        sourceTableBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Input dataset to compute metrics over.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
     */
    public Builder mergeSourceTable(com.google.privacy.dlp.v2beta1.BigQueryTable value) {
      if (sourceTableBuilder_ == null) {
        if (sourceTable_ != null) {
          sourceTable_ =
            com.google.privacy.dlp.v2beta1.BigQueryTable.newBuilder(sourceTable_).mergeFrom(value).buildPartial();
        } else {
          sourceTable_ = value;
        }
        onChanged();
      } else {
        sourceTableBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Input dataset to compute metrics over.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
     */
    public Builder clearSourceTable() {
      if (sourceTableBuilder_ == null) {
        sourceTable_ = null;
        onChanged();
      } else {
        sourceTable_ = null;
        sourceTableBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Input dataset to compute metrics over.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
     */
    public com.google.privacy.dlp.v2beta1.BigQueryTable.Builder getSourceTableBuilder() {
      
      onChanged();
      return getSourceTableFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Input dataset to compute metrics over.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
     */
    public com.google.privacy.dlp.v2beta1.BigQueryTableOrBuilder getSourceTableOrBuilder() {
      if (sourceTableBuilder_ != null) {
        return sourceTableBuilder_.getMessageOrBuilder();
      } else {
        return sourceTable_ == null ?
            com.google.privacy.dlp.v2beta1.BigQueryTable.getDefaultInstance() : sourceTable_;
      }
    }
    /**
     * <pre>
     * Input dataset to compute metrics over.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.BigQueryTable source_table = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.BigQueryTable, com.google.privacy.dlp.v2beta1.BigQueryTable.Builder, com.google.privacy.dlp.v2beta1.BigQueryTableOrBuilder> 
        getSourceTableFieldBuilder() {
      if (sourceTableBuilder_ == null) {
        sourceTableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.BigQueryTable, com.google.privacy.dlp.v2beta1.BigQueryTable.Builder, com.google.privacy.dlp.v2beta1.BigQueryTableOrBuilder>(
                getSourceTable(),
                getParentForChildren(),
                isClean());
        sourceTable_ = null;
      }
      return sourceTableBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest)
  private static final com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest();
  }

  public static com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalyzeDataSourceRiskRequest>
      PARSER = new com.google.protobuf.AbstractParser<AnalyzeDataSourceRiskRequest>() {
    public AnalyzeDataSourceRiskRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnalyzeDataSourceRiskRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnalyzeDataSourceRiskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalyzeDataSourceRiskRequest> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta1.AnalyzeDataSourceRiskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

