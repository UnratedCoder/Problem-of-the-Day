public class code360 {

	public static int[] copyAndReverse(int[] arr, int n) {
		// Write your code here.
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
		return arr;
	}

	// Beginners 7 Day Challenge - 3 (Day 1)
	public static long evenSumTillN(int n) {
		// Write your code here.
		long sum = 0;
		for (int i = 2; i <= n; i += 2) {
			sum += i;
		}
		return sum;
	}
}