import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        int n = dq.size();
        if (n == 0) {
            return;
        }
        k = k % n;
        if (type == 1) {
            for (int i = 0; i < k; i++) {
                int val = dq.pollLast();
                dq.offerFirst(val);
            }
        } else if (type == 2) {
            for (int i = 0; i < k; i++) {
                int val = dq.pollFirst();
                dq.offerLast(val);
            }
        }
    }
}