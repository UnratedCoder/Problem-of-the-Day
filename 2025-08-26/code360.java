public class code360 {

	// Problem of the Day (Easy)
	public static int[] termsOfAP(int x) {
		// Write your code here.
		int ap[] = new int[x];
		int count = 0;
		int idx = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			int term = 3 * i + 2;
			if (term % 4 != 0) {
				ap[idx++] = term;
				count++;
			}
			if (count == x) {
				break;
			}
		}
		return ap;
	}
}