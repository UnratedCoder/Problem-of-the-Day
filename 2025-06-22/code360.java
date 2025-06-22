public class code360 {

	// Problem of the Day (Easy)
	public static Boolean isMirror(char ch) {
		return ch == 'A' || ch == 'H' || ch == 'I' || ch == 'M' || ch == 'O' || ch == 'T' || ch == 'U' || ch == 'V'
				|| ch == 'W' || ch == 'X' || ch == 'Y';
	}

	public static Boolean isReflectionEqual(String s) {
		// Write your code here.
		for (int i = 0; i <= s.length() / 2; i++) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(s.length() - 1 - i);
			if (!isMirror(ch1) || ch1 != ch2) {
				return false;
			}
		}
		return true;
	}
}