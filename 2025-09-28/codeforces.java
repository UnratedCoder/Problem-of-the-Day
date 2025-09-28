import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            int minVal = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] < minVal) {
                    minVal = a[i];
                    minIndex = i;
                }
            }
            int operations = 0;
            for (int i = 0; i < n; i++) {
                if (i == minIndex)
                    continue;
                operations += (k - a[i]) / minVal;
            }
            System.out.println(operations);
        }
    }
}