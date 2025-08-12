import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long n = scan.nextLong();
            if (n % 2050 != 0) {
                System.out.println(-1);
                continue;
            }
            long quotient = n / 2050;
            int sum = 0;
            while (quotient > 0) {
                sum += quotient % 10;
                quotient /= 10;
            }
            System.out.println(sum);
        }
    }
}