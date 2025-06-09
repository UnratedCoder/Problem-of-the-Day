import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int floor = 0;
            if (n <= 2) {
                floor = 1;
            } else {
                floor = 1 + (int) Math.ceil((n - 2) / (double) x);
            }
            System.out.println(floor);
        }
        scan.close();
    }
}