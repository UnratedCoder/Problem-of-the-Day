public class leetcode {

    // LeetCode Problem
    public boolean kLengthApart(int[] nums, int k) {
        int si = -1;
        int ei = -1;
        int prev = -1;
        for (int i = 0; i < nums.length; i++) {
            if (si == -1 && nums[i] == 1) {
                si = i;
            } else if (si != -1 && nums[i] == 1) {
                ei = i;
                if (ei - si - 1 < k) {
                    return false;
                } else {
                    si = i;
                    ei = -1;
                }
            }
        }
        return true;
    }
}
