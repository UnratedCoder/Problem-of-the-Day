public class code360 {

	// Problem of the Day (Easy)
	public static boolean isPrime(int n) {
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

	public static boolean isDigitPrime(int n) {
		while (n > 0) {
			int digit = n % 10;
			if (!isPrime(digit)) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

	public static int countMegaPrimeNumber(int left, int right) {
		// Write your code here.
		int count = 0;
		for (int i = left; i <= right; i++) {
			if (isPrime(i) && isDigitPrime(i)) {
				count++;
			}
		}
		return count;
	}
}