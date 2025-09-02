import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int A = Math.max(0, Math.max(b, c) - a + 1);
            int B = Math.max(0, Math.max(a, c) - b + 1);
            int C = Math.max(0, Math.max(a, b) - c + 1);
            System.out.println(A + " " + B + " " + C);
        }
    }
}