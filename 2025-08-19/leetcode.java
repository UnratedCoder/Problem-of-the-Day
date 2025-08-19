public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public long zeroFilledSubarray(int[] nums) {
        long count = 0, streak = 0;
        for (int el : nums) {
            streak = (el == 0) ? streak + 1 : 0;
            count += streak;
        }
        return count;
    }
}
