public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    int lcsOf3(String s1, String s2, String s3) {
        // code here
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();
        int dp[][][] = new int[n1 + 1][n2 + 1][n3 + 1];
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                for (int k = 0; k <= n3; k++) {
                    if (i == 0 || j == 0 || k == 0) {
                        dp[i][j][k] = 0;
                    } else if (s1.charAt(i - 1) == s2.charAt(j - 1) && s1.charAt(i - 1) == s3.charAt(k - 1)) {
                        dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
                    } else {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], Math.max(dp[i][j - 1][k], dp[i][j][k - 1]));
                    }
                }
            }
        }
        return dp[n1][n2][n3];
    }
}