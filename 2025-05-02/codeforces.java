import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            a[i] = el;
            if (el % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even > odd) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    System.out.println(i + 1);
                    return;
                }
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        scan.close();
    }
}