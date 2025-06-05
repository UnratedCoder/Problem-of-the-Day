import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void userLogic(int n, int[] arr, int[] result, int test) {
        // Write your logic here.
        int max = -1;
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > min) {
                max = Math.max(max, arr[i] - min);
            }
            min = Math.min(arr[i], min);
        }
        result[test] = max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] results = new int[T];

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            userLogic(N, arr, results, t);
        }
        sc.close();
        for (int result : results) {
            System.out.println(result);
        }
    }
}