import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int i;
            for (i = 0; i < n; i++) {
                if (a[i] == 0) {
                    continue;
                } else if (x > 0 && a[i] == 1) {
                    i += x - 1;
                    x = 0;
                } else if (a[i] == 1 && x == 0) {
                    break;
                }
            }
            System.out.println(i >= n ? "YES" : "NO");
        }
        scan.close();
    }
}