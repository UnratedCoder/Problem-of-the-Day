import java.util.*;

public class unstop {
    public static long compute_result(long a, long b) {
        // Write your logic here.
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();
        long result = compute_result(a, b);
        System.out.println(result);
    }
}