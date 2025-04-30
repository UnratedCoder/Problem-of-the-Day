import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNextPrime(int n, int m) {
        for (int i = n; i < m; i++) {
            if (isPrime(i)) {
                return false;
            }
        }
        return isPrime(m);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        if (isNextPrime(n + 1, m)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}