import java.util.HashMap;

public class code360 {

	// POTD
	public static String specificOrder(String x, String y) {
		// Write your code here.
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : x.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		StringBuilder sb = new StringBuilder();
		for (char ch : y.toCharArray()) {
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				while (count-- > 0) {
					sb.append(ch);
				}
				map.remove(ch);
			}
		}
		for (Character key : map.keySet()) {
			for (int i = 0; i < map.get(key); i++) {
				sb.append(key);
			}
		}
		return sb.toString();
	}

	// Month of Code Challenge - 1 (Day 3)
	static int[] planetDivision(int n) {
		// Write your code here.
		int ans[] = new int[2];
		if (n % 2 == 0) {
			ans[0] = n / 2;
			ans[1] = n / 2;
		} else {
			ans[0] = n / 2 + 1;
			ans[1] = n - ans[0];
		}
		return ans;
	}
}