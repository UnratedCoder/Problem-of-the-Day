import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static char findAddedCharacter(String s, String t) {
		// Write your code here.
		HashMap<Character, Integer> map = new HashMap<>();
		if (s.length() > t.length()) {
			for (char ch : s.toCharArray()) {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
			for (char ch : t.toCharArray()) {
				if (map.containsKey(ch)) {
					if (map.get(ch) == 1) {
						map.remove(ch);
					} else {
						map.put(ch, map.get(ch) - 1);
					}
				}
			}
		} else {
			for (char ch : t.toCharArray()) {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
			for (char ch : s.toCharArray()) {
				if (map.containsKey(ch)) {
					if (map.get(ch) == 1) {
						map.remove(ch);
					} else {
						map.put(ch, map.get(ch) - 1);
					}
				}
			}
		}
		for (Character key : map.keySet()) {
			return key;
		}
		return 'a';
	}
}