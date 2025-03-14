public class geeksforgeeks {

    public int count(int coins[], int sum) {
        // code here.
        int dp[] = new int[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= sum; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[sum];
    }
}