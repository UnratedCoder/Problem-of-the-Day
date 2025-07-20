import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int minimizeIt(int[] A, int K) {
		// Write your code here.
		int n = A.length;
		Arrays.sort(A);
		int result = A[n - 1] - A[0];
		int min = A[0] + K;
		int max = A[n - 1] - K;
		for (int i = 0; i < n - 1; i++) {
			int currMin = Math.min(min, A[i + 1] - K);
			int currMax = Math.max(max, A[i] + K);
			if (currMin < 0)
				continue;
			result = Math.min(result, currMax - currMin);
		}
		return result;
	}
}