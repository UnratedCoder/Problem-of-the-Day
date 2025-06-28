public class code360 {

	// Coding Interview Questions
	public static int minimumParentheses(String pattern) {
		// Write your code here.
		int open = 0;
		int close = 0;
		for (char ch : pattern.toCharArray()) {
			if (ch == '(') {
				open++;
			} else if (ch == ')') {
				if (open > 0) {
					open--;
				} else {
					close++;
				}
			}
		}
		return open + close;
	}
}