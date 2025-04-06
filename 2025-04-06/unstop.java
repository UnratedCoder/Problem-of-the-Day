import java.util.*;

public class unstop {

    public static long gcd(long p, long n) {
        while (p > 0 && n > 0) {
            if (p > n) {
                p = p % n;
            } else {
                n = n % p;
            }
        }
        if (p == 0) {
            return n;
        } else {
            return p;
        }
    }

    public static long computeX(long p, long n) {
        // Write your logic here
        long gcd = gcd(p, n);
        return (p * n) / gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long p = scanner.nextLong(); // First input is the long long integer p
        long n = scanner.nextLong(); // Second input is the long long integer n
        scanner.close();
        // Call user logic function and print the output
        long result = computeX(p, n);
        System.out.println(result);
    }
}