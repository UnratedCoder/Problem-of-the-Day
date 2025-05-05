import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int freq = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 4) {
                freq = key;
                break;
            }
        }
        return freq;
    }
}
