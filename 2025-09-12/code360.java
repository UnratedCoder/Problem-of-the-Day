import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m) {
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<>();
		if (m > n) {
			return result;
		}
		int freq1[] = new int[26];
		int freq2[] = new int[26];
		for (int i = 0; i < m; i++) {
			freq1[ptr.charAt(i) - 'A']++;
			freq2[str.charAt(i) - 'A']++;
		}
		if (Arrays.equals(freq1, freq2)) {
			result.add(0);
		}
		for (int i = m; i < n; i++) {
			freq2[str.charAt(i - m) - 'A']--;
			freq2[str.charAt(i) - 'A']++;
			if (Arrays.equals(freq1, freq2)) {
				result.add(i - m + 1);
			}
		}
		return result;
	}
}