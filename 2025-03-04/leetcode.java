public class leetcode {

    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            int remainder = n % 3;
            if (remainder % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
