public class hackerrank {

    public static int alternatingCharacters(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                count++;
                i--;
            }
        }
        return count;
    }
}