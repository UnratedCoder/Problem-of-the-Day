public class leetcode {

    public String largestOddNumber(String num) {
        int total = num.length();
        for (int i = num.length() - 1; i >= 0; i--) {
            int ch = num.charAt(i) - '0';
            if (ch % 2 != 0) {
                return num.substring(0, total);
            } else {
                total--;
            }
        }
        return "";
    }
}
