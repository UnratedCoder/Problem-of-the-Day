public class leetcode {

    // LeetCode Problem
    public int[] evenOddBit(int n) {
        int even = 0, odd = 0, turn = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                if (turn % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            turn++;
            n /= 2;
        }
        return new int[] { even, odd };
    }
}
