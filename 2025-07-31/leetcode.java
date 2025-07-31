public class leetcode {

    // LeetCode Problem
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String el : strs) {
            int num = 0;
            try {
                num = Integer.parseInt(el);
            } catch (Exception e) {
                num = el.length();
            }
            max = Math.max(max, num);
        }
        return max;
    }
}
