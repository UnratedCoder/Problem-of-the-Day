public class code360 {

	// Problem of the Day (Easy)
	public static int findMSB(int n) {
		// Write your code here.
		n |= (n >> 1);
		n |= (n >> 2);
		n |= (n >> 4);
		n |= (n >> 8);
		n |= (n >> 16);
		return (n + 1) >> 1;
	}
}