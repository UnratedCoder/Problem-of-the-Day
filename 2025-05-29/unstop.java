import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int sumOfSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = sumOfSquare(n);
        }
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}