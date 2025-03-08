public class geeksforgeeks {

    static String longestPalindrome(String s) {
        // code here
        if (s.length() == 0) {
            return "";
        }
        int si = 0;
        int len = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= 1; j++) {
                int low = i;
                int high = i + j;
                while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                    int currL = high - low + 1;
                    if (currL > len) {
                        si = low;
                        len = currL;
                    }
                    low--;
                    high++;
                }
            }
        }
        return s.substring(si, si + len);
    }
}