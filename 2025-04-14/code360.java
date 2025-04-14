public class code360 {

	// Coding Interview Questions
	public static String[] printPatt(int n) {
		// Write your code here
		String pat[] = new String[n];
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n - i; j++) {
				sb.append("*");
			}
			pat[i] = sb.toString();
		}
		return pat;
	}

	// Beginners 7 Day Challenge - 9 (Day 4)
	public static int occursOnce(int[] a, int n) {
		// Write your code here.
		int xor = 0;
		for (int el : a) {
			xor ^= el;
		}
		return xor;
	}
}