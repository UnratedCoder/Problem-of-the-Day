public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    int getLPSLength(String s) {
        // code here
        int LPS[] = new int[s.length()];
        int len = 0;
        int i = 1;
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(len)) {
                LPS[i] = ++len;
                i++;
            } else {
                if (len != 0) {
                    len = LPS[len - 1];
                } else {
                    LPS[i] = 0;
                    i++;
                }
            }
        }
        return LPS[s.length() - 1];
    }
}