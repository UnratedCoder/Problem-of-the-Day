public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public String multiplyStrings(String s1, String s2) {
        // code here.
        int n = s1.length();
        int m = s2.length();
        if (n == 0 || m == 0) {
            return "0";
        }
        int nn = 1;
        int mm = 1;
        if (s1.charAt(0) == '-') {
            nn = -1;
        }
        if (s2.charAt(0) == '-') {
            mm = -1;
        }
        int isNeg = nn * mm;
        int ans[] = new int[n + m];
        int i1 = 0;
        int i2 = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s1.charAt(i) == '-') {
                continue;
            }
            int carry = 0;
            int nDigit = s1.charAt(i) - '0';
            i2 = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (s2.charAt(j) == '-') {
                    continue;
                }
                int mDigit = s2.charAt(j) - '0';
                int sum = nDigit * mDigit + ans[i1 + i2] + carry;
                carry = sum / 10;
                ans[i1 + i2] = sum % 10;
                i2++;
            }
            if (carry > 0) {
                ans[i1 + i2] += carry;
            }
            i1++;
        }
        int i = ans.length - 1;
        while (i >= 0 && ans[i] == 0) {
            i--;
        }
        if (i == -1) {
            return "0";
        }
        String s = "";
        while (i >= 0) {
            s += Integer.toString(ans[i--]);
        }
        if (isNeg == -1) {
            s = "-" + s;
        }
        return s;
    }
}