public class code360 {

	// Problem of the Day (Easy)
	public static int beautifulIndex(int N, int[] A) {
		// Write your code here.
		long total = 0;
		for (int el : A) {
			total += el;
		}
		long prefix = 0;
		for (int i = 0; i < N; i++) {
			if (2 * prefix + A[i] == total) {
				return i + 1;
			}
			prefix += A[i];
		}
		return -1;
	}
}