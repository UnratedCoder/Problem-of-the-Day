public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public String triangleType(int[] nums) {
        if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]) {
            if (nums[0] == nums[1] && nums[0] == nums[2]) {
                return "equilateral";
            } else if (((nums[0] == nums[1] && nums[0] != nums[2]) || (nums[0] == nums[2] && nums[0] != nums[1])
                    || (nums[1] == nums[2] && nums[1] != nums[0]))) {
                return "isosceles";
            } else {
                return "scalene";
            }
        }
        return "none";
    }
}
