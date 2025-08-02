import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                sum--;
            } else {
                sum++;
            }
            if (sum > 0) {
                result = i + 1;
            } else {
                if (map.containsKey(sum - 1)) {
                    result = Math.max(result, i - map.get(sum - 1));
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return result;
    }
}