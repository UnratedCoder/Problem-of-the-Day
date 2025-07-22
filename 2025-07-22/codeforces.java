import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (m <= n && (n - m) % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}