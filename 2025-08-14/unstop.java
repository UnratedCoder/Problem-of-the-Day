import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int maxProfit(int[] profits) {
        // Write your logic here
        int n = profits.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return profits[0];
        }
        int prev1 = Math.max(profits[0], profits[1]);
        int prev2 = profits[0];
        for (int i = 2; i < n; i++) {
            int curr = Math.max(prev1, profits[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] profits = new int[N];

        for (int i = 0; i < N; ++i) {
            profits[i] = scanner.nextInt();
        }

        // Call user logic function and print the output
        int result = maxProfit(profits);
        System.out.println(result);
    }
}
