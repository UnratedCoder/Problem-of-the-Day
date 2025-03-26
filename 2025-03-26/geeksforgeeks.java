public class geeksforgeeks {

    public boolean wordBreak(String s, String[] dictionary) {
        // code here
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String word : dictionary) {
                int si = i - word.length();
                if (si >= 0 && dp[si] && s.substring(si, si + word.length()).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}