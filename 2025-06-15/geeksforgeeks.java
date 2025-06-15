public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int low = 1;
        int high = 0;
        for (int el : arr) {
            if (el > high) {
                high = el;
            }
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            for (int el : arr) {
                sum += (el + mid - 1) / mid;
            }
            if (sum <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}