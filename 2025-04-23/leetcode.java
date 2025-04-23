public class leetcode {

    // LeetCode Problem
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0 && t.length() != 0) {
            return true;
        } else if (s.length() != 0 && t.length() == 0) {
            return false;
        }
        int si = 0;
        int ei = s.length() - 1;
        for (int i = 0; i < t.length(); i++) {
            if (si - 1 == ei) {
                break;
            }
            if (t.charAt(i) == s.charAt(si)) {
                si++;
            }
        }
        return si - 1 == ei;
    }
}
