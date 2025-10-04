public class code360 {

	// Problem of the Day (Easy)
	public static int maximumSwap(int n) {
		// Write your code here.
		char digits[] = Integer.toString(n).toCharArray();
		int num = digits.length;
		int last[] = new int[10];
		for (int i = 0; i < num; i++) {
			last[digits[i] - '0'] = i;
		}
		for (int i = 0; i < num; i++) {
			int currDigit = digits[i] - '0';
			for (int d = 9; d > currDigit; d--) {
				if (last[d] > i) {
					char temp = digits[i];
					digits[i] = digits[last[d]];
					digits[last[d]] = temp;
					return Integer.parseInt(new String(digits));
				}
			}
		}
		return n;
	}
}