import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int diff1 = x1 - y1;
            int diff2 = x2 - y2;
            if ((diff1 > 0 && diff2 > 0) || (diff1 < 0 && diff2 < 0)) {
                System.out.println("YES");
            } else if (x1 == x2 && y1 == y2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
