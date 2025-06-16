public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min < nums[i]) {
                maxDiff = Math.max(maxDiff, nums[i] - min);
            } else {
                min = nums[i];
            }
        }
        return maxDiff;
    }
}
