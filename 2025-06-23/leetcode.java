import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int el : nums) {
            if (el != 0) {
                set.add(el);
            }
        }
        return set.size();
    }
}
