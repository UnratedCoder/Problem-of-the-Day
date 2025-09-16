public class code360 {

	// Problem of the Day (Easy)
	public static int oneIteration(int[] A) {
		// Write your Code here
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int el : A) {
			if (el > max1) {
				max2 = max1;
				max1 = el;
			} else if (el > max2) {
				max2 = el;
			}
		}
		return max1 + max2;
	}
}