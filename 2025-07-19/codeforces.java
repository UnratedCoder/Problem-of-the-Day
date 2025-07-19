import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scan.nextInt();
            }
            long sqrt = (long) Math.sqrt(sum);
            System.out.println(sqrt * sqrt == sum ? "YES" : "NO");
        }
    }
}