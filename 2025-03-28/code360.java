import java.util.*;

public class code360 {

	// Problem of the day (Easy)
	public static int findDuplicate(ArrayList<Integer> arr) {
		// Write your code here.
		HashSet<Integer> set = new HashSet<>();
		for (Integer el : arr) {
			if (set.contains(el)) {
				return el;
			} else {
				set.add(el);
			}
		}
		return -1;
	}
}