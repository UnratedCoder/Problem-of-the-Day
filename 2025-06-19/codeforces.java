import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int diff = Math.abs(a - b);
            int n = 2 * diff;
            if (Math.max(a, Math.max(b, c)) > n) {
                System.out.println(-1);
                continue;
            }
            int d = (c + diff) % n;
            if (d == 0) {
                d = n;
            }
            System.out.println(d);
        }
        scan.close();
    }
}