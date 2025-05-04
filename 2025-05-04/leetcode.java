public class leetcode {

    // LeetCode Contest - Weekly Contest 448
    public int getMaxDigit(int n) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        while (n > 0) {
            int remainder = n % 10;
            if (max <= remainder) {
                secMax = max;
                max = remainder;
            } else if (max >= remainder && secMax < remainder) {
                secMax = remainder;
            }
            n /= 10;
        }
        return max * secMax;
    }

    public int maxProduct(int n) {
        return getMaxDigit(n);
    }
}
