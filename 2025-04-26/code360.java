import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static String amazingStrings(String first, String second, String third) {
		// Write your code here.
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : first.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (char ch : second.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (char ch : third.toCharArray()) {
			if (map.containsKey(ch)) {
				if (map.get(ch) == 1) {
					map.remove(ch);
				} else {
					map.put(ch, map.get(ch) - 1);
				}
			} else {
				return "NO";
			}
		}
		return map.size() == 0 ? "YES" : "NO";
	}
}