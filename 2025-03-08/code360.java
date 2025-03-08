import java.util.Stack;

public class code360 {

	// POTD
	public static String[] printPatt(int n) {
		// Write your code here
		String ans[] = new String[n];
		for (int i = 0; i < n; i++) {
			StringBuilder temp = new StringBuilder();
			for (int j = 0; j < n - i; j++) {
				temp.append("*");
			}
			ans[i] = temp.toString();
		}
		return ans;
	}

	// Beginners 7 Day Challenge - 4 (Day 5)
	public static boolean isBalanced(String S) {
		// Write your code here.
		Stack<Character> stack = new Stack<>();
		for (char ch : S.toCharArray()) {
			if (ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if ((stack.peek() == '(' && ch == ')') || ((stack.peek() == '{' && ch == '}'))
						|| (stack.peek() == '[' && ch == ']')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}