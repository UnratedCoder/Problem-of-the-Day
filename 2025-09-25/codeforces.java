import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int m = scan.nextInt();
            long totalShift = 0;
            for (int i = 0; i < m; i++) {
                totalShift += scan.nextInt();
            }
            int index = (int) (totalShift % n);
            System.out.println(a[index]);
        }
    }
}