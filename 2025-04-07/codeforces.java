import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int k = scan.nextInt();
            int ans[] = new int[k];
            int idx = 0;
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (idx == k) {
                    break;
                } else if (i % 3 != 0 && i % 10 != 3) {
                    ans[idx++] = i;
                }
            }
            System.out.println(ans[k - 1]);
        }
        scan.close();
    }
}