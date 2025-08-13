import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == 1 || m == 1) {
                System.out.println("YES");
            } else if (n == 2 && m == 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}