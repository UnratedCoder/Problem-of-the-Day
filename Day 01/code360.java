import java.util.*;

public class code360 {

    public static long solve(int n, int[] a) {
        // Write your code here.
        long sum = 0;
        for (int el : a) {
            sum += el;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(solve(n, a));
    }
}