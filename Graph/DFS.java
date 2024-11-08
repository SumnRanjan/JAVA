package Graph;

import java.util.*;

// Depth First
public class DFS {

    public static void dsf(int start, List<Integer>[] graph) {
        boolean[] visited = new boolean[graph.length]; 
        Stack<Integer> st = new Stack<>();

        visited[start] = true;
        st.add(start);

        System.out.println("BFS Traversal starting from node " + start + ": ");

        while (!st.isEmpty()) {
            int node = st.pop();
            System.out.print(node + " ");

            for (int neighbor : graph[node]) { 
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    st.add(neighbor);
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

            dsf(1, adjList); // Start BFS from node 1
        }
    }
}