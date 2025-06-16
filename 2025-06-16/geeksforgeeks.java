public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int findCost(int heights[], int cost[], int h) {
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            ans += cost[i] * Math.abs(heights[i] - h);
        }
        return ans;
    }

    public int minCost(int[] heights, int[] cost) {
        // code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int el : heights) {
            min = Math.min(min, el);
            max = Math.max(max, el);
        }
        int low = min;
        int high = max;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int A = findCost(heights, cost, mid - 1);
            int B = findCost(heights, cost, mid);
            int C = findCost(heights, cost, mid + 1);
            if (B <= A && B <= C) {
                ans = B;
                break;
            } else if (A >= B && B >= C) {
                low = mid + 1;
            } else if (B >= A && C >= B) {
                high = mid - 1;
            }
        }
        return ans;
    }
}