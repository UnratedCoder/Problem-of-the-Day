import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int findPosition(int arr[], int target) {
        int si = 0;
        int ei = arr.length;
        while (si < ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid;
            }
        }
        return si;
    }

    public static void findStudentPositions(int n, int[] heights, int k, int[] queries, int[] results) {
        // Write your logic here.
        for (int i = 0; i < k; i++) {
            results[i] = findPosition(heights, queries[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int[] queries = new int[k];
        for (int i = 0; i < k; i++) {
            queries[i] = scanner.nextInt();
        }
        scanner.close();
        int[] results = new int[k];
        findStudentPositions(n, heights, k, queries, results);
        for (int result : results) {
            System.out.println(result);
        }
    }
}