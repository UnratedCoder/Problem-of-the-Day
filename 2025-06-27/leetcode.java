import java.util.*;

public class leetcode {

    // LeetCode Problem
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        } else if (nums.length == 1) {
            return new ArrayList<>(List.of(Integer.toString(nums[0])));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(nums[0]));
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                count++;
            } else {
                if (count != 0) {
                    sb.append("->" + Integer.toString(nums[i - 1]));
                    count = 0;
                }
                result.add(sb.toString());
                sb.setLength(0);
                if (i != nums.length - 1) {
                    sb.append(Integer.toString(nums[i]));
                } else {
                    sb.append(Integer.toString(nums[i]));
                    result.add(sb.toString());
                }
            }
        }
        if (count != 0) {
            sb.append("->" + Integer.toString(nums[nums.length - 1]));
            result.add(sb.toString());
        }
        return result;
    }
}
