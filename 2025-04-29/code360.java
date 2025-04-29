import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static ArrayList<Integer> findNonRepeating(ArrayList<Integer> a) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (Integer el : a) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				list.add(key);
			}
		}
		return list;
	}
}