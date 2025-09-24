public class code360 {

	// Problem of the Day (Easy)
	public static int findSetBit(int n) {
		// WRITE YOUR CODE HERE
		if (n == 0 || (n & (n - 1)) != 0) {
			return -1;
		}
		int pos = 1;
		while ((n & 1) == 0) {
			n >>= 1;
			pos++;
		}
		return pos;
	}
}