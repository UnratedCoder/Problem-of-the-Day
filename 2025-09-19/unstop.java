import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static long refereeTask(long A, long B) {
        // Write your logic here.
        long count = 0;
        while (A != B) {
            if (A > B) {
                A = A - B;
            } else {
                B = B - A;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long result = refereeTask(A, B);
        System.out.println(result);
    }
}
