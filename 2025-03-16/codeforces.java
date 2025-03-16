import java.util.Scanner;

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
            int maxLen = 0;
            int prev = -1;
            int count = 0;
            for (int el : a) {
                if (prev == -1 && el == 0) {
                    count++;
                    prev = 0;
                } else if (prev == 0 && el == 0) {
                    count++;
                } else {
                    maxLen = Math.max(maxLen, count);
                    prev = -1;
                    count = 0;
                }
            }
            maxLen = Math.max(maxLen, count);
            System.out.println(maxLen);
        }
        scan.close();
    }
}