import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            long totalAnna = a + (c + 1) / 2;
            long totalkatie = b + c / 2;
            if (totalAnna > totalkatie) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        scan.close();
    }
}