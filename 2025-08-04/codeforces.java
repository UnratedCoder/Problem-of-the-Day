import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            System.out.println(Math.abs(a - b) % 2 == 1 ? "Alice" : "Bob");
        }
    }
}