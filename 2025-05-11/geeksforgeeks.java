import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static int kthLargest(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum[] = new int[n + 1];
        sum[0] = 0;
        sum[1] = arr[0];
        for (int i = 2; i <= n; i++) {
            sum[i] = sum[i - 1] + arr[i - 1];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int x = sum[j] - sum[i - 1];
                if (pq.size() < k) {
                    pq.add(x);
                } else {
                    if (pq.peek() < x) {
                        pq.poll();
                        pq.add(x);
                    }
                }
            }
        }
        return pq.peek();
    }
}