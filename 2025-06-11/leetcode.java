public class leetcode {

    // LeetCode Problem
    public int maxDepth(String s) {
        int maxDepth = Integer.MIN_VALUE;
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            maxDepth = Math.max(maxDepth, count);
        }
        return maxDepth;
    }
}
