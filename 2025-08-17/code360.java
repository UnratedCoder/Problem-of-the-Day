import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int maxFrequencyNumber(int n, int[] arr) {
		// Write your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int el : arr) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		int element = 0;
		for (int el : arr) {
			if (map.get(el) > max) {
				max = map.get(el);
				element = el;
			}
		}
		return element;
	}
}