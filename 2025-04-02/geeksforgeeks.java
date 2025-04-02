import java.util.*;

public class geeksforgeeks {

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int si = 0;
        ArrayList<Integer> list = new ArrayList<>();
        boolean visited[] = new boolean[adj.size()];
        visited[si] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(si);
        while (!q.isEmpty()) {
            int curr = q.poll();
            list.add(curr);
            for (int el : adj.get(curr)) {
                if (!visited[el]) {
                    visited[el] = true;
                    q.add(el);
                }
            }
        }
        return list;
    }
}