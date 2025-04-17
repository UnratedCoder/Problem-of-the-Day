import java.util.*;

public class geeksforgeeks {

    // GfG 160 - 160 Days of Problem Solving (Day 154)
    public ArrayList<ArrayList<int[]>> constructAdj(int V, int edges[][]) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new int[] { v, wt });
            adj.get(v).add(new int[] { u, wt });
        }
        return adj;
    }

    public int shortestPath(int V, ArrayList<ArrayList<int[]>> adj, int src, int dest) {
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        dist[src] = 0;
        pq.offer(new int[] { 0, src });
        while (!pq.isEmpty()) {
            int curr[] = pq.poll();
            int d = curr[0];
            int u = curr[1];
            if (d > dist[u]) {
                continue;
            }
            for (int neighbor[] : adj.get(u)) {
                int v = neighbor[0];
                int wt = neighbor[1];
                if ((u == src && v == dest) || (u == dest && v == src)) {
                    continue;
                }
                if (dist[v] > dist[u] + wt) {
                    dist[v] = dist[u] + wt;
                    pq.offer(new int[] { dist[v], v });
                }
            }
        }
        return dist[dest];
    }

    public int findMinCycle(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<int[]>> adj = constructAdj(V, edges);
        int minCycle = Integer.MAX_VALUE;
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            int dist = shortestPath(V, adj, u, v);
            if (dist != Integer.MAX_VALUE) {
                minCycle = Math.min(minCycle, dist + wt);
            }
        }
        return minCycle;
    }
}