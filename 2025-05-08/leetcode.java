import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int findMaxK(int[] nums) {
        int k = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int el : nums) {
            if (set.contains(-el)) {
                k = Math.max(k, Math.abs(el));
            } else {
                set.add(el);
            }
        }
        return k == Integer.MIN_VALUE ? -1 : k;
    }
}
