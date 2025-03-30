import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            boolean isMelody = true;
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(a[i] - a[i + 1]) != 5 && Math.abs(a[i] - a[i + 1]) != 7) {
                    isMelody = false;
                    break;
                }
            }
            if (isMelody) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}