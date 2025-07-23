public class code360 {

	// Problem of the Day (Easy)
	static int countOfDivisiblePairs(int n, int m) {
		// Write your code here.
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= 1; j--) {
				if ((i + j) % 5 == 0) {
					count++;
				}
			}
		}
		return count;
	}
}