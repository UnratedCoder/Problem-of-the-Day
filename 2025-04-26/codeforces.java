import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            int diff = Math.abs(a[i] - 0);
            min = Math.min(diff, min);
        }
        System.out.println(min);
        scan.close();
    }
}