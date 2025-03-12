import java.util.*;

public class unstop {

    public static int smallestMaxDifference(int[] arr, int k) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                min = Math.min(arr[j], min);
                max = Math.max(arr[j], max);
            }
            small = Math.min(small, max - min);
        }
        return small;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        scanner.close();
        int result = smallestMaxDifference(arr, k);
        System.out.println(result);
    }
}