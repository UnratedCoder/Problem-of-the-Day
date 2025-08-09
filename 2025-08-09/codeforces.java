import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int r = scan.nextInt();
            int b = scan.nextInt();
            int d = scan.nextInt();
            int max = Math.max(r, b);
            int min = Math.min(r, b);
            if ((long) (d + 1) * min >= max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}