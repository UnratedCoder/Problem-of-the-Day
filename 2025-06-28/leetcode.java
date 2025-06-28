import java.util.*;

public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int[] maxSubsequence(int[] nums, int k) {
        int pairs[][] = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        int topK[][] = Arrays.copyOfRange(pairs, 0, k);
        Arrays.sort(topK, (a, b) -> Integer.compare(a[1], b[1]));
        int result[] = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK[i][0];
        }
        return result;
    }
}
