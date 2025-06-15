import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long gcd = gcd(a, b);
            long lcm = (a * b) / gcd;
            System.out.println(lcm);
        }
    }
}