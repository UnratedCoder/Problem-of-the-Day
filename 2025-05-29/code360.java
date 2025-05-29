import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int minimumDistance(int arr[], int n, int x, int y) {
		// Write your code here.
		int min = Integer.MAX_VALUE;
		int lastPos = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x || arr[i] == y) {
				if (lastPos != -1 && arr[i] != arr[lastPos]) {
					min = Math.min(min, i - lastPos);
				}
				lastPos = i;
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	// 6-Month Code Marathon - 1 (Day 69)
	public static boolean isBalanced(String S) {
		// Write your code here.
		Stack<Character> stack = new Stack<>();
		for (char ch : S.toCharArray()) {
			if (ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if ((ch == '}' && stack.peek() == '{') || (ch == ')' && stack.peek() == '(')
						|| (ch == ']' && stack.peek() == '[')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}