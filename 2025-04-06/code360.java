import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int kThDigit(long n, int k) {
		int ans = 0;
		while (k-- > 0) {
			ans = (int) (n % 10);
			n /= 10;
		}
		return ans;
	}

	public static int findKthFromRight(int n, int m, int k) {
		// Write your code here.
		long ans = (long) Math.pow(n, m);
		return kThDigit(ans, k);
	}

	// Beginners 7 Day Challenge - 8 (Day 5)
	public static List<Integer> majorityElement(int[] v) {
		// Write your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int el : v) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		List<Integer> list = new ArrayList<>();
		for (Integer key : map.keySet()) {
			if (map.get(key) > v.length / 3) {
				list.add(key);
			}
		}
		Collections.sort(list);
		return list;
	}
}