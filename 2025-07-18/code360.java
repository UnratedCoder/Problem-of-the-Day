public class code360 {

	// Problem of the Day (Easy)
	public static String reverseOrderWords(String str) {
		// Write your code here
		String words[] = str.split(" ");
		for (int i = 0; i < words.length / 2; i++) {
			String temp = words[i];
			words[i] = words[words.length - 1 - i];
			words[words.length - 1 - i] = temp;
		}
		return String.join(" ", words);
	}
}