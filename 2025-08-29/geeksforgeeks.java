public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static String smallestWindow(String s, String p) {
        // code here
        int len1 = s.length();
        int len2 = p.length();
        if (len1 < len2) {
            return "";
        }
        int countP[] = new int[256];
        int countS[] = new int[256];
        for (char ch : p.toCharArray()) {
            countP[ch]++;
        }
        int start = 0, idx = -1, minLen = Integer.MAX_VALUE, count = 0;
        for (int i = 0; i < len1; i++) {
            char ch = s.charAt(i);
            countS[ch]++;
            if (countP[ch] > 0 && countS[ch] <= countP[ch]) {
                count++;
            }
            if (count == len2) {
                char startChar;
                while (countS[startChar = s.charAt(start)] > countP[startChar] || countP[startChar] == 0) {
                    if (countS[startChar] > countP[startChar]) {
                        countS[startChar]--;
                    }
                    start++;
                }
                int len = i - start + 1;
                if (minLen > len) {
                    minLen = len;
                    idx = start;
                }
            }
        }
        if (idx == -1) {
            return "";
        }
        return s.substring(idx, idx + minLen);
    }
}