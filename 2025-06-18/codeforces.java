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
            int n = scan.nextInt();
            int max = Math.max(a, Math.max(b, c));
            int required = max - a + max - b + max - c;
            int remaining = n - required;
            if (remaining < 0 || remaining % 3 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scan.close();
    }
}