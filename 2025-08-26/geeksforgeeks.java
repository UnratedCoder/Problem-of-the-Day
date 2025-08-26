public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int n = s1.length(), m = s2.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}