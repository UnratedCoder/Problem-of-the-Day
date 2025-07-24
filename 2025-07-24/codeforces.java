import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int x = scan.nextInt();
            int min = Integer.MAX_VALUE;
            while (x > 0) {
                min = Math.min(min, x % 10);
                x /= 10;
            }
            System.out.println(min);
        }
    }
}