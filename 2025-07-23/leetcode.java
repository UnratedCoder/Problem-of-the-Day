public class leetcode {

    // LeetCode Problem
    public boolean isGood(int[] nums) {
        int freq[] = new int[201];
        int max = -1;
        for (int el : nums) {
            freq[el]++;
            max = Math.max(max, el);
        }
        if (nums.length > max + 1) {
            return false;
        }
        for (int i = 1; i <= max; i++) {
            if ((i == max && freq[max] != 2) || i != max && freq[i] != 1) {
                return false;
            }
        }
        return true;
    }
}
