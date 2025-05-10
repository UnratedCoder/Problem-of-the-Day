public class code360 {

	// Coding Interview Questions
	public static int[] completeSum(int a[], int n) {
		// Write your code here.
		int prefix[] = new int[n];
		prefix[0] = a[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + a[i];
		}
		return prefix;
	}
}