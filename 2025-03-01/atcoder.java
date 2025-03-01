import java.util.Scanner;

public class atcoder {

    // AtCoder Beginner Contest 395

    // Task A - Strictly Increasing?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < n - 1; i++) {
            if (a[i] >= a[i + 1]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}