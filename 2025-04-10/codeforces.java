import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int x = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n - k; i++) {
            sum += a[i];
        }
        sum += k * x;
        System.out.println(sum);
        scan.close();
    }
}