import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long n = scan.nextLong();
            long k = scan.nextLong();
            long l = Math.max(1, n - k + 1);
            long r = n;
            long count = (r - l + 1);
            long oddCount = ((r + 1) / 2) - (l / 2);
            if (oddCount % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}