public class code360 {

	// POTD
	public static String convertString(String str) {
		// Write your code here
		String words[] = str.split(" ");
		String ans = "";
		for (String s : words) {
			ans += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
		}
		return ans.substring(0, ans.length() - 1);
	}
}