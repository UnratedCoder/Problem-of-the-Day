import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int el = scan.nextInt();
                min = Math.min(min, el);
                max = Math.max(max, el);
            }
            System.out.println(max - min);
        }
        scan.close();
    }
}