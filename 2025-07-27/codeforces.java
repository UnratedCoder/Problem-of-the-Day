import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            long x = scan.nextLong();
            long y = scan.nextLong();
            long dogs = Math.max(0, x - a);
            long cats = Math.max(0, y - b);
            if (dogs + cats <= c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}