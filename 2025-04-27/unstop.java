import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static List<Integer> find_tallest(int N, int K, List<Integer> height) {
        List<Integer> result = new ArrayList<>();
        // Write your logic here.
        for (int i = 0; i <= N - K; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + K; j++) {
                max = Math.max(max, height.get(j));
            }
            result.add(max);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            height.add(sc.nextInt());
        }
        sc.close();
        List<Integer> result = find_tallest(N, K, height);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}