import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int minOperationsToNonNegative(int n, int k, int[] A) {
        // User should implement their logic here
        int flip[] = new int[n];
        int flipCount = 0, flipSoFar = 0;
        for (int i = 0; i < n; i++) {
            if (i >= k) {
                flipSoFar -= flip[i - k];
            }
            int element = A[i];
            if (flipSoFar % 2 != 0) {
                if (element != 0) {
                    element *= -1;
                }
            }
            if (element == -1) {
                if (i + k > n) {
                    return -1;
                }
                flip[i] = 1;
                flipCount++;
                flipSoFar++;
            }
        }
        return flipCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Call the user logic function and print the result
        int result = minOperationsToNonNegative(n, k, A);
        System.out.println(result);
    }
}
