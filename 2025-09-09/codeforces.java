import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int w = scan.nextInt();
            int h = scan.nextInt();
            int n = scan.nextInt();
            int sheets = 1;
            while (w % 2 == 0) {
                w /= 2;
                sheets *= 2;
            }
            while (h % 2 == 0) {
                h /= 2;
                sheets *= 2;
            }
            if (sheets >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}