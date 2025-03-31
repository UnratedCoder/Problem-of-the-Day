import java.util.*;

public class code360 {

	// Problem of the day
	public static boolean ninjaGram(String str) {
		// Write your code here
		if (str.length() < 26) {
			return false;
		}
		HashSet<Character> set = new HashSet<>();
		for (char ch : str.toCharArray()) {
			set.add(Character.toLowerCase(ch));
		}
		return set.size() == 26;
	}
}