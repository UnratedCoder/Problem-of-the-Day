import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long n = scan.nextLong();
            System.out.println((n >= 9) ? (n - 9) / 10 + 1 : 0);
        }
    }
}