public class code360 {

	public static int missingNumber(int[] a, int N) {
		// Write your code here.
		int sum = 0;
		for (int el : a) {
			sum += el;
		}
		int oneToN = (N * (N + 1)) / 2;
		return oneToN - sum;
	}
}