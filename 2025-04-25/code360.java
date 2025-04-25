public class code360 {

	// Coding Interview Questions
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static String encodeString(int n, String s) {
		// Write your code here.
		StringBuilder sb = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (isVowel(ch)) {
				if (ch == 'z') {
					sb.append('a');
				} else {
					sb.append(++ch);
				}
			} else {
				if (ch == 'a') {
					sb.append('z');
				} else {
					sb.append(--ch);
				}
			}
		}
		return sb.toString();
	}

	// Beginners 7 Day Challenge - 10 (Day 5)
	public static String reverseString(String str) {
		// Write your code here
		String word[] = str.split(" ");
		for (int i = 0; i < word.length / 2; i++) {
			String temp = word[i];
			word[i] = word[word.length - 1 - i];
			word[word.length - 1 - i] = temp;
		}
		String ans = "";
		for (String el : word) {
			ans += el + " ";
		}
		return ans;
	}
}