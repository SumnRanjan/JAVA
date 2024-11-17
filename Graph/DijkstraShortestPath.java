package Graph;

import java.util.*;

class Graph {
    private final int V; // Number of vertices
    private final List<List<Node>> adj; // Adjacency list


    static class Node {
        int vertex;
        int weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    // Constructor
    public Graph(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Function to add an edge to the graph
    public void addEdge(int src, int dest, int weight) {
        adj.get(src).add(new Node(dest, weight));
        adj.get(dest).add(new Node(src, weight)); // For undirected graph
    }

    // Dijkstra's algorithm implementation
    public void dijkstra(int src) {
        int[] dist = new int[V]; // Distance from source to each vertex
        boolean[] sptSet = new boolean[V]; // Shortest path tree set

        // Initialize distances as infinite and sptSet as false
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(sptSet, false);

        // Distance from source to itself is always 0
        dist[src] = 0;

        // Priority queue to select the vertex with the minimum distance
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        pq.add(new Node(src, 0));

        while (!pq.isEmpty()) {
            // Get the vertex with the smallest distance
            int u = pq.poll().vertex;

            // Mark the vertex as processed
            sptSet[u] = true;

            for (Node neighbor : adj.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (!sptSet[v] && dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v])); // Add updated distance to the priority queue
                }
            }
        }

        printSolution(dist);
    }

    private void printSolution(int dist[]) {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of vertices: ");
            int vertices = scanner.nextInt();
            
            Graph graph = new Graph(vertices);
            
            System.out.print("Enter the number of edges: ");
            int edges = scanner.nextInt();
            
            System.out.println("Enter each edge in the format: src dest weight");
            for (int i = 0; i < edges; i++) {
                int src = scanner.nextInt();
                int dest = scanner.nextInt();
                int weight = scanner.nextInt();
                graph.addEdge(src, dest, weight);
            }
            
            System.out.print("Enter the starting vertex (0 to " + (vertices - 1) + "): ");
            int startVertex = scanner.nextInt();
            
            graph.dijkstra(startVertex);
        }
    }
}