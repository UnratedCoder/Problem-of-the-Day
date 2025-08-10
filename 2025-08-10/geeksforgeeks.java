public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int countPS(String s) {
        // code here
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < n) {
                if (s.charAt(left) == s.charAt(right)) {
                    count++;
                } else {
                    break;
                }
                left--;
                right++;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i + 1;
            while (left >= 0 && right < n) {
                if (s.charAt(left) == s.charAt(right)) {
                    count++;
                } else {
                    break;
                }
                left--;
                right++;
            }
        }
        return count;
    }
}