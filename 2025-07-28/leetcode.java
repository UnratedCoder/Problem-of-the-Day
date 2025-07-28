import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int minOperations(List<Integer> nums, int k) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>(k);
        for (int i = nums.size() - 1; i >= 0; i--) {
            count++;
            if (nums.get(i) >= 1 && nums.get(i) <= k) {
                set.add(nums.get(i));
            }
            if (set.size() == k) {
                break;
            }
        }
        return count;
    }
}
