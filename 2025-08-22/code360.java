import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static Vector<Integer> chuninNinja(int n, int m, int arr[][]) {
		// Write your code here.
		Vector<Integer> result = new Vector<>();
		int minRow[] = new int[n];
		int maxCol[] = new int[m];
		Arrays.fill(minRow, Integer.MAX_VALUE);
		Arrays.fill(maxCol, Integer.MIN_VALUE);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				minRow[i] = Math.min(minRow[i], arr[i][j]);
				maxCol[j] = Math.max(maxCol[j], arr[i][j]);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == minRow[i] && arr[i][j] == maxCol[j]) {
					result.add(arr[i][j]);
				}
			}
		}
		return result;
	}
}