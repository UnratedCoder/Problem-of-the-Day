public class geeksforgeeks {

    public int countWays(String digits) {
        // code here
        if (digits.length() == 0 || digits.charAt(0) == '0') {
            return 0;
        }
        int prev1 = 1;
        int prev2 = 0;
        for (int i = 1; i <= digits.length(); ++i) {
            int curr = 0;
            if (digits.charAt(i - 1) != '0') {
                curr += prev1;
            }
            if (i > 1) {
                int digit = (digits.charAt(i - 2) - '0') * 10 + (digits.charAt(i - 1) - '0');
                if (digit >= 10 && digit <= 26) {
                    curr += prev2;
                }
            }
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}