public class code360 {

	// Problem of the Day (Easy)
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static Boolean splitString(String str) {
		// Write your code here..
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() / 2 && isVowel(Character.toLowerCase(str.charAt(i)))) {
				count1++;
			} else if (i >= str.length() / 2 && isVowel(Character.toLowerCase(str.charAt(i)))) {
				count2++;
			}
		}
		return count1 == count2;
	}
}