public class leetcode {

    // LeetCode Contest (Weekly Contest 459)
    public int getSumPlusProd(int n) {
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }
        return sum + prod;
    }

    public boolean checkDivisibility(int n) {
        if (n % getSumPlusProd(n) == 0) {
            return true;
        }
        return false;
    }
}
