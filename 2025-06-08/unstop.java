import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    static final int MOD = 1000000007;

    public static int lily(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        }
        int dp[] = new int[n + 1];
        dp[0] = 2;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the input integer
        scanner.close();
        int result = lily(n); // Call the user logic function
        System.out.println(result); // Print the result
    }
}