import java.util.*;

public class unstop {
    static int calculateX(int N) {
        // Write your logic here.
        if (N == 0) {
            return 5;
        } else if (N == 1) {
            return 3;
        }
        int fact[] = new int[N + 1];
        fact[0] = 5;
        fact[1] = 3;
        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) {
                fact[i] = (fact[i - 1] * fact[i - 2]) % 999;
            } else {
                fact[i] = (fact[i - 1] + fact[i - 2]) % 998;
            }
        }
        return fact[N];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Read the single integer input
        scanner.close();
        int result = calculateX(N);
        System.out.println(result); // Print the result
    }
}