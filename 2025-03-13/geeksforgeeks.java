public class geeksforgeeks {

    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int dp[][] = new int[wt.length + 1][W + 1];
        for (int i = 0; i <= wt.length; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    int curr = 0;
                    if (wt[i - 1] <= j) {
                        curr = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    }
                    int temp = dp[i - 1][j];
                    dp[i][j] = Math.max(curr, temp);
                }
            }
        }
        return dp[wt.length][W];
    }
}