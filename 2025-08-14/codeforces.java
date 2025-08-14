import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int distance = y - x;
            int totalSpeed = a + b;
            if (distance % totalSpeed == 0) {
                System.out.println(distance / totalSpeed);
            } else {
                System.out.println(-1);
            }
        }
    }
}