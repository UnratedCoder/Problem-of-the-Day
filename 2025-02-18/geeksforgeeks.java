import java.util.PriorityQueue;

public class geeksforgeeks {

    public int distance(int point[]) {
        return point[0] * point[0] + point[1] * point[1];
    }

    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> distance(b) - distance(a));
        for (int point[] : points) {
            if (pq.size() < k) {
                pq.offer(point);
            } else {
                if (distance(point) < distance(pq.peek())) {
                    pq.poll();
                    pq.offer(point);
                }
            }
        }
        int ans[][] = new int[k][2];
        int idx = 0;
        while (!pq.isEmpty()) {
            int point[] = pq.poll();
            ans[idx][0] = point[0];
            ans[idx][1] = point[1];
            idx++;
        }
        return ans;
    }
}