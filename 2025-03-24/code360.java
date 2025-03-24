import java.util.*;

public class code360 {

	// Beginners 7 Day Challenge - 7 (Day 1)
	public static String[] NumberPattern(int n) {

		// Write your code here
		String ans[] = new String[n];
		int num = n;
		for (int i = 0; i < n; i++) {
			String s = "";
			for (int j = 0; j < n; j++) {
				if (num == n) {
					s += Integer.toString(num);
				} else if (num < n) {
					s += Integer.toString(num);
					num++;
				}
			}
			ans[i] = s;
			num -= i + 1;
		}
		return ans;
	}

	// Beginners 7 Day Challenge - 7 (Day 2)
	public static int minimumParentheses(String pattern) {
		// Write your code here.
		Stack<Character> s = new Stack<>();
		for (char ch : pattern.toCharArray()) {
			if (!s.isEmpty() && s.peek() == '(' && ch == ')') {
				s.pop();
			} else {
				s.push(ch);
			}
		}
		return s.size();
	}

	// Beginners 7 Day Challenge - 7 (Day 3)
	public static ArrayList<ArrayList<Integer>> pairs(ArrayList<Integer> arr, int n) {
		// Write your code here.
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		for (Integer el : arr) {
			set.add(el);
		}
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> pair = new ArrayList<>();
			int el = arr.get(i);
			if (el > 0 && set.contains(-el)) {
				pair.add(el);
				pair.add(-el);
				Collections.sort(pair);
				ans.add(pair);
				set.remove(-el);
				set.remove(el);
			}
		}
		return ans;
	}
}