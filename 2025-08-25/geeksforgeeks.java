import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean isPossible(int arr[], int k, int target) {
        int n = arr.length;
        if (n % 2 == 1) {
            for (int i = n / 2; i < n; ++i) {
                if (arr[i] < target) {
                    k -= (target - arr[i]);
                }
            }
        } else {
            if (arr[n / 2] <= target) {
                k -= (target - arr[n / 2]);
                k -= (target - arr[n / 2 - 1]);
            } else {
                k -= (2 * target - (arr[n / 2] + arr[n / 2 - 1]));
            }
            for (int i = n / 2 + 1; i < n; ++i) {
                if (arr[i] < target) {
                    k -= target - arr[i];
                }
            }
        }
        return k >= 0;
    }

    public int maximizeMedian(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int initialMed = arr[n / 2];
        if (n % 2 == 0) {
            initialMed += arr[n / 2 - 1];
            initialMed /= 2;
        }
        int low = initialMed, high = initialMed + k;
        int bestMed = initialMed;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, k, mid)) {
                bestMed = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return bestMed;
    }
}