import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean validgroup(int[] arr, int k) {
        // code here
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int el : arr) {
            treeMap.put(el, treeMap.getOrDefault(el, 0) + 1);
        }
        for (var keys : treeMap.entrySet()) {
            int key = keys.getKey();
            int f = keys.getValue();
            if (f == 0) {
                continue;
            }
            for (int i = 1; i < k; i++) {
                int val = key + i;
                int freq = treeMap.getOrDefault(val, 0);
                if (freq < f) {
                    return false;
                }
                treeMap.put(val, freq - f);
            }
        }
        return true;
    }
}