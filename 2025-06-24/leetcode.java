import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int triangularSum(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int el : nums) {
            list.add(el);
        }
        int i = nums.length;
        while (i-- > 1) {
            for (int j = 0; j < list.size() - 1; j++) {
                list.set(j, (list.get(j) + list.get(j + 1)) % 10);
            }
            list.remove(list.size() - 1);
        }
        return list.get(0);
    }
}
