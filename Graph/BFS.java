package Graph;

import java.util.*;

// Breadth First
public class BFS {

    public static void bsf(int start, List<Integer>[] graph) {
        boolean[] visited = new boolean[graph.length]; 
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        System.out.println("BFS Traversal starting from node " + start + ": ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph[node]) { 
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of vertices: ");
            int n = sc.nextInt();

            @SuppressWarnings("unchecked")
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

                adjList[source].add(destination);
                adjList[destination].add(source);
            }

            System.out.println("Adjacency List:");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ": ");
                for (int neighbor : adjList[i]) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }

            bsf(2, adjList); // Start BFS from node 1
        }
    }
}