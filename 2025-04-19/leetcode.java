public class leetcode {

    // LeetCode Problem
    public boolean hasAlternatingBits(int n) {
        String bit = Integer.toBinaryString(n);
        for (int i = 0; i < bit.length() - 1; i++) {
            if (bit.charAt(i) == bit.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
