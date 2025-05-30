public class leetcode {

    // LeetCode Problem
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLen = -1;
        for (int i = 0; i < s.length(); i++) {
            int si = s.indexOf(s.charAt(i));
            int ei = s.lastIndexOf(s.charAt(i));
            if (si != -1 || ei != -1) {
                maxLen = Math.max(maxLen, ei - si - 1);
            }
        }
        return maxLen;
    }
}
