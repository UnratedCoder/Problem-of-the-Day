import java.util.Arrays;

public class geeksforgeeks {

    public int isPalindrome(int i, int j, String s, int dp[][]) {
        if (i == j) {
            return 1;
        }
        if (j == i + 1 && s.charAt(i) == s.charAt(j)) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s.charAt(i) == s.charAt(j) && isPalindrome(i + 1, j - 1, s, dp) == 1) {
            dp[i][j] = 1;
        } else {
            dp[i][j] = 0;
        }
        return dp[i][j];
    }

    public int countPS(String s) {
        // code here
        int dp[][] = new int[s.length()][s.length()];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(i, j, s, dp) == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}