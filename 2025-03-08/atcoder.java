import java.util.Scanner;
import java.util.Stack;

public class atcoder {

    // AtCoder Beginner Contest 396

    // Task A - Triple Four
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        boolean isAppear = false;
        for (int i = 0; i <= n - 2; i++) {
            if (a[i] == a[i + 1] && a[i] == a[i + 2]) {
                isAppear = true;
                break;
            }
        }
        if (isAppear) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Task B - Card Pile
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < q; i++) {
            int type = scan.nextInt();
            if (type == 1) {
                s.push(scan.nextInt());
            } else {
                if (s.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(s.pop());
                }
            }
        }
        scan.close();
    }
}