import java.util.*;

public class geeksforgeeks {

    public void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean visited[], int si, ArrayList<Integer> ans) {
        visited[si] = true;
        ans.add(si);
        for (Integer el : adj.get(si)) {
            if (!visited[el]) {
                dfsRec(adj, visited, el, ans);
            }
        }
    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[adj.size()];
        dfsRec(adj, visited, 0, ans);
        return ans;
    }
}