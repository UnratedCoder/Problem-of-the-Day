public class leetcode {

    // LeetCode Problem
    public String thousandSeparator(int n) {
        if (n >= 0 && n <= 999) {
            return Integer.toString(n);
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (n > 0) {
            count++;
            if (count == 4) {
                sb.append(".");
                count = 0;
            } else {
                sb.append(Integer.toString(n % 10));
                n /= 10;
            }
        }
        return sb.reverse().toString();
    }
}
