import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    static int longestSubarray(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum += (arr[i] > k) ? 1 : -1;
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        if (map.containsKey(-n)) {
            return 0;
        }
        map.put(-n, n);
        for (int i = -n + 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                map.put(i, map.get(i - 1));
            } else {
                map.put(i, Math.min(map.get(i), map.get(i - 1)));
            }
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (arr[i] > k ? 1 : -1);
            if (sum > 0) {
                ans = i + 1;
            } else {
                ans = Math.max(ans, i - map.get(sum - 1));
            }
        }
        return ans;
    }
}