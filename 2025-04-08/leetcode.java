import java.util.*;

public class leetcode {

    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while (true) {
            boolean isDistinct = true;
            set.clear();
            for (int num : nums) {
                if (!set.add(num)) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                break;
            }
            if (nums.length <= 3) {
                nums = new int[0];
            } else {
                int[] newArray = new int[nums.length - 3];
                System.arraycopy(nums, 3, newArray, 0, nums.length - 3);
                nums = newArray;
            }
            count++;
        }
        return count;
    }
}
