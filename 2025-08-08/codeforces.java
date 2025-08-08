import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long n = scan.nextLong();
            long m = scan.nextLong();
            long x = scan.nextLong();
            long row = (x - 1) % n + 1;
            long col = (x - 1) / n + 1;
            long result = (row - 1) * m + col;
            System.out.println(result);
        }
    }
}