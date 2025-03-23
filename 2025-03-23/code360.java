import java.util.ArrayList;

public class code360 {

	// 6-Month Code Marathon - 1 (Day 7)
	public static boolean searchGrid(ArrayList<ArrayList<Integer>> mat, int n, int m, int target) {
		// Write your code here
		// Return true or false
		int si = 0;
		int ei = m - 1;
		while (si < n && ei >= 0) {
			if (mat.get(si).get(ei) == target) {
				return true;
			} else if (mat.get(si).get(ei) > target) {
				ei--;
			} else {
				si++;
			}
		}
		return false;
	}
}