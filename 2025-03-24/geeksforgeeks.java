public class geeksforgeeks {

    static int matrixMultiplication(int arr[]) {
        // code here
        int dp[][] = new int[arr.length][arr.length];
        for (int i = 2; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                int k = j + i;
                dp[j][k] = Integer.MAX_VALUE;
                for (int l = j + 1; l < k; l++) {
                    int cost = dp[j][l] + dp[l][k] + arr[j] * arr[l] * arr[k];
                    if (cost < dp[j][k]) {
                        dp[j][k] = cost;
                    }
                }
            }
        }
        return dp[0][arr.length - 1];
    }
}