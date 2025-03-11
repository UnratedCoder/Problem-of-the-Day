public class code360 {

	// POTD
	public static String maximumDifference(int n, int[] arr) {
		// Write your code here.
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int el : arr) {
			min = Math.min(min, el);
			max = Math.max(max, el);
		}
		if (Math.abs(max - min) % 2 == 0) {
			return "EVEN";
		}
		return "ODD";
	}

	// Beginners 7 Day Challenge - 5 (Day 1)
	public static int[] reverseArray(int n, int[] nums) {
		// Write your code here.
		for (int i = 0; i < n / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[n - 1 - i];
			nums[n - 1 - i] = temp;
		}
		return nums;
	}
}