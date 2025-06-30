import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int[] nextGreater(int[] arr, int n) {
		// Write Your code here
		int nge[] = new int[n];
		Stack<Integer> s = new Stack<>();
		for (int i = n - 1; i >= 0; i--) {
			while (!s.isEmpty() && s.peek() <= arr[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				nge[i] = -1;
			} else {
				nge[i] = s.peek();
			}
			s.push(arr[i]);
		}
		return nge;
	}
}