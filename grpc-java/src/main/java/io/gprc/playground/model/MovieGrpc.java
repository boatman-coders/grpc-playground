package io.gprc.playground.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.1)",
    comments = "Source: movie.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovieGrpc {

  private MovieGrpc() {}

  public static final String SERVICE_NAME = "movie.Movie";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.gprc.playground.model.MovieModel.MovieItem,
      io.gprc.playground.model.MovieModel.AddMovieResponse> getSaveNewMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveNewMovie",
      requestType = io.gprc.playground.model.MovieModel.MovieItem.class,
      responseType = io.gprc.playground.model.MovieModel.AddMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.gprc.playground.model.MovieModel.MovieItem,
      io.gprc.playground.model.MovieModel.AddMovieResponse> getSaveNewMovieMethod() {
    io.grpc.MethodDescriptor<io.gprc.playground.model.MovieModel.MovieItem, io.gprc.playground.model.MovieModel.AddMovieResponse> getSaveNewMovieMethod;
    if ((getSaveNewMovieMethod = MovieGrpc.getSaveNewMovieMethod) == null) {
      synchronized (MovieGrpc.class) {
        if ((getSaveNewMovieMethod = MovieGrpc.getSaveNewMovieMethod) == null) {
          MovieGrpc.getSaveNewMovieMethod = getSaveNewMovieMethod =
              io.grpc.MethodDescriptor.<io.gprc.playground.model.MovieModel.MovieItem, io.gprc.playground.model.MovieModel.AddMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveNewMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.gprc.playground.model.MovieModel.MovieItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.gprc.playground.model.MovieModel.AddMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieMethodDescriptorSupplier("SaveNewMovie"))
              .build();
        }
      }
    }
    return getSaveNewMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.gprc.playground.model.MovieModel.FetchMovieRequest,
      io.gprc.playground.model.MovieModel.MovieItem> getFetchExistingMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchExistingMovie",
      requestType = io.gprc.playground.model.MovieModel.FetchMovieRequest.class,
      responseType = io.gprc.playground.model.MovieModel.MovieItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.gprc.playground.model.MovieModel.FetchMovieRequest,
      io.gprc.playground.model.MovieModel.MovieItem> getFetchExistingMovieMethod() {
    io.grpc.MethodDescriptor<io.gprc.playground.model.MovieModel.FetchMovieRequest, io.gprc.playground.model.MovieModel.MovieItem> getFetchExistingMovieMethod;
    if ((getFetchExistingMovieMethod = MovieGrpc.getFetchExistingMovieMethod) == null) {
      synchronized (MovieGrpc.class) {
        if ((getFetchExistingMovieMethod = MovieGrpc.getFetchExistingMovieMethod) == null) {
          MovieGrpc.getFetchExistingMovieMethod = getFetchExistingMovieMethod =
              io.grpc.MethodDescriptor.<io.gprc.playground.model.MovieModel.FetchMovieRequest, io.gprc.playground.model.MovieModel.MovieItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchExistingMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.gprc.playground.model.MovieModel.FetchMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.gprc.playground.model.MovieModel.MovieItem.getDefaultInstance()))
              .setSchemaDescriptor(new MovieMethodDescriptorSupplier("FetchExistingMovie"))
              .build();
        }
      }
    }
    return getFetchExistingMovieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieStub>() {
        @java.lang.Override
        public MovieStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieStub(channel, callOptions);
        }
      };
    return MovieStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieBlockingStub>() {
        @java.lang.Override
        public MovieBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieBlockingStub(channel, callOptions);
        }
      };
    return MovieBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieFutureStub>() {
        @java.lang.Override
        public MovieFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieFutureStub(channel, callOptions);
        }
      };
    return MovieFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MovieImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveNewMovie(io.gprc.playground.model.MovieModel.MovieItem request,
        io.grpc.stub.StreamObserver<io.gprc.playground.model.MovieModel.AddMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveNewMovieMethod(), responseObserver);
    }

    /**
     */
    public void fetchExistingMovie(io.gprc.playground.model.MovieModel.FetchMovieRequest request,
        io.grpc.stub.StreamObserver<io.gprc.playground.model.MovieModel.MovieItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchExistingMovieMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveNewMovieMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.gprc.playground.model.MovieModel.MovieItem,
                io.gprc.playground.model.MovieModel.AddMovieResponse>(
                  this, METHODID_SAVE_NEW_MOVIE)))
          .addMethod(
            getFetchExistingMovieMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.gprc.playground.model.MovieModel.FetchMovieRequest,
                io.gprc.playground.model.MovieModel.MovieItem>(
                  this, METHODID_FETCH_EXISTING_MOVIE)))
          .build();
    }
  }

  /**
   */
  public static final class MovieStub extends io.grpc.stub.AbstractAsyncStub<MovieStub> {
    private MovieStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieStub(channel, callOptions);
    }

    /**
     */
    public void saveNewMovie(io.gprc.playground.model.MovieModel.MovieItem request,
        io.grpc.stub.StreamObserver<io.gprc.playground.model.MovieModel.AddMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveNewMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchExistingMovie(io.gprc.playground.model.MovieModel.FetchMovieRequest request,
        io.grpc.stub.StreamObserver<io.gprc.playground.model.MovieModel.MovieItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchExistingMovieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MovieBlockingStub extends io.grpc.stub.AbstractBlockingStub<MovieBlockingStub> {
    private MovieBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.gprc.playground.model.MovieModel.AddMovieResponse saveNewMovie(io.gprc.playground.model.MovieModel.MovieItem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveNewMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.gprc.playground.model.MovieModel.MovieItem fetchExistingMovie(io.gprc.playground.model.MovieModel.FetchMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchExistingMovieMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MovieFutureStub extends io.grpc.stub.AbstractFutureStub<MovieFutureStub> {
    private MovieFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.gprc.playground.model.MovieModel.AddMovieResponse> saveNewMovie(
        io.gprc.playground.model.MovieModel.MovieItem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveNewMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.gprc.playground.model.MovieModel.MovieItem> fetchExistingMovie(
        io.gprc.playground.model.MovieModel.FetchMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchExistingMovieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_NEW_MOVIE = 0;
  private static final int METHODID_FETCH_EXISTING_MOVIE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MovieImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MovieImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_NEW_MOVIE:
          serviceImpl.saveNewMovie((io.gprc.playground.model.MovieModel.MovieItem) request,
              (io.grpc.stub.StreamObserver<io.gprc.playground.model.MovieModel.AddMovieResponse>) responseObserver);
          break;
        case METHODID_FETCH_EXISTING_MOVIE:
          serviceImpl.fetchExistingMovie((io.gprc.playground.model.MovieModel.FetchMovieRequest) request,
              (io.grpc.stub.StreamObserver<io.gprc.playground.model.MovieModel.MovieItem>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MovieBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.gprc.playground.model.MovieModel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Movie");
    }
  }

  private static final class MovieFileDescriptorSupplier
      extends MovieBaseDescriptorSupplier {
    MovieFileDescriptorSupplier() {}
  }

  private static final class MovieMethodDescriptorSupplier
      extends MovieBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MovieMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MovieGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieFileDescriptorSupplier())
              .addMethod(getSaveNewMovieMethod())
              .addMethod(getFetchExistingMovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}
