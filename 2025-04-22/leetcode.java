public class leetcode {

    // LeetCode Problem
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int prev = nums[0];
        int maxLen = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prev) {
                count++;
            } else {
                maxLen = Math.max(maxLen, count);
                count = 1;
            }
            prev = nums[i];
        }
        return Math.max(maxLen, count);
    }
}
