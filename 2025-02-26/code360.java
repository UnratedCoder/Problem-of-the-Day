public class code360 {

	// Beginners 7 Day Challenge - 3 (Day 2)
	public static long powWithMod(long base, long exponent, long mod) {
		long result = 1;
		base %= mod;
		while (exponent > 0) {
			if (exponent % 2 == 1) {
				result = (result * base) % mod;
			}
			base = (base * base) % mod;
			exponent /= 2;
		}
		return result;
	}

	public static int power(int N, int R) {
		// Write your code here.
		return (int) powWithMod(N, R, 1000000007);
	}
}