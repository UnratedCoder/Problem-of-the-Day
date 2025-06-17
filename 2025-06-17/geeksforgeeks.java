import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int upperBond(int arr[], int si, int ei, int target) {
        while (si < ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] <= target) {
                si = mid + 1;
            } else {
                ei = mid;
            }
        }
        return si;
    }

    public int minimumCoins(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        int ans = Integer.MAX_VALUE;
        int prev = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            if (i > 0) {
                prev = pref[i - 1];
            }
            int position = upperBond(arr, i, arr.length, arr[i] + k);
            int total = prev;
            if (position < arr.length) {
                total += pref[arr.length - 1] - pref[position - 1] - (arr.length - position) * (arr[i] + k);
            }
            ans = Math.min(ans, total);
        }
        return ans;
    }
}