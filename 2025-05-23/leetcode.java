public class leetcode {

    // LeetCode Problem
    public String largestGoodInteger(String num) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= num.length() - 3; i++) {
            String sub = num.substring(i, i + 3);
            if (sub.charAt(0) == sub.charAt(1) && sub.charAt(0) == sub.charAt(2)) {
                ans = Math.max(ans, Integer.parseInt(sub));
            }
        }
        return ans == Integer.MIN_VALUE ? "" : ans == 0 ? "000" : Integer.toString(ans);
    }
}
