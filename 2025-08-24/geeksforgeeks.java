import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean check(int arr[], int k, int m, int day) {
        int bouquet = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count += 1;
            } else {
                bouquet += count / k;
                count = 0;
            }
        }
        bouquet += count / k;
        return bouquet >= m;
    }

    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        int low = 0, result = -1;
        int high = Arrays.stream(arr).max().getAsInt();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(arr, k, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}