public class code360 {

	// Problem of the Day (Easy)
	public static int toggleKBits(int n, int k) {
		// Write your code here.
		int bitMask = (1 << k) - 1;
		return n ^ bitMask;
	}
}