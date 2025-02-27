public class code360 {

    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}