import java.util.*;

public class code360 {

	// 6-Month Code Marathon - 1 (Day 5)
	public static String stringSort(String s) {
		// Write your code here.
		char words[] = s.toCharArray();
		Arrays.sort(words);
		return new String(words);
	}

	// Month of Code Challenge - 1 (Day 10)
	public static String[] NumberPattern(int n) {
		// Write your code here
		String ans[] = new String[n];
		for (int i = 1; i <= n; i++) {
			int num = i;
			String s = "";
			for (int j = 1; j <= i; j++) {
				s += Integer.toString(num);
				num++;
			}
			ans[i - 1] = s;
		}
		return ans;
	}
}