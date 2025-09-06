public class code360 {

	// Problem of the Day (Easy)
	public static double calculateArea(int n, int points[][]) {
		// Write your code here.
		double maxArea = 0.0;
		for (int i = 0; i < n; i++) {
			int p1[] = points[i];
			for (int j = i + 1; j < n; j++) {
				int p2[] = points[j];
				for (int k = j + 1; k < n; k++) {
					int p3[] = points[k];
					double area = 0.5
							* Math.abs(p1[0] * (p2[1] - p3[1]) + p2[0] * (p3[1] - p1[1]) + p3[0] * (p1[1] - p2[1]));
					maxArea = Math.max(maxArea, area);
				}
			}
		}
		return maxArea;
	}
}