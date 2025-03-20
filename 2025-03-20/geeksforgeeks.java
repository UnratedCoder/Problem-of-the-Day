public class geeksforgeeks {

    public static int maxProfit(int[] prices) {
        // code here
        int profit[] = new int[prices.length];
        int maxPrice = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            profit[i] = Math.max(profit[i + 1], maxPrice - prices[i]);
        }
        int ans = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            ans = Math.max(ans, profit[i] + (prices[i] - minPrice));
        }
        return ans;
    }
}