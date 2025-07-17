import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean isOddDigit(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0)
                return false;
            n /= 10;
        }
        return true;
    }

    public static int next_good_number(int x) {
        // Write your logic here.
        for (int i = x + 1; i < Integer.MAX_VALUE; i++) {
            if (isOddDigit(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] results = new int[T];

        for (int i = 0; i < T; i++) {
            int x = scanner.nextInt();
            results[i] = next_good_number(x);
        }

        for (int res : results) {
            System.out.println(res);
        }
    }
}