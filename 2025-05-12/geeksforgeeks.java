import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int mostBooked(int n, int[][] meetings) {
        // code here
        int count[] = new int[n];
        PriorityQueue<int[]> occurrance = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        });
        PriorityQueue<Integer> available = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            available.offer(i);
        }
        Arrays.sort(meetings, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        });
        for (int[] meeting : meetings) {
            int si = meeting[0];
            int ei = meeting[1];
            while (!occurrance.isEmpty() && occurrance.peek()[0] <= si) {
                available.offer(occurrance.poll()[1]);
            }
            if (!available.isEmpty()) {
                int r = available.poll();
                occurrance.offer(new int[] { ei, r });
                count[r]++;
            } else {
                int earliest[] = occurrance.poll();
                int t = earliest[0];
                int r = earliest[1];
                occurrance.offer(new int[] { t + (ei - si), r });
                count[r]++;
            }
        }
        int maxCount = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                ans = i;
            }
        }
        return ans;
    }
}