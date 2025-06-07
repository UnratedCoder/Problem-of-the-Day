import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int longestCommonSum(int[] a1, int[] a2) {
        // Code here
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a1.length; i++) {
            sum1 += a1[i];
            sum2 += a2[i];
            int currDiff = sum1 - sum2;
            if (currDiff == 0) {
                ans = Math.max(ans, i + 1);
            } else if (map.containsKey(currDiff)) {
                ans = Math.max(ans, i - map.get(currDiff));
            } else {
                map.put(currDiff, i);
            }
        }
        return ans;
    }
}