public class code360 {

	// Problem of the Day (Easy)
	public static int groupAllOneTogether(int arr[], int n) {
		// Write your code here.
		int count1 = 0;
		for (int el : arr) {
			count1 += el == 1 ? 1 : 0;
		}
		if (count1 == 0) {
			return -1;
		}
		int min = Integer.MAX_VALUE;
		int count0 = 0;
		for (int i = 0; i < count1; i++) {
			count0 += arr[i] == 0 ? 1 : 0;
		}
		min = count0;
		for (int i = count1; i < n; i++) {
			if (arr[i - count1] == 0) {
				count0--;
			}
			if (arr[i] == 0) {
				count0++;
			}
			min = Math.min(min, count0);
		}
		return min;
	}
}