import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static void can_partition_chocolates(int n, int[] chocolates) {
        // Write your logic here.
        int totalSum = 0;
        for (int choco : chocolates) {
            totalSum += choco;
        }
        if (totalSum % 2 != 0) {
            System.out.println("NO");
            return;
        }
        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int choco : chocolates) {
            for (int j = target; j >= choco; j--) {
                dp[j] = dp[j] || dp[j - choco];
            }
        }
        if (dp[target]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = scanner.nextInt();
        }
        can_partition_chocolates(n, chocolates);
    }
}
