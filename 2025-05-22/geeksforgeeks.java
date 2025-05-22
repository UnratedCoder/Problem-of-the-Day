import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    static int longestPalindromeSubseq(String s) {
        int prev[] = new int[s.length()];
        int curr[] = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; --i) {
            curr[i] = 1;
            for (int j = i + 1; j < s.length(); ++j) {
                if (s.charAt(i) == s.charAt(j)) {
                    curr[j] = prev[j - 1] + 2;
                } else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }
            prev = Arrays.copyOf(curr, s.length());
        }
        return curr[s.length() - 1];
    }

    static int minDeletions(String s) {
        // code here
        int lps = longestPalindromeSubseq(s);
        return s.length() - lps;
    }
}