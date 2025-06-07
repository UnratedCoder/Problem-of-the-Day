import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int maxFrequencyNumber(int n, int[] arr) {
		// Write your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int el : arr) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		int maxFreq = Integer.MIN_VALUE;
		int element = 0;
		for (int el : arr) {
			if (maxFreq < map.get(el)) {
				maxFreq = map.get(el);
				element = el;
			}
		}
		return element;
	}
}