import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int s = scan.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scan.nextInt();
            }
            int minX = x[0];
            int maxX = x[n - 1];
            int steps = (maxX - minX) + Math.min(Math.abs(s - minX), Math.abs(s - maxX));
            System.out.println(steps);
        }
    }
}