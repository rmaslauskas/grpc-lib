// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/proto/server.proto

package io.grpc.process;

public final class ProcessServiceProtos {
  private ProcessServiceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_process_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_process_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_process_MessageReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_process_MessageReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027main/proto/server.proto\022\007process\"P\n\016Me" +
      "ssageRequest\022-\n\rprocessorType\030\001 \001(\0162\026.pr" +
      "ocess.ProcessorType\022\017\n\007message\030\002 \001(\t\"3\n\014" +
      "MessageReply\022\022\n\nkafkaTopic\030\001 \001(\t\022\017\n\007mess" +
      "age\030\002 \001(\t*\034\n\rProcessorType\022\013\n\007Nutanix\020\0002" +
      "X\n\016ProcessService\022F\n\016ProcessMessage\022\027.pr" +
      "ocess.MessageRequest\032\025.process.MessageRe" +
      "ply\"\000(\0010\001B-\n\017io.grpc.processB\024ProcessSer" +
      "viceProtosP\001Z\002./b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_process_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_process_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_process_MessageRequest_descriptor,
        new java.lang.String[] { "ProcessorType", "Message", });
    internal_static_process_MessageReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_process_MessageReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_process_MessageReply_descriptor,
        new java.lang.String[] { "KafkaTopic", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
