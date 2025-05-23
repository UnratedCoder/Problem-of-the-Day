public class leetcode {

    // LeetCode Problem
    public int[] replaceElements(int[] arr) {
        int maxRight = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, curr);
        }
        return arr;
    }
}
