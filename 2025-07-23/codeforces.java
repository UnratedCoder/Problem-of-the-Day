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
            int x = scan.nextInt();
            int max = -1;
            int y = 1;
            for (int i = 1; i < x; i++) {
                int val = gcd(x, i) + i;
                if (val > max) {
                    max = val;
                    y = i;
                }
            }
            System.out.println(y);
        }
    }
}