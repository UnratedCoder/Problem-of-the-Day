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

	// Beginners 7 Day Challenge - 5 (Day 3)
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean checkPrimeAdjacent(int n) {
		// Write your code here.
		return isPrime(n - 1) && isPrime(n + 1);
	}

	// Month of Code Challenge - 1 (Day 1)
	static String decodeString(String s) {
		// Write your code here.
		StringBuilder sb = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (ch == 'z') {
				sb.append('a');
			} else {
				sb.append(++ch);
			}
		}
		return sb.toString();
	}
}