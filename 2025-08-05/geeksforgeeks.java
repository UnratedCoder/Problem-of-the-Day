public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean isPalinSent(String s) {
        // code here
        int si = 0, ei = s.length() - 1;
        while (si < ei) {
            if (!Character.isLetterOrDigit(s.charAt(si))) {
                si++;
            } else if (!Character.isLetterOrDigit(s.charAt(ei))) {
                ei--;
            } else if (Character.toLowerCase(s.charAt(si)) == Character.toLowerCase(s.charAt(ei))) {
                ei--;
                si++;
            } else {
                return false;
            }
        }
        return true;
    }
}