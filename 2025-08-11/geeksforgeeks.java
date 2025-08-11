import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    class Manacher {
        int[] p;
        String ms;

        public Manacher(String s) {
            StringBuilder sb = new StringBuilder();
            sb.append("@");
            for (char c : s.toCharArray()) {
                sb.append("#").append(c);
            }
            sb.append("#$");
            ms = sb.toString();
            runManacher();
        }

        private void runManacher() {
            int n = ms.length();
            p = new int[n];
            int l = 0, r = 0;
            for (int i = 1; i < n - 1; i++) {
                int mirror = l + r - i;
                if (mirror >= 0 && mirror < n)
                    p[i] = Math.max(0, Math.min(r - i, p[mirror]));
                while (i + p[i] + 1 < n && i - p[i] - 1 >= 0 &&
                        ms.charAt(i + 1 + p[i]) == ms.charAt(i - 1 - p[i])) {
                    p[i]++;
                }
                if (i + p[i] > r) {
                    l = i - p[i];
                    r = i + p[i];
                }
            }
        }

        public int getLongest(int cen, int odd) {
            int pos = 2 * cen + 2 + (odd == 0 ? 1 : 0);
            return p[pos];
        }

        public boolean isPalindrome(int l, int r) {
            int len = r - l + 1;
            return len <= getLongest((l + r) / 2, len % 2);
        }
    }

    public int maxSum(String s) {
        // code here
        int n = s.length();
        int[] leftMark = new int[n];
        int[] rightMark = new int[n];
        Arrays.fill(leftMark, 1);
        Arrays.fill(rightMark, 1);
        Manacher manacher = new Manacher(s);
        for (int i = 0; i < n; i++) {
            int val = manacher.getLongest(i, 1);
            int li = i + val / 2;
            if (li < n)
                leftMark[li] = Math.max(leftMark[li], val);
        }
        for (int i = n - 2; i >= 0; i--) {
            leftMark[i] = Math.max(leftMark[i], leftMark[i + 1] - 2);
        }
        for (int i = 1; i < n; i++) {
            leftMark[i] = Math.max(leftMark[i], leftMark[i - 1]);
        }
        for (int i = n - 1; i >= 0; i--) {
            int val = manacher.getLongest(i, 1);
            int ri = i - val / 2;
            if (ri >= 0)
                rightMark[ri] = Math.max(rightMark[ri], val);
        }
        for (int i = 1; i < n; i++) {
            rightMark[i] = Math.max(rightMark[i], rightMark[i - 1] - 2);
        }
        for (int i = n - 2; i >= 0; i--) {
            rightMark[i] = Math.max(rightMark[i], rightMark[i + 1]);
        }
        int ans = 0;
        for (int i = 0; i + 1 < n; i++) {
            ans = Math.max(ans, leftMark[i] + rightMark[i + 1]);
        }
        return ans;
    }
}