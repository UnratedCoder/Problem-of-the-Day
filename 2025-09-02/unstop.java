import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    static final int mod = 998244353;

    static long user_logic(long n) {
        long ans = 0;
        for (long i = 0; i < mod; i++) {
            if ((n - i) % mod == 0) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        // Call user logic function
        long result = user_logic(n);

        // Output the result
        System.out.println(result);
    }
}
