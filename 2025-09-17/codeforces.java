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
            Arrays.sort(a);
            boolean possible = true;
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] > 1) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}