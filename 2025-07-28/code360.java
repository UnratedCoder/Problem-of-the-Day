import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int removeDuplicates(int[] arr, int n) {
		// Write your code here.
		HashSet<Integer> set = new HashSet<>();
		for (int el : arr) {
			set.add(el);
		}
		return set.size();
	}
}