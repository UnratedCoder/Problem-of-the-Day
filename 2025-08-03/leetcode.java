public class leetcode {

    // LeetCode Problem
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char ch : columnTitle.toCharArray()) {
            int val = ch - 'A' + 1;
            result = result * 26 + val;
        }
        return result;
    }
}
