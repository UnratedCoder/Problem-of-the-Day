public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int minParentheses(String s) {
        // code here
        int match = 0, unmatch = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                match++;
            } else if (ch == ')') {
                match--;
                if (match < 0) {
                    unmatch++;
                    match = 0;
                }
            }
        }
        return match + unmatch;
    }
}