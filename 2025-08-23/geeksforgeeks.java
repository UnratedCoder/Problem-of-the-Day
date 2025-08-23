import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean check(int arr[], int k, int pageLimit) {
        int count = 1, pageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pageSum + arr[i] > pageLimit) {
                count++;
                pageSum = arr[i];
            } else {
                pageSum += arr[i];
            }
        }
        return count <= k;
    }

    public int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length) {
            return -1;
        }
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}