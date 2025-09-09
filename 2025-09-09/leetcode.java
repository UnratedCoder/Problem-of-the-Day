public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;
        long dp[] = new long[n + 1];
        dp[1] = 1;
        for (int i = 1; i <= n; i++) {
            if (dp[i] == 0)
                continue;
            for (int j = i + delay; j < i + forget && j <= n; j++) {
                dp[j] = (dp[j] + dp[i]) % MOD;
            }
        }
        long result = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            result = (result + dp[i]) % MOD;
        }
        return (int) result;
    }
}
