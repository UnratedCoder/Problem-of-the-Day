import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean canEatAll(int arr[], int k, int mid) {
        int hours = 0;
        for (int i = 0; i < arr.length; i++) {
            hours += arr[i] / mid;
            if (arr[i] % mid != 0) {
                hours++;
            }
        }
        return hours <= k;
    }

    public int kokoEat(int[] arr, int k) {
        // code here
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEatAll(arr, k, mid)) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}