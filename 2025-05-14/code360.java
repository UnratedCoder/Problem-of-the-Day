public class code360 {

	// Problem of the Day (Easy)
	public static int maxXor(int L, int R) {
		// Write your Code here
		int xor = L ^ R;
		int signBit = 0;
		while (xor > 0) {
			signBit++;
			xor >>= 1;
		}
		return (1 << signBit) - 1;
	}
}