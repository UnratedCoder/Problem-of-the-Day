import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int xor = 0;
        for (int i = 0; i < n; i++) {
            int el = x + 2 * i;
            xor ^= el;
        }
        int count = 0;
        for (int i = 2; i <= xor; i++) {
            count += isPrime(i) ? 1 : 0;
        }
        System.out.println(count);
    }
}