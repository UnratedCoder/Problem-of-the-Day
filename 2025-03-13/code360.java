public class code360 {

	// Beginners 7 Day Challenge - 5 (Day 3)
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

	public static boolean checkPrimeAdjacent(int n) {
		// Write your code here.
		return isPrime(n - 1) && isPrime(n + 1);
	}

	// Month of Code Challenge - 1 (Day 1)
	static String decodeString(String s) {
		// Write your code here.
		StringBuilder sb = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (ch == 'z') {
				sb.append('a');
			} else {
				sb.append(++ch);
			}
		}
		return sb.toString();
	}
}