public class leetcode {

    // LeetCode Problem (Problem of the Day)
    public String[] divideString(String s, int k, char fill) {
        int len = s.length() % k == 0 ? s.length() / k : s.length() / k + 1;
        String[] result = new String[len];
        int count = 0;
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            count++;
            sb.append(ch);
            if (count == k) {
                result[idx++] = sb.toString();
                count = 0;
                sb.setLength(0);
            }
        }
        if (sb.length() != 0) {
            len = k - sb.length();
            for (int i = 0; i < len; i++) {
                sb.append(fill);
            }
            result[result.length - 1] = sb.toString();
        }
        return result;
    }
}
