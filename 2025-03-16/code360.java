import java.util.ArrayList;
import java.util.HashMap;

public class code360 {

	// Coding Interview Questions
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static Boolean splitString(String str) {
		// Write your code here..
		int count1 = 0;
		for (int i = 0; i < str.length() / 2; i++) {
			if (isVowel(Character.toLowerCase(str.charAt(i)))) {
				count1++;
			}
		}
		int count2 = 0;
		for (int i = str.length() / 2; i < str.length(); i++) {
			if (isVowel(Character.toLowerCase(str.charAt(i)))) {
				count2++;
			}
		}
		return count1 == count2;
	}

	// Month of Code Challenge - 1 (Day 5)
	public static ArrayList<Integer> diffSimCards(ArrayList<Integer> pack1, int n, ArrayList<Integer> pack2, int m) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (Integer el : pack1) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		@SuppressWarnings("unchecked")
		HashMap<Integer, Integer> map2 = (HashMap<Integer, Integer>) map.clone();
		for (Integer el : pack2) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		ans.add(map.size());
		int count = 0;
		for (Integer el : pack2) {
			if (map2.containsKey(el)) {
				count++;
				if (map2.get(el) > 1) {
					map2.put(el, map2.get(el) - 1);
				} else {
					map2.remove(el);
				}
			}
		}
		ans.add(count);
		return ans;
	}
}