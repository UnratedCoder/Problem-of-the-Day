import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> theOrder(int n) {
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<>();
		boolean visited[] = new boolean[n + 1];
		int solved = 0, idx = 1, count = 0;
		while (solved < n) {
			if (!visited[idx]) {
				count++;
				if (count == 2) {
					result.add(idx);
					visited[idx] = true;
					solved++;
					count = 0;
				}
			}
			idx++;
			if (idx > n) {
				idx = 1;
			}
		}
		return result;
	}
}