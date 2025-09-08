public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public boolean isZero(int a) {
        while (a > 0) {
            int lastDigit = a % 10;
            if (lastDigit == 0) {
                return false;
            }
            a /= 10;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {
        int ans[] = new int[2];
        for (int i = 1; i <= n; i++) {
            if ((isZero(i) && isZero(n - i)) && (i + n - i == n)) {
                ans[0] = i;
                ans[1] = n - i;
                break;
            }
        }
        return ans;
    }
}
