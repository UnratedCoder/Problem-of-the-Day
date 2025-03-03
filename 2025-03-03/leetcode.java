public class leetcode {

    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int idx = 0;
        for (int el : nums) {
            if (el < pivot) {
                ans[idx++] = el;
            }
        }
        for (int el : nums) {
            if (el == pivot) {
                ans[idx++] = el;
            }
        }
        for (int el : nums) {
            if (el > pivot) {
                ans[idx++] = el;
            }
        }
        return ans;
    }
}
