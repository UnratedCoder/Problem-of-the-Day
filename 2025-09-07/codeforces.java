import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long n = scan.nextLong();
            long m = scan.nextLong();
            if ((n + m) % 2 == 0) {
                System.out.println("Tonya");
            } else {
                System.out.println("Burenka");
            }
        }
    }
}