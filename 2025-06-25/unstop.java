import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int coinChange(int[] coins, int amount) {
        // Write your logic here.
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int el : coins) {
                if (el <= i) {
                    dp[i] = Math.min(dp[i], dp[i - el] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; ++i) {
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        int result = coinChange(coins, amount);
        System.out.println(result);
    }
}