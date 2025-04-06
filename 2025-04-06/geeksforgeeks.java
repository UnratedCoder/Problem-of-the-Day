import java.util.*;

public class geeksforgeeks {

    public static void topoSortUtil(int V, List<Integer>[] adj, boolean[] visited, Stack<Integer> s) {
        visited[V] = true;
        for (int i : adj[V]) {
            if (!visited[i]) {
                topoSortUtil(i, adj, visited, s);
            }
        }
        s.push(V);
    }

    public static List<Integer>[] constructAdj(int V, int edges[][]) {
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
        }
        return adj;
    }

    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[V];
        List<Integer>[] adj = constructAdj(V, edges);
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topoSortUtil(i, adj, visited, s);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!s.isEmpty()) {
            ans.add(s.pop());
        }
        return ans;
    }
}