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
            int time1 = Math.abs(a - 1);
            int time2 = Math.abs(b - c) + Math.abs(c - 1);
            if (time1 < time2) {
                System.out.println(1);
            } else if (time2 < time1) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}