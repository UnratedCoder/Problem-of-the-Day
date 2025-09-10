import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int[] prices = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                prices[i] = scan.nextInt();
                sum += prices[i];
            }
            long p = (sum + n - 1) / n;
            System.out.println(p);
        }
    }
}