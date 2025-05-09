public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public void match(String curr, StringBuilder ans) {
        if (curr.compareTo(ans.toString()) > 0) {
            ans.replace(0, ans.length(), curr);
        }
    }

    public void setDigit(StringBuilder s, int idx, StringBuilder ans, int k) {
        if (k == 0 || idx == s.length() - 1) {
            match(s.toString(), ans);
            return;
        }
        int maxDigit = 0;
        for (int i = idx; i < s.length(); i++) {
            maxDigit = Math.max(maxDigit, s.charAt(i) - '0');
        }
        if (s.charAt(idx) - '0' == maxDigit) {
            setDigit(s, idx + 1, ans, k);
            return;
        }
        for (int i = idx + 1; i < s.length(); i++) {
            if (s.charAt(i) - '0' == maxDigit) {
                char temp = s.charAt(idx);
                s.setCharAt(idx, s.charAt(i));
                s.setCharAt(i, temp);
                setDigit(s, idx + 1, ans, k - 1);
                s.setCharAt(i, s.charAt(idx));
                s.setCharAt(idx, temp);
            }
        }
    }

    public String findMaximumNum(String s, int k) {
        // code here.
        StringBuilder sb = new StringBuilder(s);
        setDigit(new StringBuilder(s), 0, sb, k);
        return sb.toString();
    }
}