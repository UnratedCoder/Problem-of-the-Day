public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public boolean isPowerOfFour(int n) {
        while (n >= 0) {
            if (n == 1) {
                return true;
            } else if (n % 4 != 0 || n == 0) {
                return false;
            }
            n /= 4;
        }
        return false;
    }
}
