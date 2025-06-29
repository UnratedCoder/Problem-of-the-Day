public class leetcode {

    // LeetCode Problem
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    if (isPrime(i) && i >= 7) {
                        return false;
                    }
                } else {
                    if (isPrime(i) && i >= 7) {
                        return false;
                    }
                    if (isPrime(n / i) && n / i >= 7) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
