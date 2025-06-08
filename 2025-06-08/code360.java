import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int findFirstRepeatingDigit(String digitPattern) {
		// Write your code here.
		HashSet<Character> set = new HashSet<>();
		for (char ch : digitPattern.toCharArray()) {
			if (set.contains(ch)) {
				return ch - '0';
			} else {
				set.add(ch);
			}
		}
		return -1;
	}
}