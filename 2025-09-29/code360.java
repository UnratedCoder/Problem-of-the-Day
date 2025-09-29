import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int minimumSum(int[] arr1, int[] arr2, int n) {
		// Write your code here.
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.abs(arr1[i] - arr2[i]);
		}
		return sum;
	}
}