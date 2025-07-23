import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    static final int MOD = 1000000007;

    public static int ways(int sum) {
        // Write your logic here.
        int dp[] = new int[sum + 1];
        dp[0] = 1;
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i - j >= 0) {
                    dp[i] = (dp[i] + dp[i - j]) % MOD;
                }
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = ways(n);
        System.out.println(result);
    }
}