import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static List<Integer> spiralPathMatrix(int[][] matrix, int n, int m) {
		// Write you code here.
		List<Integer> list = new ArrayList<>();
		int startRow = 0;
		int endRow = n - 1;
		int startCol = 0;
		int endCol = m - 1;
		while (startRow <= endRow && startCol <= endCol) {
			for (int i = startCol; i <= endCol; i++) {
				list.add(matrix[startRow][i]);
			}
			for (int j = startRow + 1; j <= endRow; j++) {
				list.add(matrix[j][endCol]);
			}
			for (int i = endCol - 1; i >= startCol; i--) {
				if (startRow == endRow) {
					break;
				}
				list.add(matrix[endRow][i]);
			}
			for (int j = endRow - 1; j >= startRow + 1; j--) {
				if (startCol == endCol) {
					break;
				}
				list.add(matrix[j][startCol]);
			}
			startRow++;
			endRow--;
			startCol++;
			endCol--;

		}
		return list;
	}

	// Beginners 7 Day Challenge - 8 (Day 3)
	static int largestElement(int[] arr, int n) {
		// Write your code here.
		int max = Integer.MIN_VALUE;
		for (int el : arr) {
			max = Math.max(el, max);
		}
		return max;
	}
}