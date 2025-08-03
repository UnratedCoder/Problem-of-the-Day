import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static String read(int n, int[] book, int target) {
		// Write your code here.
		HashSet<Integer> set = new HashSet<>();
		for (int b : book) {
			if (set.contains(target - b)) {
				return "YES";
			}
			set.add(b);
		}
		return "NO";
	}
}