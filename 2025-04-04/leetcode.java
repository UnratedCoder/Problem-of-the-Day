public class leetcode {

    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf("AB") != -1 || sb.indexOf("CD") != -1) {
            int idx1 = sb.indexOf("AB");
            if (idx1 != -1) {
                sb.delete(idx1, idx1 + 2);
            }
            int idx2 = sb.indexOf("CD");
            if (idx2 != -1) {
                sb.delete(idx2, idx2 + 2);
            }
        }
        return sb.length();
    }
}
