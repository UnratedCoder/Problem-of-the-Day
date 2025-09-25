import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int minimumElements(int num[], int x) {
		// Write your code here..
		int n = num.length;
		int dp[] = new int[x + 1];
		Arrays.fill(dp, (int) 1e9);
		dp[0] = 0;
		for (int i = 1; i <= x; i++) {
			for (int j = 0; j < n; j++) {
				if (num[j] <= i) {
					dp[i] = Math.min(dp[i], 1 + dp[i - num[j]]);
				}
			}
		}
		return dp[x] == (int) 1e9 ? -1 : dp[x];
	}
}