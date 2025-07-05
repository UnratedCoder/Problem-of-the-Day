public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int findLucky(int[] arr) {
        int freq[] = new int[501];
        for (int el : arr) {
            freq[el]++;
        }
        int max = -1;
        for (int i = 1; i < 501; i++) {
            if (freq[i] == i) {
                max = Math.max(max, i);
            }
        }
        return max;
    }
}
