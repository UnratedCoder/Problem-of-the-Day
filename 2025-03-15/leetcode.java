public class leetcode {

    public int minCapability(int[] a, int k) {
        int ans = 0;
        int low = Integer.MAX_VALUE;
        int high = 0;
        for (int el : a) {
            low = Math.min(low, el);
        }
        for (int el : a) {
            high = Math.max(high, el);
        }
        while (high >= low) {
            int mid = (low + high) / 2;
            int max = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] <= mid) {
                    i++;
                    max++;
                }
            }
            if (max >= k) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
