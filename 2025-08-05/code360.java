public class code360 {

	// Problem of the Day (Easy)
	public static void immediateSmaller(int[] a) {
		// Write your code here.
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				a[i] = a[i + 1];
			} else {
				a[i] = -1;
			}
		}
		a[a.length - 1] = -1;
	}
}