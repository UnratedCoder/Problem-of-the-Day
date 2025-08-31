import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(getTotalXorOfSubarrayXors(arr, N));
    }

    public static int getTotalXorOfSubarrayXors(int[] arr, int N) {
        // User needs to implement this function
        int result = 0;
        for (int i = 0; i < N; i++) {
            long freq = (long) (i + 1) * (N - i);
            if (freq % 2 == 1) {
                result ^= arr[i];
            }
        }
        return result;
    }
}
