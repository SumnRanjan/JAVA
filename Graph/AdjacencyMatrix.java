package Graph;
import java.util.*;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of Vertex : ");
            int n = sc.nextInt();
            
            int[][] adjMatrix = new int[n + 1][n + 1];
            
            System.out.print("Enter the number of edges : ");
            int edges = sc.nextInt();
            
            for (int i = 0; i < edges; i++) {
                System.out.print("Enter source vertex of edges " + (i + 1) + ": ");
                int source = sc.nextInt();
                
                System.out.print("Enter destination vertex of edges " + (i + 1) + ": ");
                int destination = sc.nextInt();
                
                //for undirected graph
                adjMatrix[source][destination] = 1;
                adjMatrix[destination][source] = 1;
                
                //for directed graph
                //adjMatrix[source][destination] = 1;
            }

            //Display the adjMatrix;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
