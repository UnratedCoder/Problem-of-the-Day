import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    static int mod = 1000000007;

    public static int countWays(int n) {
        // User will write the logic here
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        long key[] = new long[n + 1];
        key[1] = 1;
        key[2] = 2;
        for (int i = 3; i <= n; i++) {
            key[i] = (key[i - 1] + key[i - 2]) % mod;
        }
        return (int) key[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        // Call user logic function and print the output
        System.out.println(countWays(n));

        scanner.close();
    }
}