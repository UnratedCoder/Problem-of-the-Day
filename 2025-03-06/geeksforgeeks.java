public class geeksforgeeks {

    static int lcs(String s1, String s2) {
        // code here
        int dp[] = new int[s2.length() + 1];
        for (int i = 1; i <= s1.length(); ++i) {
            int prev = dp[0];
            for (int j = 1; j <= s2.length(); ++j) {
                int temp = dp[j];
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[j] = prev + 1;
                } else {
                    dp[j] = Math.max(dp[j - 1], dp[j]);
                }
                prev = temp;
            }
        }
        return dp[s2.length()];
    }
}