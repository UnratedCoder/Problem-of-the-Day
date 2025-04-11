public class leetcode {

    public boolean isSymmetric(int num) {
        String s = Integer.toString(num);
        if (s.length() % 2 != 0) {
            return false;
        }
        int LHS = 0;
        int RHS = 0;
        for (int i = 0; i < s.length(); i++) {
            int currNum = s.charAt(i) - '0';
            if (i < s.length() / 2) {
                LHS += currNum;
            } else {
                RHS += currNum;
            }
        }
        return LHS == RHS;
    }

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            count += isSymmetric(i) ? 1 : 0;
        }
        return count;
    }
}
