import java.util.*;

public class geeksforgeeks {

    public List<int[]>[] constructAdj(int V, int edges[][]) {
        List<int[]> adj[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj[u].add(new int[] { v, wt });
            adj[v].add(new int[] { u, wt });
        }
        return adj;
    }

    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        List<int[]> adj[] = constructAdj(V, edges);
        TreeSet<int[]> set = new TreeSet<>((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        set.add(new int[] { 0, src });
        dist[src] = 0;
        while (!set.isEmpty()) {
            int top[] = set.pollFirst();
            int u = top[1];
            for (int el[] : adj[u]) {
                int v = el[0];
                int wt = el[1];
                if (dist[v] > dist[u] + wt) {
                    if (dist[v] != Integer.MAX_VALUE) {
                        set.remove(new int[] { dist[v], v });
                    }
                    dist[v] = dist[u] + wt;
                    set.add(new int[] { dist[v], v });
                }
            }
        }
        return dist;
    }
}