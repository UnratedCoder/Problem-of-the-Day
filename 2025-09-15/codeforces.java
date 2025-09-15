import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int k = scan.nextInt();
            int g = gcd(k, 100);
            int steps = 100 / g;
            System.out.println(steps);
        }
    }
}