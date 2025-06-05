import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int ans = Integer.MAX_VALUE;
            ans = Math.min(ans, Math.max(2 * a, b));
            ans = Math.min(ans, Math.max(2 * b, a));
            ans = Math.min(ans, Math.max(a, b) * 2);
            ans = Math.min(ans, Math.max(a + b, Math.max(a, b)));
            System.out.println(ans * ans);
        }
    }
}