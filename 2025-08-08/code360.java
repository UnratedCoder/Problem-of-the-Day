import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static Boolean isReflectionEqual(String s) {
		// Write your code here.
		HashSet<Character> set = new HashSet<>(Arrays.asList('A', 'H', 'I', 'M', 'O', 'T', 'U', 'V', 'W', 'X', 'Y'));
		Boolean isMirror = true;
		for (int i = 0; i <= s.length() / 2; i++) {
			char left = s.charAt(i);
			char right = s.charAt(s.length() - 1 - i);
			if (right != left || !set.contains(left)) {
				isMirror = false;
				break;
			}
		}
		return isMirror ? true : false;
	}
}