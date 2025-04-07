import java.util.*;

public class geeksforgeeks {

    public boolean isCycleUtil(List<Integer>[] adj, int u, boolean[] visited, boolean stack[]) {
        if (stack[u]) {
            return true;
        }
        if (visited[u]) {
            return false;
        }
        visited[u] = true;
        stack[u] = true;
        for (int v : adj[u]) {
            if (isCycleUtil(adj, v, visited, stack)) {
                return true;
            }
        }
        stack[u] = false;
        return false;
    }

    public List<Integer>[] constructAdj(int V, int edges[][]) {
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int edge[] : edges) {
            adj[edge[0]].add(edge[1]);
        }
        return adj;
    }

    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<Integer>[] adj = constructAdj(V, edges);
        boolean visited[] = new boolean[V];
        boolean stack[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i] && isCycleUtil(adj, i, visited, stack)) {
                return true;
            }
        }
        return false;
    }
}