public class code360 {

	// Problem of the Day (Easy)
	public static String[] printPatt(int n) {
		// Write your code here
		String pat[] = new String[n];
		for (int i = 1; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j <= n - i + 1; j++) {
				sb.append("*");
			}
			pat[i - 1] = sb.toString();
		}
		return pat;
	}
}