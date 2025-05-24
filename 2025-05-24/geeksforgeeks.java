public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public static int sumSubstrings(String s) {
        // code here
        int sum = 0;
        int mf = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += (s.charAt(i) - '0') * (i + 1) * mf;
            mf = mf * 10 + 1;
        }
        return sum;
    }
}