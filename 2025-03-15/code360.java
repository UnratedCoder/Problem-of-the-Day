import java.util.ArrayList;
import java.util.HashSet;

public class code360 {

	// POTD
	public static int findSum(int n, ArrayList<Integer> arr) {
		// Write your code here
		int sum = 0;
		for (Integer el : arr) {
			if (el % 2 == 0 || el % 3 == 0) {
				sum += el;
			}
		}
		return sum;
	}

	// Month of Code Challenge - 1 (Day 4)
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