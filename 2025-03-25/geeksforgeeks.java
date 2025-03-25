public class geeksforgeeks {

    static boolean evaluate(int bool1, int bool2, char operator) {
        if (operator == '&') {
            return (bool1 & bool2) == 1;
        }
        if (operator == '|') {
            return (bool1 | bool2) == 1;
        }
        return (bool1 ^ bool2) == 1;
    }

    static int countWays(String s) {
        // code here
        int dp[][][] = new int[s.length()][s.length()][2];
        for (int i = 0; i < s.length(); i += 2) {
            dp[i][i][1] = s.charAt(i) == 'T' ? 1 : 0;
            dp[i][i][0] = s.charAt(i) == 'F' ? 1 : 0;
        }
        for (int i = 2; i < s.length(); i += 2) {
            for (int j = 0; j < s.length() - i; j += 2) {
                int k = j + i;
                dp[j][k][0] = dp[j][k][1] = 0;
                for (int l = j + 1; l < k; l += 2) {
                    char operator = s.charAt(l);
                    int leftTrue = dp[j][l - 1][1];
                    int leftFalse = dp[j][l - 1][0];
                    int rightTrue = dp[l + 1][k][1];
                    int rightFalse = dp[l + 1][k][0];
                    if (evaluate(1, 1, operator)) {
                        dp[j][k][1] += leftTrue * rightTrue;
                    }
                    if (evaluate(1, 0, operator)) {
                        dp[j][k][1] += leftTrue * rightFalse;
                    }
                    if (evaluate(0, 1, operator)) {
                        dp[j][k][1] += leftFalse * rightTrue;
                    }
                    if (evaluate(0, 0, operator)) {
                        dp[j][k][1] += leftFalse * rightFalse;
                    }
                    if (!evaluate(1, 1, operator)) {
                        dp[j][k][0] += leftTrue * rightTrue;
                    }
                    if (!evaluate(1, 0, operator)) {
                        dp[j][k][0] += leftTrue * rightFalse;
                    }
                    if (!evaluate(0, 1, operator)) {
                        dp[j][k][0] += leftFalse * rightTrue;
                    }
                    if (!evaluate(0, 0, operator)) {
                        dp[j][k][0] += leftFalse * rightFalse;
                    }
                }
            }
        }
        return dp[0][s.length() - 1][1];
    }
}