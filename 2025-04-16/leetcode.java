public class leetcode {

    // LeetCode Problem
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                count += i % (j * k) == 0 ? 1 : 0;
            }
        }
        return count;
    }
}
