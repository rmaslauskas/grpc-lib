// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/proto/server.proto

package io.grpc.process;

/**
 * Protobuf enum {@code process.ProcessorType}
 */
public enum ProcessorType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Nutanix = 0;</code>
   */
  Nutanix(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Nutanix = 0;</code>
   */
  public static final int Nutanix_VALUE = 0;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ProcessorType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProcessorType forNumber(int value) {
    switch (value) {
      case 0: return Nutanix;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProcessorType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProcessorType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProcessorType>() {
          public ProcessorType findValueByNumber(int number) {
            return ProcessorType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.grpc.process.ProcessServiceProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final ProcessorType[] VALUES = values();

  public static ProcessorType valueOf(
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

  private ProcessorType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:process.ProcessorType)
}

