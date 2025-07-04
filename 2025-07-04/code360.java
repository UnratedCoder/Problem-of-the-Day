import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int calculateScore(ArrayList<String> matchResult, int n) {
		// Write your code here.
		Stack<Integer> s = new Stack<>();
		int result = 0;
		for (int i = 0; i < n; i++) {
			if (matchResult.get(i).equals("+")) {
				int top = s.pop();
				int secTop = s.peek();
				int sum = top + secTop;
				s.push(top);
				s.push(sum);
			} else if (matchResult.get(i).equals("D")) {
				s.push(s.peek() * 2);
			} else if (matchResult.get(i).equals("C")) {
				s.pop();
			} else {
				s.push(Integer.parseInt(matchResult.get(i)));
			}
		}
		for (int el : s) {
			result += el;
		}
		return result;
	}
}