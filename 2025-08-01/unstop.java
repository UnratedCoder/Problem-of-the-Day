import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
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
        int count = 0;
        int prime = 0;
        for (int i = 2; i < 100000; i++) {
            if (isPrime(i)) {
                count++;
                prime = i;
                if (count == n) {
                    break;
                }
            }
        }
        System.out.println(prime * prime);
    }
}
