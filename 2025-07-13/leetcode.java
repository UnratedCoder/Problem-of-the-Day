public class leetcode {

    // LeetCode Contest (Weekly Contest 458)
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                sb.append(ch);
            } else if (ch == '#') {
                sb.append(sb);
            } else if (ch == '*' && sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.reverse();
            }
        }
        return sb.toString();
    }
}
