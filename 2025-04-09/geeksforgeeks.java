import java.util.*;

public class geeksforgeeks {

    static ArrayList<ArrayList<Integer>> constructAdj(int V, int edges[][]) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int edge[] : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return adj;
    }

    static void findPoints(ArrayList<ArrayList<Integer>> adj, int V, int visited[], int disc[], int low[], int time[],
            int parent, int isAP[]) {
        visited[V] = 1;
        disc[V] = low[V] = ++time[0];
        int children = 0;
        for (int el : adj.get(V)) {
            if (visited[el] == 0) {
                children++;
                findPoints(adj, el, visited, disc, low, time, V, isAP);
                low[V] = Math.min(low[V], low[el]);
                if (parent != -1 && low[el] >= disc[V]) {
                    isAP[V] = 1;
                }
            } else if (el != parent) {
                low[V] = Math.min(low[V], disc[el]);
            }
        }
        if (parent == -1 && children > 1) {
            isAP[V] = 1;
        }
    }

    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = constructAdj(V, edges);
        int disc[] = new int[V];
        int low[] = new int[V];
        int visited[] = new int[V];
        int isAP[] = new int[V];
        int time[] = { 0 };
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                findPoints(adj, i, visited, disc, low, time, -1, isAP);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (isAP[i] == 1) {
                ans.add(i);
            }
        }
        if (ans.isEmpty()) {
            ans.add(-1);
        }
        return ans;
    }
}