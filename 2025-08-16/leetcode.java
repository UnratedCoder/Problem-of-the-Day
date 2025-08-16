public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public int maximum69Number(int num) {
        String n = String.valueOf(num);
        int count = 0, result = 0;
        for (char ch : n.toCharArray()) {
            if (ch == '6' && count == 0) {
                result = result * 10 + 9;
                count++;
            } else {
                result = result * 10 + ch - '0';
            }
        }
        return result;
    }
}
