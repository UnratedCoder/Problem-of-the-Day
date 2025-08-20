import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static List<Integer> MinimumCoins(int n) {
		// Write your code here.
		List<Integer> result = new ArrayList<>();
		int currency[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		for (int i = 0; i < currency.length; i++) {
			if (n >= currency[i]) {
				result.add(currency[i]);
				n -= currency[i];
				i--;
			}
		}
		return result;
	}
}