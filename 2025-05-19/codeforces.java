import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int w = scan.nextInt();
        scan.close();
        int maxRoll = Math.max(y, w);
        int total = 6;
        int favorable = 7 - maxRoll;
        int divisor = gcd(favorable, total);
        System.out.println((favorable / divisor) + "/" + (total / divisor));
    }
}