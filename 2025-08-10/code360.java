public class code360 {

	// Problem of the Day (Easy)
	public static boolean ninjaGram(String str) {
		// Write your code here
		if (str.length() < 26) {
			return false;
		}
		int freq[] = new int[26];
		for (char ch : str.toLowerCase().toCharArray()) {
			freq[ch - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (freq[i] == 0) {
				return false;
			}
		}
		return true;
	}
}