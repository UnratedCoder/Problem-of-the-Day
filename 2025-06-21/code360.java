public class code360 {

	// Problem of the Day (Easy)
	public static int ninjaAndTriangle(int n) {
		// Write your code here.
		int sum = 0;
		int count = 0;
		for (int i = 1; sum <= n; i++) {
			sum += i;
			count++;
		}
		if (sum == n) {
			return count + 1;
		} else {
			return count - 1;
		}
	}
}