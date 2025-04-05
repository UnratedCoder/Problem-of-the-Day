import java.util.*;

public class atcoder {

    // Task A - ABC400 Party
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        if (400 % a == 0) {
            System.out.println(400 / a);
        } else {
            System.out.println(-1);
        }
    }

    // Task B - Sum of Geometric Series
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long sum = 0;
        scan.close();
        for (int i = 0; i <= m; i++) {
            sum += Math.pow(n, i);
        }
        if (sum > 1000000000) {
            System.out.println("inf");
        } else {
            System.out.println(sum);
        }
    }
}