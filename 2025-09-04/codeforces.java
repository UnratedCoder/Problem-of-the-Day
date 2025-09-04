import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            int iterations = 1;
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    iterations += a[i] - b[i];
                }
            }
            System.out.println(iterations);
        }
    }
}