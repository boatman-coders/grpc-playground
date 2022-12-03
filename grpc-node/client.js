// Boilerplate for generating gRPC code
const PROTO_PATH = './proto/movie.proto';
const grpc = require('@grpc/grpc-js');
const protoLoader = require('@grpc/proto-loader');

const packageDefinition = protoLoader.loadSync(PROTO_PATH, {
  keepCase: true,
  longs: String,
  enums: String,
  defaults: true,
  oneofs: true,
});
const movie = grpc.loadPackageDefinition(packageDefinition).movie;

// Our actual client code
function main() {
  // Start the client
  const client = new movie.Movie('localhost:9090', grpc.credentials.createInsecure());
  // Create a movie (any unassigned values in JS will default to the protobuf defaults.
  // Extras can be captured by the server, but are out of scope for this article)
  const terminator = {
    name: 'Terminator',
    price: 20.95,
    inStock: true,
  };
  console.log('Saving movie: ', terminator);
  // Call our save rpc and log a success or failure
  client.SaveNewMovie(terminator, function (err, response) {
    if (response) console.log('Response: ', response);
    if (err) console.error(err);
  });

  const fetchRequest = {
    name: 'The Lion King',
  };
  console.log('Fetching movie: ', fetchRequest);
  // Call our fetch rpc and log a success or failure
  client.FetchExistingMovie(fetchRequest, function (err, response) {
    if (response) console.log('Response: ', response);
    if (err) console.error(err);
  });
}
//Run our main method
main();
