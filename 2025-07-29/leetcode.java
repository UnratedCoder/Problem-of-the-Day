public class leetcode {

    // LeetCode Problem
    public int returnToBoundaryCount(int[] nums) {
        int position = 0;
        int count = 0;
        for (int el : nums) {
            position += el;
            if (position == 0) {
                count++;
            }
        }
        return count;
    }
}
