public class code360 {

	// Problem of the Day (Easy)
	public static int largestPrimeFactor(int n) {
		// Write your code here.
		if (n <= 1) {
			return -1;
		}
		int maxPrime = -1;
		while (n % 2 == 0) {
			maxPrime = 2;
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				maxPrime = i;
				n /= i;
			}
		}
		if (n > 2) {
			maxPrime = n;
		}
		return maxPrime;
	}
}