import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long k = scan.nextLong();
            long pos = a * ((k + 1) / 2) - b * (k / 2);
            System.out.println(pos);
        }
    }
}