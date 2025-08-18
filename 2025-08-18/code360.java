public class code360 {

	// Coding Interview Questions
	public static boolean isPowerOfTwo(int n) {
		// Write your code here.
		if (n <= 0) {
			return false;
		}
		while (n % 2 == 0) {
			n /= 2;
		}
		return n == 1;
	}
}