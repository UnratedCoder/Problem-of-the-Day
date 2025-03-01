public class leetcode {

    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = 2 * nums[i];
                nums[i + 1] = 0;
            }
        }
        int newArr[] = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArr[idx++] = nums[i];
            }
        }
        return newArr;
    }

    // Biweekly Contest 151
    public int[] transformArray(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
                count++;
            } else {
                nums[i] = 1;
            }
        }
        for (int i = 0; i < count; i++) {
            nums[i] = 0;
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 1;
        }
        return nums;
    }
}
