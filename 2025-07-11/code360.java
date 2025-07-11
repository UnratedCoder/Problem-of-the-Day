public class code360 {

	// Coding Interview Questions
	public static boolean checkPalindrome(String str) {
		// WRITE YOUR CODE HERE
		str = str.toLowerCase();
		int si = 0;
		int ei = str.length() - 1;
		while (si < ei) {
			char f = str.charAt(si);
			char s = str.charAt(ei);
			if ((Character.isAlphabetic(f) || Character.isDigit(f))
					&& (Character.isAlphabetic(s) || Character.isDigit(s))) {
				if (f != s) {
					return false;
				}
				si++;
				ei--;
			} else if (!Character.isAlphabetic(f) && !Character.isDigit(f)) {
				si++;
			} else {
				ei--;
			}
		}
		return true;
	}
}