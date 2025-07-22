public class leetcode {

    // LeetCode Problem
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += k) {
            String sub = s.substring(i, i + k);
            int sum = 0;
            for (char ch : sub.toCharArray()) {
                sum += ch - 'a';
            }
            int hashChar = sum % 26;
            sb.append((char) ('a' + hashChar));
        }
        return sb.toString();
    }
}
