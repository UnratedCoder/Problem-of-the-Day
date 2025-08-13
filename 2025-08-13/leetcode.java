public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1 ? true : false;
    }
}
