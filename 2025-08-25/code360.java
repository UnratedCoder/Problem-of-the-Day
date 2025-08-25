public class code360 {

	// Problem of the Day (Easy)
	public static String reverseString(String str) {
		// Write your code here
		StringBuilder sb = new StringBuilder();
		String word[] = str.split("\\s+");
		for (int i = word.length - 1; i >= 0; i--) {
			sb.append(word[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
}