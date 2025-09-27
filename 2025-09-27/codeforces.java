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
            int d = scan.nextInt();
            int k = scan.nextInt();
            int pens = (a + c - 1) / c;
            int pencils = (b + d - 1) / d;
            if (pens + pencils <= k) {
                System.out.println(pens + " " + pencils);
            } else {
                System.out.println(-1);
            }
        }
    }
}