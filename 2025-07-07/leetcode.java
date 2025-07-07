import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int findCenter(int[][] edges) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            map.put(edges[i][0], map.getOrDefault(edges[i][0], 0) + 1);
            map.put(edges[i][1], map.getOrDefault(edges[i][1], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
            if (max <= map.get(key)) {
                result = key;
                max = map.get(key);
            }
        }
        return result;
    }
}
