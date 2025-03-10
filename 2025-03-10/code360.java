public class code360 {

	public static boolean isEqual(String str1, String str2) {
		// Write your code here.
		StringBuilder sb1 = new StringBuilder(str1);
		for (int i = 0; i < sb1.length(); i++) {
			char ch = sb1.charAt(i);
			if (i == 0 && ch == '#') {
				sb1.deleteCharAt(i);
				i--;
			} else if (i > 0 && ch == '#') {
				sb1.delete(i - 1, i + 1);
				i -= 2;
			}
		}
		StringBuilder sb2 = new StringBuilder(str2);
		for (int i = 0; i < sb2.length(); i++) {
			char ch = sb2.charAt(i);
			if (i == 0 && ch == '#') {
				sb2.deleteCharAt(i);
				i--;
			} else if (i > 0 && ch == '#') {
				sb2.delete(i - 1, i + 1);
				i -= 2;
			}
		}
		if (sb1.length() == 0 && sb2.length() == 0) {
			return true;
		}

		return sb1.toString().equals(sb2.toString());
	}
}