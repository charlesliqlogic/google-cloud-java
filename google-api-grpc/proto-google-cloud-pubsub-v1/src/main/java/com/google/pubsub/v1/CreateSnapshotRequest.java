// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * <pre>
 * Request for the `CreateSnapshot` method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.CreateSnapshotRequest}
 */
public  final class CreateSnapshotRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.CreateSnapshotRequest)
    CreateSnapshotRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSnapshotRequest.newBuilder() to construct.
  private CreateSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSnapshotRequest() {
    name_ = "";
    subscription_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSnapshotRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            subscription_ = s;
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
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_CreateSnapshotRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_CreateSnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.CreateSnapshotRequest.class, com.google.pubsub.v1.CreateSnapshotRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Optional user-provided name for this snapshot.
   * If the name is not provided in the request, the server will assign a random
   * name for this snapshot on the same project as the subscription.
   * Note that for REST API requests, you must specify a name.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional user-provided name for this snapshot.
   * If the name is not provided in the request, the server will assign a random
   * name for this snapshot on the same project as the subscription.
   * Note that for REST API requests, you must specify a name.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object subscription_;
  /**
   * <pre>
   * The subscription whose backlog the snapshot retains.
   * Specifically, the created snapshot is guaranteed to retain:
   *  (a) The existing backlog on the subscription. More precisely, this is
   *      defined as the messages in the subscription's backlog that are
   *      unacknowledged upon the successful completion of the
   *      `CreateSnapshot` request; as well as:
   *  (b) Any messages published to the subscription's topic following the
   *      successful completion of the CreateSnapshot request.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 2;</code>
   */
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The subscription whose backlog the snapshot retains.
   * Specifically, the created snapshot is guaranteed to retain:
   *  (a) The existing backlog on the subscription. More precisely, this is
   *      defined as the messages in the subscription's backlog that are
   *      unacknowledged upon the successful completion of the
   *      `CreateSnapshot` request; as well as:
   *  (b) Any messages published to the subscription's topic following the
   *      successful completion of the CreateSnapshot request.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getSubscriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subscription_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getSubscriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subscription_);
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
    if (!(obj instanceof com.google.pubsub.v1.CreateSnapshotRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.CreateSnapshotRequest other = (com.google.pubsub.v1.CreateSnapshotRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getSubscription()
        .equals(other.getSubscription());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.CreateSnapshotRequest parseFrom(
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
  public static Builder newBuilder(com.google.pubsub.v1.CreateSnapshotRequest prototype) {
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
   * Request for the `CreateSnapshot` method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.CreateSnapshotRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.CreateSnapshotRequest)
      com.google.pubsub.v1.CreateSnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_CreateSnapshotRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_CreateSnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.CreateSnapshotRequest.class, com.google.pubsub.v1.CreateSnapshotRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.CreateSnapshotRequest.newBuilder()
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
      name_ = "";

      subscription_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_CreateSnapshotRequest_descriptor;
    }

    public com.google.pubsub.v1.CreateSnapshotRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.CreateSnapshotRequest.getDefaultInstance();
    }

    public com.google.pubsub.v1.CreateSnapshotRequest build() {
      com.google.pubsub.v1.CreateSnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.pubsub.v1.CreateSnapshotRequest buildPartial() {
      com.google.pubsub.v1.CreateSnapshotRequest result = new com.google.pubsub.v1.CreateSnapshotRequest(this);
      result.name_ = name_;
      result.subscription_ = subscription_;
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
      if (other instanceof com.google.pubsub.v1.CreateSnapshotRequest) {
        return mergeFrom((com.google.pubsub.v1.CreateSnapshotRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.CreateSnapshotRequest other) {
      if (other == com.google.pubsub.v1.CreateSnapshotRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        onChanged();
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
      com.google.pubsub.v1.CreateSnapshotRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.CreateSnapshotRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Optional user-provided name for this snapshot.
     * If the name is not provided in the request, the server will assign a random
     * name for this snapshot on the same project as the subscription.
     * Note that for REST API requests, you must specify a name.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional user-provided name for this snapshot.
     * If the name is not provided in the request, the server will assign a random
     * name for this snapshot on the same project as the subscription.
     * Note that for REST API requests, you must specify a name.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional user-provided name for this snapshot.
     * If the name is not provided in the request, the server will assign a random
     * name for this snapshot on the same project as the subscription.
     * Note that for REST API requests, you must specify a name.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional user-provided name for this snapshot.
     * If the name is not provided in the request, the server will assign a random
     * name for this snapshot on the same project as the subscription.
     * Note that for REST API requests, you must specify a name.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional user-provided name for this snapshot.
     * If the name is not provided in the request, the server will assign a random
     * name for this snapshot on the same project as the subscription.
     * Note that for REST API requests, you must specify a name.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subscription_ = "";
    /**
     * <pre>
     * The subscription whose backlog the snapshot retains.
     * Specifically, the created snapshot is guaranteed to retain:
     *  (a) The existing backlog on the subscription. More precisely, this is
     *      defined as the messages in the subscription's backlog that are
     *      unacknowledged upon the successful completion of the
     *      `CreateSnapshot` request; as well as:
     *  (b) Any messages published to the subscription's topic following the
     *      successful completion of the CreateSnapshot request.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The subscription whose backlog the snapshot retains.
     * Specifically, the created snapshot is guaranteed to retain:
     *  (a) The existing backlog on the subscription. More precisely, this is
     *      defined as the messages in the subscription's backlog that are
     *      unacknowledged upon the successful completion of the
     *      `CreateSnapshot` request; as well as:
     *  (b) Any messages published to the subscription's topic following the
     *      successful completion of the CreateSnapshot request.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The subscription whose backlog the snapshot retains.
     * Specifically, the created snapshot is guaranteed to retain:
     *  (a) The existing backlog on the subscription. More precisely, this is
     *      defined as the messages in the subscription's backlog that are
     *      unacknowledged upon the successful completion of the
     *      `CreateSnapshot` request; as well as:
     *  (b) Any messages published to the subscription's topic following the
     *      successful completion of the CreateSnapshot request.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     */
    public Builder setSubscription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subscription_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subscription whose backlog the snapshot retains.
     * Specifically, the created snapshot is guaranteed to retain:
     *  (a) The existing backlog on the subscription. More precisely, this is
     *      defined as the messages in the subscription's backlog that are
     *      unacknowledged upon the successful completion of the
     *      `CreateSnapshot` request; as well as:
     *  (b) Any messages published to the subscription's topic following the
     *      successful completion of the CreateSnapshot request.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     */
    public Builder clearSubscription() {
      
      subscription_ = getDefaultInstance().getSubscription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subscription whose backlog the snapshot retains.
     * Specifically, the created snapshot is guaranteed to retain:
     *  (a) The existing backlog on the subscription. More precisely, this is
     *      defined as the messages in the subscription's backlog that are
     *      unacknowledged upon the successful completion of the
     *      `CreateSnapshot` request; as well as:
     *  (b) Any messages published to the subscription's topic following the
     *      successful completion of the CreateSnapshot request.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     */
    public Builder setSubscriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subscription_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.CreateSnapshotRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.CreateSnapshotRequest)
  private static final com.google.pubsub.v1.CreateSnapshotRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.CreateSnapshotRequest();
  }

  public static com.google.pubsub.v1.CreateSnapshotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSnapshotRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSnapshotRequest>() {
    public CreateSnapshotRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSnapshotRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSnapshotRequest> getParserForType() {
    return PARSER;
  }

  public com.google.pubsub.v1.CreateSnapshotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

