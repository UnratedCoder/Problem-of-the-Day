public class code360 {

	// Problem of the Day (Moderate)
	public static int minimumCost(int n, String s, int[] cost) {
		// Write your code here.
		int totalMin = 0;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				if (cost[i - 1] < cost[i]) {
					totalMin += cost[i - 1];
				} else {
					totalMin += cost[i];
				}
				cost[i] = Math.max(cost[i], cost[i - 1]);
			}
		}
		return totalMin;
	}
}