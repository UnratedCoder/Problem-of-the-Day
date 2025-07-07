public class code360 {

	// Problem of the Day (Easy)
	public static String[] printPatt(int n) {
		// Write your code here
		String result[] = new String[n];
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n - i; j++) {
				sb.append("*");
			}
			result[i] = sb.toString();
		}
		return result;
	}
}