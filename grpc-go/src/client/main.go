package main

import (
	"context"
	"flag"
	"google.golang.org/grpc"
	"log"
	"time"

	pb "google.golang.org/grpc-go/src/model"
	"google.golang.org/grpc/credentials/insecure"
)

var (
	addr = flag.String("addr", "localhost:9090", "the address to connect to")
)

func main() {
	flag.Parse()
	// Set up a connection to the server.
	conn, err := grpc.Dial(*addr, grpc.WithTransportCredentials(insecure.NewCredentials()))
	if err != nil {
		log.Fatalf("did not connect: %v", err)
	}
	defer conn.Close()
	// Contact the server and print out its response.
	ctx, cancel := context.WithTimeout(context.Background(), time.Second)
	defer cancel()

	// Calling the method
	movieName := "House Of Dragons - Season 2"
	movieItem := &pb.MovieItem{Name: movieName, Price: 5.5, InStock: true}
	client := pb.NewMovieClient(conn)

	// Save the new movie
	response, err := client.SaveNewMovie(ctx, movieItem)
	if err != nil {
		log.Fatalf("Error while adding the movie: %v", err)
	}
	log.Printf("Movie was saved: %v with item id: %v", response.GetWasSaved(), response.GetItemId())

	// Fetch the added movie
	foundMovie, err := client.FetchExistingMovie(ctx, &pb.FetchMovieRequest{Name: movieName})
	if err != nil {
		log.Fatalf("Error while fetching the movie: %v", err)
	}
	log.Printf("Fetched movie from the server: %v", foundMovie)
}
