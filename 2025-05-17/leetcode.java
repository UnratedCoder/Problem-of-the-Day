public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int el : nums) {
            if (el == 0) {
                count0++;
            } else if (el == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int idx = 0;
        while (count0-- > 0) {
            nums[idx++] = 0;
        }
        while (count1-- > 0) {
            nums[idx++] = 1;
        }
        while (count2-- > 0) {
            nums[idx++] = 2;
        }
    }
}
