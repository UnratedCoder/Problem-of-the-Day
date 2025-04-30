public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public boolean evenDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count % 2 == 0;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int el : nums) {
            count += evenDigit(el) ? 1 : 0;
        }
        return count;
    }
}
