public class code360 {

	// Problem of the Day (Easy)
	public static boolean checkPalindrome(String str) {
		// WRITE YOUR CODE HERE
		str = str.toLowerCase();
		int si = 0;
		int ei = str.length() - 1;
		while (si <= ei) {
			char first = str.charAt(si);
			char last = str.charAt(ei);
			if ((Character.isDigit(first) || Character.isAlphabetic(first))
					&& (Character.isAlphabetic(last) || Character.isDigit(last))) {
				if (first != last) {
					return false;
				} else {
					si++;
					ei--;
				}
			} else if (!Character.isAlphabetic(first) && !Character.isDigit(first)) {
				si++;
			} else {
				ei--;
			}
		}
		return true;
	}
}