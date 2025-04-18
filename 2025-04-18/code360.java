import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int maximumWeightRow(int n, int m, int[][] mat) {
		// Write your code here.
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum += mat[i][j];
			}
			max = Math.max(max, sum);
		}
		return max;
	}

	// Problem of the Day (Moderate)
	public static int getMinimumAnagramDifference(String str1, String str2) {
		// Write your code here.
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		int count = 0;
		for (char ch : str2.toCharArray()) {
			if (!map.containsKey(ch)) {
				count++;
			} else {
				if (map.get(ch) == 1) {
					map.remove(ch);
				} else {
					map.put(ch, map.get(ch) - 1);
				}
			}
		}
		return count;
	}

	// 6-Month Code Marathon - 1 (Day 33)
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
}