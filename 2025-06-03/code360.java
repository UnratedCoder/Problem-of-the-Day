public class code360 {

	// Problem of the Day (Easy)
	public static boolean checkMeta(String str1, String str2) {
		// Write your code here.
		if (str1.equals(str2)) {
			return false;
		}
		int freq[] = new int[26];
		for (char ch : str1.toLowerCase().toCharArray()) {
			freq[ch - 'a']++;
		}
		for (char ch : str2.toLowerCase().toCharArray()) {
			if (freq[ch - 'a'] == 0) {
				return false;
			} else {
				freq[ch - 'a']--;
			}
		}
		return true;
	}
}