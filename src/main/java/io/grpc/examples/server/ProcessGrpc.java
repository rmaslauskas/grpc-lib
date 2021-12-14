// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package io.grpc.examples.server;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 *
 * Protobuf service {@code process.Process}
 */
public  abstract class ProcessGrpc
    implements com.google.protobuf.Service {
  protected ProcessGrpc() {}

  public interface Interface {
    /**
     * <pre>
     * Sends a message reply
     * </pre>
     *
     * <code>rpc SendReply(stream .process.MessageRequest) returns (stream .process.MessageReply);</code>
     */
    public abstract void sendReply(
        com.google.protobuf.RpcController controller,
        io.grpc.examples.server.MessageRequest request,
        com.google.protobuf.RpcCallback<io.grpc.examples.server.MessageReply> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new Process() {
      @java.lang.Override
      public  void sendReply(
          com.google.protobuf.RpcController controller,
          io.grpc.examples.server.MessageRequest request,
          com.google.protobuf.RpcCallback<io.grpc.examples.server.MessageReply> done) {
        impl.sendReply(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.sendReply(controller, (io.grpc.examples.server.MessageRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return io.grpc.examples.server.MessageRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return io.grpc.examples.server.MessageReply.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <pre>
   * Sends a message reply
   * </pre>
   *
   * <code>rpc SendReply(stream .process.MessageRequest) returns (stream .process.MessageReply);</code>
   */
  public abstract void sendReply(
      com.google.protobuf.RpcController controller,
      io.grpc.examples.server.MessageRequest request,
      com.google.protobuf.RpcCallback<io.grpc.examples.server.MessageReply> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return io.grpc.examples.server.ServerProto.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.sendReply(controller, (io.grpc.examples.server.MessageRequest)request,
          com.google.protobuf.RpcUtil.<io.grpc.examples.server.MessageReply>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return io.grpc.examples.server.MessageRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return io.grpc.examples.server.MessageReply.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends io.grpc.examples.server.Process implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void sendReply(
        com.google.protobuf.RpcController controller,
        io.grpc.examples.server.MessageRequest request,
        com.google.protobuf.RpcCallback<io.grpc.examples.server.MessageReply> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.grpc.examples.server.MessageReply.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.grpc.examples.server.MessageReply.class,
          io.grpc.examples.server.MessageReply.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public io.grpc.examples.server.MessageReply sendReply(
        com.google.protobuf.RpcController controller,
        io.grpc.examples.server.MessageRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public io.grpc.examples.server.MessageReply sendReply(
        com.google.protobuf.RpcController controller,
        io.grpc.examples.server.MessageRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.grpc.examples.server.MessageReply) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.grpc.examples.server.MessageReply.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:process.Process)
}
