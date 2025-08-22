import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long p = scan.nextLong();
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            long waitA = (a - (p % a)) % a;
            long waitB = (b - (p % b)) % b;
            long waitC = (c - (p % c)) % c;
            long result = Math.min(waitA, Math.min(waitB, waitC));
            System.out.println(result);
        }
    }
}