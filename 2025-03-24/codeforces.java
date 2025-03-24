import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.print(b[i] + " " + b[n - i - 1] + " ");
            }
            if (n % 2 != 0) {
                System.out.print(b[n / 2]);
            }
            System.out.println();
        }
        scan.close();
    }
}