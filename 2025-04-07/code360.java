public class code360 {

	// Problem of the Day (Easy)
	public static boolean oneSegment(String str) {
		// Write your code here.
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == '0' && str.charAt(i + 1) == '1') {
				return false;
			}
		}
		return true;
	}

	// Beginners 7 Day Challenge - 8 (Day 7)
	public static int[] termsOfAP(int x) {
		// Write your code here.
		int ans[] = new int[x];
		int idx = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (idx == x) {
				break;
			} else if ((3 * i + 2) % 4 != 0) {
				ans[idx++] = 3 * i + 2;
			}
		}
		return ans;
	}
}