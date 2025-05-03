import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static ArrayList<ArrayList<Integer>> printReverse(int n) {
		// Write your code here.
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		int count = 1;
		for (int i = 1; i <= n; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = 1; j <= i; j++) {
				temp.add(count++);
			}
			if (i % 2 == 0) {
				Collections.reverse(temp);
			}
			ans.add(temp);
		}
		return ans;
	}
}