import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean isPossible(int arr[], int k, int mid) {
        int count = 1;
        int last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= mid) {
                count++;
                last = arr[i];
            }
            if (count == k) {
                return true;
            }
        }
        return false;
    }

    public int maxMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low = 0;
        int high = arr[arr.length - 1] - arr[0];
        int result = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, k, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}