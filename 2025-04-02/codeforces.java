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
            int element = a[0] == a[1] ? a[0] : a[2];
            for (int i = 0; i < n; i++) {
                if (a[i] != element) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        scan.close();
    }
}