import java.util.HashMap;

public class leetcode {

    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer value : map.values()) {
            if (value % 2 != 0) {
                max = Math.max(value, max);
            } else {
                min = Math.min(value, min);
            }
        }
        return max - min;
    }
}
