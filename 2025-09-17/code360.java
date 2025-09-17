public class code360 {

	// Problem of the Day (Easy)
	static void rotateClockwise(int n, int[][] nums) {
		// Write your code here.
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = nums[i][j];
				nums[i][j] = nums[j][i];
				nums[j][i] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
			int left = 0, right = n - 1;
			while (left < right) {
				int temp = nums[i][left];
				nums[i][left] = nums[i][right];
				nums[i][right] = temp;
				left++;
				right--;
			}
		}
	}
}