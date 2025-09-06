public class leetcode {

    // LeetCode Problem
    public int minBitFlips(int start, int goal) {
        int result = 0;
        int xor = start ^ goal;
        while (xor != 0) {
            result += xor & 1;
            xor >>= 1;
        }
        return result;
    }
}
