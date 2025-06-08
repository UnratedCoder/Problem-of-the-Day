public class leetcode {

    // LeetCode Problem
    public int[] constructTransformedArray(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = nums[i];
            } else {
                int idx = (i + nums[i]) % nums.length;
                if (idx < 0) {
                    idx += nums.length;
                }
                result[i] = nums[idx];
            }
        }
        return result;
    }
}
