import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void userLogic(int n, int q, int[] arr, int[][] queries) {
        // Placeholder for user logic
        for (int i = 0; i < q; i++) {
            int max = 0;
            int si = queries[i][0];
            int mid = queries[i][1];
            int ei = queries[i][2];
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = si; j < mid; j++) {
                sumLeft += arr[j];
            }
            for (int j = mid + 1; j <= ei; j++) {
                sumRight += arr[j];
            }
            max = Math.max(max, sumLeft * sumRight);
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[][] queries = new int[q][3];
        for (int i = 0; i < q; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
        }
        userLogic(n, q, arr, queries);
    }
}