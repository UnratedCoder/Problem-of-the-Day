public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public boolean divby13(String s) {
        // code here
        int remainder = 0;
        for (char ch : s.toCharArray()) {
            remainder = (remainder * 10 + ch - '0') % 13;
        }
        return remainder == 0;
    }
}