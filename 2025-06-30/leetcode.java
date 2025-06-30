import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
            min = Math.min(min, el);
            max = Math.max(max, el);
        }
        if (map.size() == 1) {
            return 0;
        } else if (max - min == 1) {
            return nums.length;
        }
        int maxLen = 0;
        for (Integer key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                maxLen = Math.max(maxLen, map.get(key + 1) + map.get(key));
            }
        }
        return maxLen;
    }
}
