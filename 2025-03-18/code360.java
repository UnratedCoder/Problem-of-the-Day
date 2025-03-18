import java.util.ArrayList;

public class code360 {

	// 6-Month Code Marathon - 1 (Day 2)
	public static ArrayList<ArrayList<Character>> interestingPattern(int N) {
		// Write your code here.
		ArrayList<ArrayList<Character>> ans = new ArrayList<>();
		char ch = (char) (65 + N - 1);
		for (int i = 1; i <= N; i++) {
			ArrayList<Character> temp = new ArrayList<>();
			for (int j = 1; j <= i; j++) {
				temp.add(ch++);
			}
			ans.add(temp);
			--ch;
			for (int j = 1; j <= i; j++) {
				--ch;
			}
		}
		return ans;
	}
}