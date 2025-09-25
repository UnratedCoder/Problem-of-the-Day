import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int calculateMaxFun(int N, int B, int[] price, int[] stock, int[] fun) {
        // User logic goes here
        int[] dp = new int[B + 1];
        for (int i = 0; i < N; i++) {
            int p = price[i];
            int s = stock[i];
            int f = fun[i];
            int k = 1;
            while (s > 0) {
                int qty = Math.min(k, s);
                int cost = p * qty;
                int value = f * qty;
                for (int b = B; b >= cost; b--) {
                    dp[b] = Math.max(dp[b], dp[b - cost] + value);
                }
                s -= qty;
                k *= 2;
            }
        }
        int maxFun = 0;
        for (int val : dp) {
            maxFun = Math.max(maxFun, val);
        }
        return maxFun;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();

        int[] price = new int[N];
        int[] stock = new int[N];
        int[] fun = new int[N];

        for (int i = 0; i < N; i++) {
            price[i] = scanner.nextInt();
            stock[i] = scanner.nextInt();
            fun[i] = scanner.nextInt();
        }

        int maxFun = calculateMaxFun(N, B, price, stock, fun);
        System.out.println(maxFun);
    }
}
