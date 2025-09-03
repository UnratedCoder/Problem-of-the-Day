public class code360 {

	// Problem of the Day (Easy)
	static final String base58 = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";

	public static String encodeBase58(int n) {
		// Write your code here
		if (n == 0) {
			return "1";
		}
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			int remainder = n % 58;
			sb.append(base58.charAt(remainder));
			n /= 58;
		}
		return sb.reverse().toString();
	}
}