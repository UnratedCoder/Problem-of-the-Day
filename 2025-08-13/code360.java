public class code360 {

	// Problem of the Day (Easy)
	public static int groupAllOneTogether(int arr[], int n) {
		// Write your code here.
		int countOne = 0;
		for (int el : arr) {
			countOne += el == 1 ? 1 : 0;
		}
		if (countOne == 0) {
			return -1;
		}
		int maxOne = 0;
		int currOne = 0;
		for (int i = 0; i < countOne; i++) {
			currOne += arr[i] == 1 ? 1 : 0;
		}
		maxOne = currOne;
		for (int i = countOne; i < n; i++) {
			currOne -= arr[i - countOne] == 1 ? 1 : 0;
			currOne += arr[i] == 1 ? 1 : 0;
			maxOne = Math.max(maxOne, currOne);
		}
		return countOne - maxOne;
	}
}