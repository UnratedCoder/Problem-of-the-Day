public class code360 {

	// Problem of the Day (Easy)
	public static int findSetBit(int n) {
		// WRITE YOUR CODE HERE
		String bin = Integer.toBinaryString(n);
		if (Integer.bitCount(n) != 1) {
			return -1;
		}
		int count = 0;
		for (int i = bin.length() - 1; i >= 0; i--) {
			count++;
			if (bin.charAt(i) == '1') {
				break;
			}
		}
		return count;
	}
}