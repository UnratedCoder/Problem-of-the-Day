public class code360 {

	// Problem of the Day (Easy)
	public static int swapAdjacent(int n) {
		// Write your code here.
		int evenBit = n & 0xAAAAAAAA;
		int oddBit = n & 0x55555555;
		evenBit >>= 1;
		oddBit <<= 1;
		return (evenBit | oddBit);
	}
}