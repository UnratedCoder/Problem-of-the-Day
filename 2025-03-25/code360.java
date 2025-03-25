public class code360 {

	// Problem of the day (Easy)
	public static boolean isValid(String str) {
		// Write your code here.
		if (str.length() < 8 || str.length() > 15) {
			return false;
		}
		boolean isDigit = false;
		boolean isLowerCase = false;
		boolean isUpperCase = false;
		boolean isSpecial = false;
		for (char ch : str.toCharArray()) {
			if (ch == ' ') {
				return false;
			} else if (ch >= 'a' && ch <= 'z') {
				isLowerCase = true;
			} else if (ch >= 'A' && ch <= 'Z') {
				isUpperCase = true;
			} else if (ch >= '0' && ch <= '9') {
				isDigit = true;
			} else if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
				isSpecial = true;
			}
		}
		return isSpecial && isDigit && isLowerCase && isUpperCase;
	}
}