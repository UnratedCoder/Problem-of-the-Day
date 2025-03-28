import java.util.*;

public class unstop {
    public static String determine_winner(int a, int b, int c, int d) {
        // Write your logic here.
        // Return "N" if Ben is the final winner, "S" if Smith is the final winner
        if (b > a) {
            a += c;
            if (b > a) {
                a += d;
                return b > a ? "S" : "N";
            } else {
                b += d;
                return b > a ? "S" : "N";
            }
        } else {
            b += c;
            if (b > a) {
                a += d;
                return b > a ? "S" : "N";
            } else {
                b += d;
                return b > a ? "S" : "N";
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            String result = determine_winner(a, b, c, d);
            System.out.println(result);
        }
        scanner.close();
    }
}