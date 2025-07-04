import java.util.*;

public class code360 {

	// Coding Interview Questions
	static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n) {
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<>();
		Stack<Integer> s = new Stack<>();
		for (int i = n - 1; i >= 0; i--) {
			while (!s.isEmpty() && s.peek() >= arr.get(i)) {
				s.pop();
			}
			if (s.isEmpty()) {
				result.add(-1);
			} else {
				result.add(s.peek());
			}
			s.push(arr.get(i));
		}
		Collections.reverse(result);
		return result;
	}
}