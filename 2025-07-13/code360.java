public class code360 {

	// Coding Interview Questions
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int el : arr) {
			if (first < el) {
				second = first;
				first = el;
			} else if (first > el && second < el) {
				second = el;
			}
		}
		return second == Integer.MIN_VALUE ? -1 : second;
	}
}