import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int minEnergyCost(int[] energy, int N, int K) {
        // User should write their logic here
        int dp[] = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= K && i - j >= 0; j++) {
                int cost = dp[i - j] + Math.abs(energy[i] - energy[i - j]);
                dp[i] = Math.min(dp[i], cost);
            }
        }
        return dp[N - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] energy = new int[N];
        for (int i = 0; i < N; i++) {
            energy[i] = scanner.nextInt();
        }

        // Call the user logic function and print the output
        int result = minEnergyCost(energy, N, K);
        System.out.println(result);

        scanner.close();
    }
}
