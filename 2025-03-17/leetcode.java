import java.util.HashMap;

public class leetcode {

    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
