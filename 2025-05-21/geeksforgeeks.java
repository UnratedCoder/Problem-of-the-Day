public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int count(int m, int n, int value) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(value / i, n);
        }
        return count;
    }

    public int kthSmallest(int m, int n, int k) {
        // code here
        int low = 1;
        int high = m * n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (count(m, n, mid) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}