public class code360 {

	// Problem of the Day (Easy)
	public static int flipSomeBits(int num, int[] arr, int n) {
		// Write your code here.
		for (int i = 0; i < n; i++) {
			int pos = arr[i];
			num ^= (1 << pos - 1);
		}
		return num;
	}
}