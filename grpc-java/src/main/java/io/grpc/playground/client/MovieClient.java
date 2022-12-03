package io.grpc.playground.client;

import io.gprc.playground.model.MovieGrpc;
import io.gprc.playground.model.MovieModel.AddMovieResponse;
import io.gprc.playground.model.MovieModel.FetchMovieRequest;
import io.gprc.playground.model.MovieModel.MovieItem;
import io.grpc.ManagedChannelBuilder;

public class MovieClient {

	public static void main(String[] args) {
		// Create our client channel. Since we are running on localhost, and to keep things simple, we will not be implementing security for this demo.
		var channel = ManagedChannelBuilder
				.forAddress("localhost", 9090)
				.usePlaintext() //No encryption
				.build();
		// Create a blocking (synchronous) client to work with. This allows us to treat method calls like local calls. Alternatively, you could use a FutureStub if you wanted to use multithreading and asynchronous calls to the service.
		var client = MovieGrpc.newBlockingStub(channel);
		// Create a movie object based on what we defined in our `proto` file to save it to the server
		var theMatrix = MovieItem.newBuilder().setName("The Matrix").setPrice(12.99).setInStock(true).build();
		// Make the save call to the server with our movie
		AddMovieResponse saveResponse = client.saveNewMovie(theMatrix);
		System.out.println("Movie was saved: " + saveResponse.getWasSaved() + " / item id: " + saveResponse.getItemId());
		// Try to fetch the movie we just saved to the server by constructing a request object
		var fetchRequest = FetchMovieRequest.newBuilder().setName("The Matrix").build();
		var fetchResponse = client.fetchExistingMovie(fetchRequest);
		System.out.printf(
				"Fetch movie %s at price $%f. In stock?: %s%n",
				fetchResponse.getName(),
				fetchResponse.getPrice(),
				fetchResponse.getInStock()
		);
	}
}
