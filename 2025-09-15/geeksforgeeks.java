public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean stringStack(String pat, String tar) {
        // code here
        int i = pat.length() - 1, j = tar.length() - 1;
        while (i >= 0 && j >= 0) {
            if (pat.charAt(i) != tar.charAt(j)) {
                i -= 2;
            } else {
                i--;
                j--;
            }
        }
        return j < 0;
    }
}