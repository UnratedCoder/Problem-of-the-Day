import java.util.*;

public class atcoder {
    // Task A - Approximation
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((int) Math.round(a / (float) b));
    }

    // Task B - P(X or Y)
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        double total = 36;
        int pairs = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j >= x) {
                    pairs++;
                } else if (Math.abs(i - j) >= y) {
                    pairs++;
                }
            }
        }
        System.out.println(pairs / total);
    }
}