import java.util.HashMap;

public class leetcode {

    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int xor = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == 2) {
                xor ^= key;
            }
        }
        return xor;
    }
}
