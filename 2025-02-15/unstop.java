import java.util.*;

public class unstop {
    public static int userLogic(int n, int x, int[] arr) {
        // Write your logic here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int sum = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == x) {
                sum += key;
            }
        }
        if (sum == 0) {
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Call user logic function and store the result
            int result = userLogic(N, X, arr);
            System.out.println(result);
        }
        sc.close();
    }
}