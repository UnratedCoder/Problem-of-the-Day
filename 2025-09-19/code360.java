public class code360 {

	// Problem of the Day (Easy)
	public static int[] findSmallestWithKSwaps(int arr[], int n, int k) {
		// Write your code here
		for (int i = 0; i < n && k > 0; i++) {
			int minIdx = i;
			for (int j = i + 1; j < n && j - i <= k; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int swap = minIdx - i;
			for (int j = minIdx; j > i; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
			k -= swap;
		}
		return arr;
	}
}