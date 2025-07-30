public class code360 {

	// Problem of the Day (Easy)
	public static int numberofSubarrays(int n, int[] arr) {
		// Write your code here.
		int totalSub = 0;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				totalSub += (count * (count + 1)) / 2;
				count = 1;
			}
		}
		totalSub += (count * (count + 1)) / 2;
		return totalSub;
	}
}