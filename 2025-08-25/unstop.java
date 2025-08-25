import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int user_logic(int N, int K) {
        // Write your logic here.
        final int MOD = 998244353;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        for (int i = 0; i < K; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                if ((j + 1) % 3 != 1) {
                    temp.add(list.get(j));
                }
            }
            list = temp;
            if (list.isEmpty()) {
                break;
            }
        }
        long sum = 0;
        for (int el : list) {
            sum = (sum + el) % MOD;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int result = user_logic(N, K);
        System.out.println(result);
    }
}
