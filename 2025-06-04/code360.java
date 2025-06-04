public class code360 {

	// Coding Interview Questions
	public static int removeDuplicates(int[] arr, int n) {
		// Write your code here.
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] == arr[i]) {
				count++;
			}
		}
		return n - count;
	}
}