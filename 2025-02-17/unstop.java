import java.util.*;

public class unstop {
    public static int minimumOperationsToMakeElementsSame(int n, int[] arr) {
        // Write your logic here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int largest = Integer.MIN_VALUE;
        for (Integer val : map.values()) {
            largest = Math.max(largest, val);
        }
        return n - largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<Integer> results = new ArrayList<>();
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int result = minimumOperationsToMakeElementsSame(n, arr);
            results.add(result);
        }
        for (int result : results) {
            System.out.println(result);
        }
        scanner.close();
    }
}