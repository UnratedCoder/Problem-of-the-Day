import java.util.Arrays;

public class geeksforgeeks {

    public int editDistRec(String s1, String s2, int m, int n, int dp[][]) {
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return dp[m][n] = editDistRec(s1, s2, m - 1, n - 1, dp);
        }
        return dp[m][n] = 1 + Math.min(editDistRec(s1, s2, m, n - 1, dp),
                Math.min(editDistRec(s1, s2, m - 1, n, dp), editDistRec(s1, s2, m - 1, n - 1, dp)));
    }

    public int editDistance(String s1, String s2) {
        // Code here
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        return editDistRec(s1, s2, m, n, dp);
    }
}