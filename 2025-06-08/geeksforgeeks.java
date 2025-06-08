public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public String addStrings(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int lenA = a.length();
        int lenB = b.length();
        String sum = "";
        int carry = 0;
        for (int i = 0; i < lenB; i++) {
            int d1 = a.charAt(lenA - 1 - i) - '0';
            int d2 = b.charAt(lenB - 1 - i) - '0';
            int digit = (d1 + d2 + carry) % 10;
            carry = (d1 + d2 + carry) / 10;
            sum = (char) (digit + '0') + sum;
        }
        for (int i = lenB; i < lenA; i++) {
            int d = a.charAt(lenA - 1 - i) - '0';
            int digit = (d + carry) % 10;
            carry = (d + carry) / 10;
            sum = (char) (digit + '0') + sum;
        }
        if (carry > 0) {
            sum = (char) (carry + '0') + sum;
        }
        return sum;
    }

    public boolean checkSequence(String s, int si, int lenA, int lenB) {
        String part1 = s.substring(si, si + lenA);
        String part2 = s.substring(si + lenA, si + lenA + lenB);
        if ((part1.length() > 1 && part1.charAt(0) == '0') || (part2.length() > 1 && part2.charAt(0) == '0')) {
            return false;
        }
        String expectedSum = addStrings(part1, part2);
        int sumLen = expectedSum.length();
        if (si + lenA + lenB + sumLen > s.length()) {
            return false;
        }
        String part3 = s.substring(si + lenA + lenB, si + lenA + lenB + sumLen);
        if (part3.length() > 1 && part3.charAt(0) == '0') {
            return false;
        }
        if (expectedSum.equals(part3)) {
            if (si + lenA + lenB + sumLen == s.length()) {
                return true;
            }
            return checkSequence(s, si + lenA, lenB, sumLen);
        }
        return false;
    }

    public boolean isSumString(String s) {
        // code here
        int n = s.length();
        for (int i = 1; i < n; i++) {
            for (int j = 1; i + j < n; j++) {
                if (checkSequence(s, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
}