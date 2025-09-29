import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int maxSubarrSum(int[] arr, int a, int b) {
        // code here
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        int max = arr[a - 1];
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(0);
        for (int i = a; i < n; i++) {
            if (i - b - 1 >= 0) {
                if (dq.peekFirst() == arr[i - b - 1]) {
                    dq.pollFirst();
                }
            } else if (i - b == 0) {
                if (dq.peekFirst() == 0) {
                    dq.pollFirst();
                }
            }
            while (!dq.isEmpty() && dq.peekLast() > arr[i - a]) {
                dq.pollLast();
            }
            dq.addLast(arr[i - a]);
            max = Math.max(max, arr[i] - dq.peekFirst());
        }
        return max;
    }
}