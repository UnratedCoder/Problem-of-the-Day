import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int[] Klargest(int[] a, int k, int n) {
		// Write your code here
		int result[] = new int[k];
		int idx = k - 1;
		Arrays.sort(a);
		for (int i = n - 1; i >= 0; i--) {
			if (k == 0) {
				break;
			} else {
				result[idx--] = a[i];
				k--;
			}
		}
		return result;
	}
}