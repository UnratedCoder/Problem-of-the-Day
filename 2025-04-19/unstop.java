import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int calculateWishValuesSum(int N, int[] A) {
        // Write your logic here.
        int min[] = new int[N];
        min[0] = A[0];
        for (int i = 1; i < N; i++) {
            min[i] = Math.min(A[i], min[i - 1]);
        }
        int max[] = new int[N];
        max[N - 1] = A[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            max[i] = Math.max(A[i], max[i + 1]);
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Math.abs(max[i] - min[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();
        int result = calculateWishValuesSum(N, A);
        System.out.println(result);
    }
}