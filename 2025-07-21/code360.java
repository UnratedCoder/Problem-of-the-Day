import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static ArrayList<Integer> findDuplicates(int[] arr, int n) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> result = new HashSet<>();
		for (int el : arr) {
			if (set.contains(el)) {
				result.add(el);
			} else {
				set.add(el);
			}
		}
		for (int el : result) {
			list.add(el);
		}
		return list;
	}
}