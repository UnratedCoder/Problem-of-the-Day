import java.util.Arrays;
import java.util.Scanner;

public class unstop {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        int ans[] = new int[n];
        Arrays.fill(ans, 0);
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                ans[idx++] = a[i];
            }
        }
        for (int el : ans) {
            System.out.print(el + " ");
        }
    }
}
