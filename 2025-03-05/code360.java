import java.util.ArrayList;
import java.util.HashMap;

public class code360 {

	// POTD
	public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (Integer el : arr) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) > Math.floor(arr.size() / 3)) {
				list.add(key);
			}
		}
		return list;
	}

	// Beginners 7 Day Challenge - 4 (Day 2)
	public static String compressTheString(String s) {
		// Write your code here
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
			sb.append(s.charAt(i));
			if (count > 1) {
				sb.append(Integer.toString(count));
			}
		}
		return sb.toString();
	}
}