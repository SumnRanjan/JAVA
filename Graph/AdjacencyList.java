package Graph;
import java.util.*;

public class AdjacencyList {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of vertices: ");
            int n = sc.nextInt();
            
            // Initialize the adjacency list
            @SuppressWarnings("unchecked") // SUPPRESS WARNING
            List<Integer>[] adjList = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                adjList[i] = new ArrayList<>();
            }

            System.out.print("Enter the number of edges: ");
            int edges = sc.nextInt();
            
            for (int i = 0; i < edges; i++) {
                System.out.print("Enter source vertex of edge " + (i + 1) + ": ");
                int source = sc.nextInt();
                
                System.out.print("Enter destination vertex of edge " + (i + 1) + ": ");
                int destination = sc.nextInt();
                
                // For undirected graph
                adjList[source].add(destination);
                adjList[destination].add(source);
                
                // Uncomment the following line for directed graph
                // adjList[source].add(destination);
            }
            
            // Display the adjacency list
            System.out.println("Adjacency List:");
            for (int i = 1; i <= n; i++) { 
                System.out.print(i + ": ");
                for (int neighbor : adjList[i]) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }
}
