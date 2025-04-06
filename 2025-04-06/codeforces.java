import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        System.out.println(Math.max(max, count));
        scan.close();
    }
}