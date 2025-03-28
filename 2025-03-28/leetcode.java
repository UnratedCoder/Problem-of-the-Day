import java.util.*;

public class leetcode {

    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int si = 0;
        int ei = nums.length - 1;
        HashSet<Double> set = new HashSet<>();
        while (si < ei) {
            int min = nums[si];
            int max = nums[ei];
            set.add((min + max) / 2.0);
            si++;
            ei--;
        }
        return set.size();
    }
}
