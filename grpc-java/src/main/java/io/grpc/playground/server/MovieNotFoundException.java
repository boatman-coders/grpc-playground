package io.grpc.playground.server;

public class MovieNotFoundException extends RuntimeException {

	public MovieNotFoundException(String name) {
		super(name);
	}
}
