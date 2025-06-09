import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static String specificOrder(String x, String y) {
		// Write your code here.
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : x.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (char ch : y.toCharArray()) {
			if (map.containsKey(ch)) {
				for (int i = 0; i < map.get(ch); i++) {
					sb.append(ch);
				}
				map.remove(ch);
			}
		}
		for (char ch : x.toCharArray()) {
			if (map.containsKey(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}