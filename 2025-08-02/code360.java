public class code360 {

	// Problem of the Day (Easy)
	public static long titleToNumber(String str) {
		long result = 0;
		for (char ch : str.toCharArray()) {
			int val = ch - 'A' + 1;
			result = result * 26 + val;
		}
		return result;
	}
}