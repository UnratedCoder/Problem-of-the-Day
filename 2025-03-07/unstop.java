import java.util.Scanner;

public class unstop {

    public static int gcd(int a, int b) {
        if (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int modInverse(int A, int M) {
        int t = 0;
        int newT = 1;
        int R = M;
        int newR = A;
        while (newR != 0) {
            int quotient = R / newR;
            int tempT = t;
            t = newT;
            newT = tempT - quotient * newT;
            int tempR = R;
            R = newR;
            newR = tempR - quotient * newR;
        }
        if (R > 1) {
            return -1;
        }
        if (t < 0) {
            t = t + M;
        }
        return t;
    }

    public static boolean solve(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        // Call the mod_inverse function to get the inverse
        int t = modInverse(n, 10007);

        // Call solve function to determine if the inverse is a power of two
        boolean result = solve(t);

        // Print result as 1 if true, else 0
        System.out.println(result ? 1 : 0);
    }
}