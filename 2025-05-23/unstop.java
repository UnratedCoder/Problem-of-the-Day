import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int minStepsToZero(int n) {
        // User logic to be implemented here
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                if (digit != 0) {
                    dp[i] = Math.min(dp[i], dp[i - digit] + 1);
                }
                num /= 10;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(minStepsToZero(n));
    }
}