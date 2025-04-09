import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int findDuplicate(ArrayList<Integer> arr) {
		// Write your code here.
		HashSet<Integer> set = new HashSet<>();
		for (int el : arr) {
			if (set.contains(el)) {
				return el;
			}
			set.add(el);
		}
		return -1;
	}
}