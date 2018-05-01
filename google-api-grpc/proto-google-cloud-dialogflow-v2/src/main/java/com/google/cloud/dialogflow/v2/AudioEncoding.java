// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * Audio encoding of the audio content sent in the conversational query request.
 * Refer to the [Cloud Speech API documentation](/speech/docs/basics) for more
 * details.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dialogflow.v2.AudioEncoding}
 */
public enum AudioEncoding
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>AUDIO_ENCODING_UNSPECIFIED = 0;</code>
   */
  AUDIO_ENCODING_UNSPECIFIED(0),
  /**
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * </pre>
   *
   * <code>AUDIO_ENCODING_LINEAR_16 = 1;</code>
   */
  AUDIO_ENCODING_LINEAR_16(1),
  /**
   * <pre>
   * [`FLAC`](https://xiph.org/flac/documentation.html) (Free Lossless Audio
   * Codec) is the recommended encoding because it is lossless (therefore
   * recognition is not compromised) and requires only about half the
   * bandwidth of `LINEAR16`. `FLAC` stream encoding supports 16-bit and
   * 24-bit samples, however, not all fields in `STREAMINFO` are supported.
   * </pre>
   *
   * <code>AUDIO_ENCODING_FLAC = 2;</code>
   */
  AUDIO_ENCODING_FLAC(2),
  /**
   * <pre>
   * 8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
   * </pre>
   *
   * <code>AUDIO_ENCODING_MULAW = 3;</code>
   */
  AUDIO_ENCODING_MULAW(3),
  /**
   * <pre>
   * Adaptive Multi-Rate Narrowband codec. `sample_rate_hertz` must be 8000.
   * </pre>
   *
   * <code>AUDIO_ENCODING_AMR = 4;</code>
   */
  AUDIO_ENCODING_AMR(4),
  /**
   * <pre>
   * Adaptive Multi-Rate Wideband codec. `sample_rate_hertz` must be 16000.
   * </pre>
   *
   * <code>AUDIO_ENCODING_AMR_WB = 5;</code>
   */
  AUDIO_ENCODING_AMR_WB(5),
  /**
   * <pre>
   * Opus encoded audio frames in Ogg container
   * ([OggOpus](https://wiki.xiph.org/OggOpus)).
   * `sample_rate_hertz` must be 16000.
   * </pre>
   *
   * <code>AUDIO_ENCODING_OGG_OPUS = 6;</code>
   */
  AUDIO_ENCODING_OGG_OPUS(6),
  /**
   * <pre>
   * Although the use of lossy encodings is not recommended, if a very low
   * bitrate encoding is required, `OGG_OPUS` is highly preferred over
   * Speex encoding. The [Speex](https://speex.org/) encoding supported by
   * Dialogflow API has a header byte in each block, as in MIME type
   * `audio/x-speex-with-header-byte`.
   * It is a variant of the RTP Speex encoding defined in
   * [RFC 5574](https://tools.ietf.org/html/rfc5574).
   * The stream is a sequence of blocks, one block per RTP packet. Each block
   * starts with a byte containing the length of the block, in bytes, followed
   * by one or more frames of Speex data, padded to an integral number of
   * bytes (octets) as specified in RFC 5574. In other words, each RTP header
   * is replaced with a single byte containing the block length. Only Speex
   * wideband is supported. `sample_rate_hertz` must be 16000.
   * </pre>
   *
   * <code>AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE = 7;</code>
   */
  AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>AUDIO_ENCODING_UNSPECIFIED = 0;</code>
   */
  public static final int AUDIO_ENCODING_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * </pre>
   *
   * <code>AUDIO_ENCODING_LINEAR_16 = 1;</code>
   */
  public static final int AUDIO_ENCODING_LINEAR_16_VALUE = 1;
  /**
   * <pre>
   * [`FLAC`](https://xiph.org/flac/documentation.html) (Free Lossless Audio
   * Codec) is the recommended encoding because it is lossless (therefore
   * recognition is not compromised) and requires only about half the
   * bandwidth of `LINEAR16`. `FLAC` stream encoding supports 16-bit and
   * 24-bit samples, however, not all fields in `STREAMINFO` are supported.
   * </pre>
   *
   * <code>AUDIO_ENCODING_FLAC = 2;</code>
   */
  public static final int AUDIO_ENCODING_FLAC_VALUE = 2;
  /**
   * <pre>
   * 8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
   * </pre>
   *
   * <code>AUDIO_ENCODING_MULAW = 3;</code>
   */
  public static final int AUDIO_ENCODING_MULAW_VALUE = 3;
  /**
   * <pre>
   * Adaptive Multi-Rate Narrowband codec. `sample_rate_hertz` must be 8000.
   * </pre>
   *
   * <code>AUDIO_ENCODING_AMR = 4;</code>
   */
  public static final int AUDIO_ENCODING_AMR_VALUE = 4;
  /**
   * <pre>
   * Adaptive Multi-Rate Wideband codec. `sample_rate_hertz` must be 16000.
   * </pre>
   *
   * <code>AUDIO_ENCODING_AMR_WB = 5;</code>
   */
  public static final int AUDIO_ENCODING_AMR_WB_VALUE = 5;
  /**
   * <pre>
   * Opus encoded audio frames in Ogg container
   * ([OggOpus](https://wiki.xiph.org/OggOpus)).
   * `sample_rate_hertz` must be 16000.
   * </pre>
   *
   * <code>AUDIO_ENCODING_OGG_OPUS = 6;</code>
   */
  public static final int AUDIO_ENCODING_OGG_OPUS_VALUE = 6;
  /**
   * <pre>
   * Although the use of lossy encodings is not recommended, if a very low
   * bitrate encoding is required, `OGG_OPUS` is highly preferred over
   * Speex encoding. The [Speex](https://speex.org/) encoding supported by
   * Dialogflow API has a header byte in each block, as in MIME type
   * `audio/x-speex-with-header-byte`.
   * It is a variant of the RTP Speex encoding defined in
   * [RFC 5574](https://tools.ietf.org/html/rfc5574).
   * The stream is a sequence of blocks, one block per RTP packet. Each block
   * starts with a byte containing the length of the block, in bytes, followed
   * by one or more frames of Speex data, padded to an integral number of
   * bytes (octets) as specified in RFC 5574. In other words, each RTP header
   * is replaced with a single byte containing the block length. Only Speex
   * wideband is supported. `sample_rate_hertz` must be 16000.
   * </pre>
   *
   * <code>AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE = 7;</code>
   */
  public static final int AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AudioEncoding valueOf(int value) {
    return forNumber(value);
  }

  public static AudioEncoding forNumber(int value) {
    switch (value) {
      case 0: return AUDIO_ENCODING_UNSPECIFIED;
      case 1: return AUDIO_ENCODING_LINEAR_16;
      case 2: return AUDIO_ENCODING_FLAC;
      case 3: return AUDIO_ENCODING_MULAW;
      case 4: return AUDIO_ENCODING_AMR;
      case 5: return AUDIO_ENCODING_AMR_WB;
      case 6: return AUDIO_ENCODING_OGG_OPUS;
      case 7: return AUDIO_ENCODING_SPEEX_WITH_HEADER_BYTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AudioEncoding>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AudioEncoding> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AudioEncoding>() {
          public AudioEncoding findValueByNumber(int number) {
            return AudioEncoding.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.SessionProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AudioEncoding[] VALUES = values();

  public static AudioEncoding valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AudioEncoding(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2.AudioEncoding)
}

