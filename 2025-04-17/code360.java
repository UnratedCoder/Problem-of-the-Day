import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int minimumRotations(int n, String s) {
		// Write your code here.
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		if (map.size() == 1) {
			return 1;
		}
		return s.length();
	}
}