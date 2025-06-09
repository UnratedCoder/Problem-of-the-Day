public class leetcode {

    // LeetCode Problem
    public int minStartValue(int[] nums) {
        int minValue = nums[0];
        int pref[] = new int[nums.length];
        pref[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i];
            minValue = Math.min(minValue, pref[i]);
        }
        if (minValue <= 0) {
            return -minValue + 1;
        } else {
            return 1;
        }
    }
}
