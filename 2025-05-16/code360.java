public class code360 {

	// Coding Interview Questions
	public static String[] NumberPattern(int i) {
		// Write your code here
		String pat[] = new String[i];
		for (int k = 0; k < i; k++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < i - k; j++) {
				sb.append(j + 1);
			}
			pat[k] = sb.toString();
		}
		return pat;
	}
}