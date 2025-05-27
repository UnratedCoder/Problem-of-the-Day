public class code360 {

	// Problem of the Day (Easy)
	public static int oneIteration(int[] A) {
		// WRite your Code here
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int el : A) {
			if (max < el) {
				secMax = max;
				max = el;
			} else if (max > el && secMax < el) {
				secMax = el;
			}
		}
		return max + secMax;
	}

	// 6-Month Code Marathon - 1 (Day 61)
	public static int bestTimeToBuyAndSellStock(int[] prices) {
		// Write your code here.
		int maxProfit = 0;
		int buyStock = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (buyStock > prices[i]) {
				buyStock = prices[i];
			} else {
				int profit = prices[i] - buyStock;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}
}