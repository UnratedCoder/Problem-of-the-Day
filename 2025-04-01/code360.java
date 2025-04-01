public class code360 {

	// 6-Month Code Marathon - 1 (Day 15)
	public static String toLowerCase(String str) {
		// Write your code here..
		return str.toLowerCase();
	}

	// 6-Month Code Marathon - 1 (Day 16)
	public static boolean isPerfectSquare(long n) {
		// Write your code here.
		long sqrt = (long) Math.sqrt(n);
		return n == sqrt * sqrt;
	}

	// Beginners 7 Day Challenge - 8 (Day 1)
	public static int[] generateFibonacciNumbers(int n) {
		// Write your code here.
		int fib[] = new int[n];
		if (n == 1) {
			return new int[] { 0 };
		} else if (n == 2) {
			return new int[] { 0, 1 };
		} else {
			fib[0] = 0;
			fib[1] = 1;
			for (int i = 2; i < n; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
			return fib;
		}
	}
}