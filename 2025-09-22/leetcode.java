import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
            max = Math.max(max, map.get(el));
        }
        int count = 0;
        for (Integer value : map.values()) {
            count += value == max ? value : 0;
        }
        return count;
    }
}