import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<>();
		int maxFromRight = Integer.MIN_VALUE;
		for (int i = n - 1; i >= 0; i--) {
			int curr = elements.get(i);
			if (curr > maxFromRight) {
				result.add(curr);
				maxFromRight = curr;
			}
		}
		Collections.reverse(result);
		return result;
	}
}