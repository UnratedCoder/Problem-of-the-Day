public class code360 {

	// Problem of the Day (Easy)
	public static int[] copyAndReverse(int[] arr, int n) {
		// Write your code here.
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
		return arr;
	}
}