import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int nge[] = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		Stack<Integer> s = new Stack<>();
		for (int i = n - 1; i >= 0; i--) {
			while (!s.isEmpty() && arr.get(s.peek()) <= arr.get(i)) {
				s.pop();
			}
			if (s.isEmpty()) {
				nge[i] = -1;
			} else {
				nge[i] = arr.get(s.peek());
			}
			s.push(i);
		}
		for (int el : nge) {
			list.add(el);
		}
		return list;
	}
}