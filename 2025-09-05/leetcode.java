public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int makeTheIntegerZero(int num1, int num2) {
        for (int i = 1; i < 61; i++) {
            long num = 1L * num1 - 1L * num2 * i;
            if (num < i) {
                return -1;
            }
            if (i >= Long.bitCount(num)) {
                return i;
            }
        }
        return -1;
    }
}
