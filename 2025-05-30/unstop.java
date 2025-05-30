import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int countBalancedSubarrays(int[] arr, int k) {
        // Write your logic here.
        int count = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int startSum = 0;
            int endSum = 0;
            for (int j = 0; j < k / 2; j++) {
                startSum += arr[i + j];
                endSum += arr[i + k - 1 - j];
            }
            if (startSum == endSum) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int result = countBalancedSubarrays(arr, k);
        System.out.println(result);
    }
}