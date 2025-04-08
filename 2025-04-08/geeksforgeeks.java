import java.util.*;

public class geeksforgeeks {

    public void DFS(List<Integer> adj[], boolean visited[], int c) {
        visited[c] = true;
        for (int i : adj[c]) {
            if (!visited[i]) {
                DFS(adj, visited, i);
            }
        }
    }

    public List<Integer>[] constructAdj(int V, int edges[][], int c, int d) {
        List<Integer> adj[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int edge[] : edges) {
            int a = edge[0];
            int b = edge[1];
            if ((a == c && b == d) || (a == d && b == c)) {
                continue;
            }
            adj[a].add(b);
            adj[b].add(a);
        }
        return adj;
    }

    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // code here
        List<Integer> adj[] = constructAdj(V, edges, c, d);
        boolean visited[] = new boolean[V];
        DFS(adj, visited, c);
        return !visited[d];
    }
}