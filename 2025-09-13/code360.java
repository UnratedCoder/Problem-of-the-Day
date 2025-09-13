import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<ArrayList<Character>> interestingPattern(int N) {
		// Write your code here.
		ArrayList<ArrayList<Character>> result = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			ArrayList<Character> list = new ArrayList<>();
			char ch = (char) ('A' + N - 1 - i);
			for (int j = 0; j <= i; j++) {
				list.add((char) (ch + j));
			}
			result.add(list);
		}
		return result;
	}
}