import java.util.*;

public class code360 {

	// Month of Code Challenge - 1 (Day 15)
	public static String reverseOnlyLetters(String s) {
		// Write your code here.
		char word[] = s.toCharArray();
		int si = 0;
		int ei = word.length - 1;
		while (si <= ei) {
			if (Character.isAlphabetic(word[si]) && Character.isAlphabetic(word[ei])) {
				char temp = word[si];
				word[si] = word[ei];
				word[ei] = temp;
				si++;
				ei--;
			} else if (!Character.isAlphabetic(word[si]) && Character.isAlphabetic(word[ei])) {
				si++;
			} else {
				ei--;
			}
		}
		return new String(word);
	}

	// 6-Month Code Marathon - 1 (Day 10)
	public static boolean findPairSum(int[] arr, int target) {
		// Write your code here
		HashSet<Integer> set = new HashSet<>();
		for (int el : arr) {
			if (set.contains(target - el)) {
				return true;
			}
			set.add(el);
		}
		return false;
	}

	// Beginners 7 Day Challenge - 7 (Day 7)
	public static List<Integer> MinimumCoins(int n) {
		// Write your code here.
		int money[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < money.length; i++) {
			if (money[i] <= n) {
				ans.add(money[i]);
				n -= money[i];
				i--;
			}
		}
		return ans;
	}
}