public class code360 {

	// Problem of the Day (Easy)
	public static char firstNonRepeating(String str) {
		// Write your code here
		int freq[] = new int[26];
		for (char ch : str.toCharArray()) {
			freq[ch - 'a']++;
		}
		for (char ch : str.toCharArray()) {
			if (freq[ch - 'a'] == 1) {
				return ch;
			}
		}
		return '#';
	}
}