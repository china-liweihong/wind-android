// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_friend_applyCount.proto

package com.windchat.proto.server;

public final class ApiFriendApplyCountProto {
  private ApiFriendApplyCountProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiFriendApplyCountRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFriendApplyCountRequest)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiFriendApplyCountRequest}
   */
  public  static final class ApiFriendApplyCountRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiFriendApplyCountRequest, ApiFriendApplyCountRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiFriendApplyCountRequest)
      ApiFriendApplyCountRequestOrBuilder {
    private ApiFriendApplyCountRequest() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiFriendApplyCountRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendApplyCountRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendApplyCountRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendApplyCountRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendApplyCountRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendApplyCountRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendApplyCountRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiFriendApplyCountRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendApplyCountRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendApplyCountRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiFriendApplyCountRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiFriendApplyCountRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiFriendApplyCountRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFriendApplyCountRequest)
        ApiFriendApplyCountRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiFriendApplyCountProto.ApiFriendApplyCountRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:site.ApiFriendApplyCountRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiFriendApplyCountRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          ApiFriendApplyCountRequest other = (ApiFriendApplyCountRequest) arg1;
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (ApiFriendApplyCountRequest.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiFriendApplyCountRequest)
    private static final ApiFriendApplyCountRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiFriendApplyCountRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiFriendApplyCountRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiFriendApplyCountRequest> PARSER;

    public static com.google.protobuf.Parser<ApiFriendApplyCountRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiFriendApplyCountResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFriendApplyCountResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *用户好友申请的总数
     * </pre>
     *
     * <code>optional int32 apply_count = 1;</code>
     */
    int getApplyCount();
  }
  /**
   * Protobuf type {@code site.ApiFriendApplyCountResponse}
   */
  public  static final class ApiFriendApplyCountResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiFriendApplyCountResponse, ApiFriendApplyCountResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiFriendApplyCountResponse)
      ApiFriendApplyCountResponseOrBuilder {
    private ApiFriendApplyCountResponse() {
    }
    public static final int APPLY_COUNT_FIELD_NUMBER = 1;
    private int applyCount_;
    /**
     * <pre>
     *用户好友申请的总数
     * </pre>
     *
     * <code>optional int32 apply_count = 1;</code>
     */
    public int getApplyCount() {
      return applyCount_;
    }
    /**
     * <pre>
     *用户好友申请的总数
     * </pre>
     *
     * <code>optional int32 apply_count = 1;</code>
     */
    private void setApplyCount(int value) {

      applyCount_ = value;
    }
    /**
     * <pre>
     *用户好友申请的总数
     * </pre>
     *
     * <code>optional int32 apply_count = 1;</code>
     */
    private void clearApplyCount() {

      applyCount_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (applyCount_ != 0) {
        output.writeInt32(1, applyCount_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (applyCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, applyCount_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiFriendApplyCountResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendApplyCountResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendApplyCountResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiFriendApplyCountResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiFriendApplyCountResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendApplyCountResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendApplyCountResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiFriendApplyCountResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiFriendApplyCountResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiFriendApplyCountResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiFriendApplyCountResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiFriendApplyCountResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiFriendApplyCountResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFriendApplyCountResponse)
        ApiFriendApplyCountResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiFriendApplyCountProto.ApiFriendApplyCountResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *用户好友申请的总数
       * </pre>
       *
       * <code>optional int32 apply_count = 1;</code>
       */
      public int getApplyCount() {
        return instance.getApplyCount();
      }
      /**
       * <pre>
       *用户好友申请的总数
       * </pre>
       *
       * <code>optional int32 apply_count = 1;</code>
       */
      public Builder setApplyCount(int value) {
        copyOnWrite();
        instance.setApplyCount(value);
        return this;
      }
      /**
       * <pre>
       *用户好友申请的总数
       * </pre>
       *
       * <code>optional int32 apply_count = 1;</code>
       */
      public Builder clearApplyCount() {
        copyOnWrite();
        instance.clearApplyCount();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiFriendApplyCountResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiFriendApplyCountResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          ApiFriendApplyCountResponse other = (ApiFriendApplyCountResponse) arg1;
          applyCount_ = visitor.visitInt(applyCount_ != 0, applyCount_,
              other.applyCount_ != 0, other.applyCount_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 8: {

                  applyCount_ = input.readInt32();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (ApiFriendApplyCountResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiFriendApplyCountResponse)
    private static final ApiFriendApplyCountResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiFriendApplyCountResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiFriendApplyCountResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiFriendApplyCountResponse> PARSER;

    public static com.google.protobuf.Parser<ApiFriendApplyCountResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
