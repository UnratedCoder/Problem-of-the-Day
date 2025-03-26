import java.util.ArrayList;
import java.util.HashMap;

public class code360 {

	// Problem of the day (Easy)
	public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (Integer el : arr) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) > arr.size() / 3) {
				list.add(key);
			}
		}
		return list;
	}
}