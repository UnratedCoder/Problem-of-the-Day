import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int specialSum(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int firstSum = 0;
		int lastSum = 0;
		int specialSum = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			firstSum += arr.get(i);
			lastSum += arr.get(n - 1 - i);
			specialSum = Math.min(specialSum, firstSum + lastSum);
		}
		return specialSum;
	}
}