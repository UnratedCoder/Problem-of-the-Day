import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int userLogic(String s) {
        // Write your logic here
        int dp[] = new int[26];
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            int len1 = (idx >= 2) ? dp[idx - 2] : 0;
            int len2 = (idx <= 23) ? dp[idx + 2] : 0;
            dp[idx] = Math.max(dp[idx], 1 + Math.max(len1, len2));
            maxLen = Math.max(maxLen, dp[idx]);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int maxLength = userLogic(s);
        int result = isPrime(maxLength) ? 1 : 0;
        System.out.println(result);
    }
}
