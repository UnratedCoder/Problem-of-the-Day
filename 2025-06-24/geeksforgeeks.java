public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static String maxSubseq(String s, int k) {
        // code here
        int deleteUpto = k;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            while (sb.length() > 0 && deleteUpto > 0 && sb.charAt(sb.length() - 1) < s.charAt(i)) {
                sb.deleteCharAt(sb.length() - 1);
                deleteUpto--;
            }
            sb.append(s.charAt(i));
        }
        return sb.substring(0, s.length() - k);
    }
}