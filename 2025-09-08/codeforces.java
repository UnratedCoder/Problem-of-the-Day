import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int k = scan.nextInt();
            int expectedCost = n * m - 1;
            if (k == expectedCost) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}