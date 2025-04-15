import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static List<Integer> MinimumCoins(int n) {
		// Write your code here.
		List<Integer> list = new ArrayList<>();
		int currency[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		for (int i = 0; i < currency.length; i++) {
			if (currency[i] <= n) {
				list.add(currency[i]);
				n -= currency[i];
				i--;
			}
		}
		return list;
	}

	// Beginners 7 Day Challenge - 9 (Day 5)
	public static ArrayList<Long> kthRow(int k) {
		// Write your code here.
		ArrayList<Long> list = new ArrayList<>();
		long ans = 1;
		list.add(ans);
		for (int i = 1; i < k; i++) {
			ans *= k - i;
			ans /= i;
			list.add(ans);
		}
		return list;
	}
}