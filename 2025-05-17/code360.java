import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int missingNumber(int n, int[] arr) {
		// Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int el : arr) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) % 2 != 0) {
				return key;
			}
		}
		return -1;
	}
}