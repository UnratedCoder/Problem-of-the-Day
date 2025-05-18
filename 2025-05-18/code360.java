public class code360 {

	// Beginners 7 Day Challenge - 11 (Day 1)
	static int countMoves(int n, String s) {
		// Write your code here.
		int one = 0;
		int zero = 0;
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				if (s.charAt(i) == '1') {
					one++;
				} else {
					zero++;
				}
			}
		}
		return one + zero;
	}
}