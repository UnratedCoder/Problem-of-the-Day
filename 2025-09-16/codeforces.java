import java.util.*;

public class codeforces {

    // CodeForces Problem
    static Map<Long, Long> memo = new HashMap<>();

    public static long maxCoins(long n) {
        if (n <= 3)
            return 1;
        if (memo.containsKey(n))
            return memo.get(n);
        long res = 2 * maxCoins(n / 4);
        memo.put(n, res);
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long n = scan.nextLong();
            System.out.println(maxCoins(n));
        }
    }
}