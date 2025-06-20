import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == nums.length / 2) {
                return key;
            }
        }
        return -1;
    }
}
