import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int consecutiveOnes(int n, int[] arr) {
		// Write your code here.
		int maxOne = 0;
		int count = 0;
		int prev = 0;
		for (int el : arr) {
			if (prev == 0 && el == 1) {
				count++;
				prev = 1;
			} else if (el == 1 && prev == 1) {
				count++;
			} else {
				maxOne = Math.max(maxOne, count);
				count = 0;
				prev = 0;
			}
		}
		return Math.max(maxOne, count);
	}

	// 6-Month Code Marathon - 1 (Day 38)
	public static String morseToEnglish(String morsecode) {
		// Write you code here
		String code[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----",
				".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----." };
		HashMap<String, Character> map = new HashMap<>();
		char ch = 'a';
		char num = '0';
		for (String c : code) {
			if (ch >= 'a' && ch <= 'z') {
				map.put(c, ch++);
			} else {
				map.put(c, num++);
			}
		}
		StringBuilder sb = new StringBuilder();
		String morse[] = morsecode.split(" ");
		for (String c : morse) {
			sb.append(map.get(c));
		}
		return sb.toString();
	}

	// Beginners 7 Day Challenge - 10 (Day 3)
	public static int[] count(int N) {
		// Write your code here
		int bits[] = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			bits[i] = Integer.bitCount(i);
		}
		return bits;
	}
}