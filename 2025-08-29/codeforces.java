import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int pairs = n / 2;
            int singles = n % 2;
            int cost = pairs * Math.min(2 * a, b) + singles * a;
            System.out.println(cost);
        }
    }
}