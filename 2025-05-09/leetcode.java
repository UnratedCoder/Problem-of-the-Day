import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : nums) {
            if (el % 2 == 0) {
                map.put(el, map.getOrDefault(el, 0) + 1);
            }
        }
        if (map.size() == 0) {
            return -1;
        }
        int mostFreq = 0;
        int max = Integer.MIN_VALUE;
        for (Integer key : map.keySet()) {
            if (max < map.get(key)) {
                mostFreq = key;
                max = map.get(key);
            } else if (max == map.get(key)) {
                mostFreq = Math.min(mostFreq, key);
            }
        }
        return mostFreq;
    }
}
