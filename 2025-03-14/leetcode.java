public class leetcode {

    public int maxOperations(int[] nums) {
        int operation = 1;
        int sum = nums[0] + nums[1];
        for (int i = 2; i < nums.length; i += 2) {
            if (i + 1 >= nums.length) {
                break;
            } else {
                if (sum == nums[i] + nums[i + 1]) {
                    operation++;
                } else {
                    break;
                }
            }
        }
        return operation;
    }
}
