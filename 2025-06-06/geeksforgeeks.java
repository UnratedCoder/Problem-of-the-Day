import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    ArrayList<Integer> search(String pat, String txt) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();
        if (m > n) {
            return ans;
        }
        int base = 256;
        int mod = 101;
        int textHash = 0;
        int patternHash = 0;
        int h = 1;
        for (int i = 0; i < m - 1; i++) {
            h = (h * base) % mod;
        }
        for (int i = 0; i < m; i++) {
            patternHash = (base * patternHash + pat.charAt(i)) % mod;
            textHash = (base * textHash + txt.charAt(i)) % mod;
        }
        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash) {
                int j;
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        break;
                    }
                }
                if (j == m) {
                    ans.add(i + 1);
                }
            }
            if (i < n - m) {
                textHash = (base * (textHash - txt.charAt(i) * h) + txt.charAt(i + m)) % mod;
                if (textHash < 0) {
                    textHash = (textHash + mod);
                }
            }
        }
        return ans;
    }
}