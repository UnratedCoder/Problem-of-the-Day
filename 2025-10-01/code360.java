public class code360 {

	// Problem of the Day (Easy)
	public static String maximumDifference(int n, int[] arr) {
		// Write your code here.
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int el : arr) {
			min = Math.min(min, el);
			max = Math.max(max, el);
		}
		return (max - min) % 2 == 1 ? "ODD" : "EVEN";
	}
}