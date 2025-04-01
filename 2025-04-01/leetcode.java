import java.util.*;;

public class leetcode {

    public int minNumber(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int min1 = Integer.MAX_VALUE;
        for (int el : nums1) {
            min1 = Math.min(el, min1);
            set.add(el);
        }
        int min2 = Integer.MAX_VALUE;
        int contain = Integer.MAX_VALUE;
        for (int el : nums2) {
            if (set.contains(el)) {
                contain = Math.min(contain, el);
            } else {
                min2 = Math.min(min2, el);
            }
        }
        if (contain <= 9) {
            return contain;
        }
        return min1 < min2 ? min1 * 10 + min2 : min2 * 10 + min1;
    }
}
