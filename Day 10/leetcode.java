public class leetcode {

    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i <= sb.length() - 3; i++) {
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i + 1);
            char ch3 = sb.charAt(i + 2);
            if (ch1 == ch2 && ch1 == ch3) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}
