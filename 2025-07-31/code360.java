public class code360 {

	// Problem of the Day (Easy)
	public static String amazingStrings(String first, String second, String third) {
		// Write your code here.
		int freq[] = new int[26];
		for (char ch : first.toLowerCase().toCharArray()) {
			freq[ch - 'a']++;
		}
		for (char ch : second.toLowerCase().toCharArray()) {
			freq[ch - 'a']++;
		}
		for (char ch : third.toLowerCase().toCharArray()) {
			if (freq[ch - 'a'] == 0) {
				return "NO";
			}
			freq[ch - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0) {
				return "NO";
			}
		}
		return "YES";
	}
}