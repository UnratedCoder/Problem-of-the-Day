import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int maximumProfit(ArrayList<Integer> prices) {
		// Write your code here.
		int maxProfit = 0;
		int buyPrice = Integer.MAX_VALUE;
		for (Integer p : prices) {
			if (buyPrice > p) {
				buyPrice = p;
			} else {
				int profit = p - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}
}