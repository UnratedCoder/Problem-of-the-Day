public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int longestSubarray(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        int max = 0, count = 0;
        while (j < n) {
            if (nums[j] == 0) {
                count++;
            }
            while (count > 1) {
                if (nums[i] == 0) {
                    count--;
                }
                i++;
            }
            max = Math.max(max, j - i);
            j++;
        }
        return max;
    }
}
