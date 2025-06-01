import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static boolean countPlatesOnTable(int n, int R, int r) {
		// Write your code here
		if (r > R) {
			return false;
		}
		if (n == 1) {
			return r <= R;
		}
		if (2 * r > R) {
			return false;
		}
		double angle = Math.asin((double) r / (R - r));
		return angle * n <= Math.PI;
	}

	// 6-Month Code Marathon - 1 (Day 76)
	public static List<String> topKCities(int N, int K, List<Map.Entry<String, Integer>> cities) {
		// Write your code here
		List<String> ans = new ArrayList<>();
		cities.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		for (Map.Entry<String, Integer> entry : cities) {
			if (K == 0) {
				break;
			} else {
				ans.add(entry.getKey());
				K--;
			}
		}
		return ans;
	}
}