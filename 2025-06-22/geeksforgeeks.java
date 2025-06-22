import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public ArrayList<Integer> largestSubset(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);
        int[] parent = new int[arr.length];
        Arrays.fill(parent, -1);
        int maxSize = 1;
        int lastIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] % arr[i] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                lastIdx = i;
            }
        }
        for (int i = lastIdx; i >= 0; i = parent[i]) {
            result.add(arr[i]);
            if (parent[i] == -1) {
                break;
            }
        }
        return result;
    }
}