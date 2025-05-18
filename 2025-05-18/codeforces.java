import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int distance = Math.abs(a - b);
            if (distance % 2 == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scan.close();
    }
}