import java.util.*;

public class geeksforgeeks {

    public int manhattanDist(int x[], int y[]) {
        return Math.abs(x[0] - y[0]) + Math.abs(x[1] - y[1]);
    }

    public int minCost(int[][] houses) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        boolean visited[] = new boolean[houses.length];
        pq.offer(new int[] { 0, 0 });
        int minCost = 0;
        while (!pq.isEmpty()) {
            int curr[] = pq.poll();
            int cost = curr[0];
            int u = curr[1];
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            minCost += cost;
            for (int i = 0; i < houses.length; i++) {
                if (!visited[i]) {
                    int dist = manhattanDist(houses[u], houses[i]);
                    pq.offer(new int[] { dist, i });
                }
            }
        }
        return minCost;
    }
}