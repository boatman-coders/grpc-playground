// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.7
// source: src/proto/movie.proto

package model

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// MovieClient is the client API for Movie service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type MovieClient interface {
	SaveNewMovie(ctx context.Context, in *MovieItem, opts ...grpc.CallOption) (*AddMovieResponse, error)
	FetchExistingMovie(ctx context.Context, in *FetchMovieRequest, opts ...grpc.CallOption) (*MovieItem, error)
}

type movieClient struct {
	cc grpc.ClientConnInterface
}

func NewMovieClient(cc grpc.ClientConnInterface) MovieClient {
	return &movieClient{cc}
}

func (c *movieClient) SaveNewMovie(ctx context.Context, in *MovieItem, opts ...grpc.CallOption) (*AddMovieResponse, error) {
	out := new(AddMovieResponse)
	err := c.cc.Invoke(ctx, "/movie.Movie/SaveNewMovie", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *movieClient) FetchExistingMovie(ctx context.Context, in *FetchMovieRequest, opts ...grpc.CallOption) (*MovieItem, error) {
	out := new(MovieItem)
	err := c.cc.Invoke(ctx, "/movie.Movie/FetchExistingMovie", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// MovieServer is the server API for Movie service.
// All implementations must embed UnimplementedMovieServer
// for forward compatibility
type MovieServer interface {
	SaveNewMovie(context.Context, *MovieItem) (*AddMovieResponse, error)
	FetchExistingMovie(context.Context, *FetchMovieRequest) (*MovieItem, error)
	mustEmbedUnimplementedMovieServer()
}

// UnimplementedMovieServer must be embedded to have forward compatible implementations.
type UnimplementedMovieServer struct {
}

func (UnimplementedMovieServer) SaveNewMovie(context.Context, *MovieItem) (*AddMovieResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SaveNewMovie not implemented")
}
func (UnimplementedMovieServer) FetchExistingMovie(context.Context, *FetchMovieRequest) (*MovieItem, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FetchExistingMovie not implemented")
}
func (UnimplementedMovieServer) mustEmbedUnimplementedMovieServer() {}

// UnsafeMovieServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to MovieServer will
// result in compilation errors.
type UnsafeMovieServer interface {
	mustEmbedUnimplementedMovieServer()
}

func RegisterMovieServer(s grpc.ServiceRegistrar, srv MovieServer) {
	s.RegisterService(&Movie_ServiceDesc, srv)
}

func _Movie_SaveNewMovie_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(MovieItem)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MovieServer).SaveNewMovie(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/movie.Movie/SaveNewMovie",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MovieServer).SaveNewMovie(ctx, req.(*MovieItem))
	}
	return interceptor(ctx, in, info, handler)
}

func _Movie_FetchExistingMovie_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FetchMovieRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MovieServer).FetchExistingMovie(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/movie.Movie/FetchExistingMovie",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MovieServer).FetchExistingMovie(ctx, req.(*FetchMovieRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// Movie_ServiceDesc is the grpc.ServiceDesc for Movie service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Movie_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "movie.Movie",
	HandlerType: (*MovieServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "SaveNewMovie",
			Handler:    _Movie_SaveNewMovie_Handler,
		},
		{
			MethodName: "FetchExistingMovie",
			Handler:    _Movie_FetchExistingMovie_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "src/proto/movie.proto",
}
