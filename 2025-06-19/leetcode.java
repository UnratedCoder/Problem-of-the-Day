public class leetcode {

    // LeetCode Problem
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != '-') {
                sb.append(Character.toUpperCase(ch));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (i > 0 && i % k == 0) {
                ans.append('-');
            }
            ans.append(sb.charAt(sb.length() - 1 - i));
        }
        return ans.reverse().toString();
    }
}
