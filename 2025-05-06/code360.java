import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int[] anagramMapping(int n, int[] a, int[] b) {
		// Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(b[i], i);
		}
		for (int i = 0; i < n; i++) {
			if (map.containsKey(a[i])) {
				a[i] = map.get(a[i]);
			}
		}
		return a;
	}
}