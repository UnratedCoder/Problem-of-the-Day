import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int stringBreaker(String s, int n, String[] dictionary) {
		// Write your code here.
		HashSet<String> set = new HashSet<>();
		for (String el : dictionary) {
			set.add(el);
		}
		if (set.contains(s)) {
			return 0;
		}
		int dp[] = new int[s.length() + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = -1;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				String sub = s.substring(j, i);
				if (set.contains(sub) && dp[j] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[j] + 1);
				}
			}
		}
		return dp[s.length()] == Integer.MAX_VALUE ? -1 : dp[s.length()];
	}
}