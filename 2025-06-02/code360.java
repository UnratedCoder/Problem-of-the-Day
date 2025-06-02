public class code360 {

	// Problem of the Day (Easy)
	public static int countSetBit(int n) {
		int count = 0;
		while (n > 0) {
			count += (n & 1);
			n >>= 1;
		}
		return count;
	}

	public static int numberOfFlips(int a, int b) {
		// Write your code here.
		return countSetBit(a ^ b);
	}
}