import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long n = scan.nextLong();
            long group = n / 15;
            long remainder = n % 15;
            long extra = 0;
            for (int i = 0; i <= remainder; i++) {
                if (i % 3 == i % 5) {
                    extra++;
                }
            }
            System.out.println(group * 3 + extra);
        }
        scan.close();
    }
}