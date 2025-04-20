import java.util.*;

public class leetcode {

    // LeetCode Problem
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            int freq = nums[i];
            int value = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                list.add(value);
            }
        }
        int ans[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
