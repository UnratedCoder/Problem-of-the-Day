public class code360 {

	// Coding Interview Questions
	public static String[] NumberPattern(int n) {
		// Write your code here
		String pat[] = new String[n];
		for (int i = 1; i <= n; i++) {
			int num = i;
			String p = "";
			for (int j = 1; j <= i; j++) {
				p += Integer.toString(num);
				num++;
			}
			pat[i - 1] = p;
		}
		return pat;
	}
}