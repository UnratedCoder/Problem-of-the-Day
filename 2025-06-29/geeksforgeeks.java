import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean check(int arr[], int k, int mid) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                return false;
            }
            sum += arr[i];
            if (sum > mid) {
                count++;
                sum = arr[i];
            }
        }
        count++;
        return count <= k;
    }

    public int splitArray(int[] arr, int k) {
        // code here
        int max = Arrays.stream(arr).max().getAsInt();
        int start = max;
        int end = 0;
        for (int el : arr) {
            end += el;
        }
        int result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (check(arr, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}