public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 0; i <= nums.length - 3; i++) {
            if ((float) (nums[i] + nums[i + 2]) == (float) nums[i + 1] / 2) {
                count++;
            }
        }
        return count;
    }
}
