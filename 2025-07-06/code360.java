public class code360 {

	// Problem of the Day (Easy)
	public static int removeDuplicates(int[] arr, int n) {
		// Write your code here.
		int count = 0;
		int i = 0;
		for (int j = 1; j < n; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i + 1;
	}
}