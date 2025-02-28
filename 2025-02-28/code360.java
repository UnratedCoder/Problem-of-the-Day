public class code360 {

	public static String reverseString(String str) {
		// Write your code here
		if (str.length() == 0) {
			return str;
		}
		String words[] = str.split(" ");
		for (int i = 0; i < words.length / 2; i++) {
			String temp = words[i];
			words[i] = words[words.length - 1 - i];
			words[words.length - 1 - i] = temp;
		}
		String ans = "";
		for (String el : words) {
			ans += el + " ";
		}
		if (ans.length() == 0 || ans.length() == 1) {
			return ans;
		}
		return ans.substring(0, ans.length() - 1);
	}
}