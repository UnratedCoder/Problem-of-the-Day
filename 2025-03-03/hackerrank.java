import java.util.*;

public class hackerrank {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int element = Integer.MAX_VALUE;
        for (Integer key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                element = key;
            } else if (max == map.get(key)) {
                if (element > key) {
                    element = key;
                }
            }
        }
        return element;
    }
}