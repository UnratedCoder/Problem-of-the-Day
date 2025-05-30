import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.
		int ans[] = { -1, -1 };
		int si = 0;
		int ei = n - 1;
		while (si <= ei) {
			int mid = si + (ei - si) / 2;
			if (arr.get(mid) == k) {
				ans[0] = mid;
				ei = mid - 1;
			} else if (arr.get(mid) < k) {
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}
		si = 0;
		ei = n - 1;
		while (si <= ei) {
			int mid = si + (ei - si) / 2;
			if (arr.get(mid) == k) {
				ans[1] = mid;
				si = mid + 1;
			} else if (arr.get(mid) < k) {
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}
		return ans;
	}

	// 6-Month Code Marathon - 1 (Day 73)
	public static int[] findMaximums(int r, int c, int[][] matrix) {
		// Write your code here
		int ans[] = new int[r];
		for (int i = 0; i < r; i++) {
			int maxRow = Integer.MIN_VALUE;
			for (int j = 0; j < c; j++) {
				maxRow = Math.max(maxRow, matrix[i][j]);
			}
			ans[i] = maxRow;
		}
		return ans;
	}
}