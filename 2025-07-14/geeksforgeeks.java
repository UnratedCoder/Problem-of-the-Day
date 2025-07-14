import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int cuts(String s) {
        // code here
        if (s.charAt(0) == '0')
            return -1;
        int max = s.length() + 1;
        HashSet<Integer> powerOf5 = new HashSet<>();
        int val = 1;
        while (val <= 1_000_000_000) {
            powerOf5.add(val);
            val *= 5;
        }
        int dp[] = new int[s.length() + 1];
        Arrays.fill(dp, max);
        dp[s.length()] = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == '0')
                continue;
            int num = 0;
            for (int j = i; j < s.length(); ++j) {
                num = num * 2 + (s.charAt(j) == '1' ? 1 : 0);
                if (powerOf5.contains(num)) {
                    if (dp[j + 1] != max) {
                        dp[i] = Math.min(dp[i], 1 + dp[j + 1]);
                    }
                }
            }
        }
        return dp[0] >= max ? -1 : dp[0];
    }
}