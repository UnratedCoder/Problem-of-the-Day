import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> getAllDivisors(int n) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i) {
					ans.add(i);
				} else {
					ans.add(i);
					ans.add(n / i);
				}
			}
		}
		Collections.sort(ans);
		return ans;
	}
}