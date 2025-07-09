public class code360 {

	// Problem of the Day (Easy)
	public static int countSubarray(int arr[], int limit) {
		int count = 0;
		int len = 0;
		for (int el : arr) {
			if (el <= limit) {
				len++;
			} else {
				count += len * (len + 1) / 2;
				len = 0;
			}
		}
		count += len * (len + 1) / 2;
		return count;
	}

	public static int find(int n, int[] arr, int x, int y) {
		// Write your code Here
		return countSubarray(arr, y) - countSubarray(arr, x - 1);
	}
}