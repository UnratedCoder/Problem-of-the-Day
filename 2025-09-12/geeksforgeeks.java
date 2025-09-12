import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int res = arr[arr.length - 1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0) {
                continue;
            }
            int min = Math.min(arr[0] + k, arr[i] - k);
            int max = Math.max(arr[i - 1] + k, arr[arr.length - 1] - k);
            res = Math.min(res, max - min);
        }
        return res;
    }
}