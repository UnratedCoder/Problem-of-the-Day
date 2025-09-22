public class code360 {

	// Problem of the Day (Easy)
	public static int findProductSumDifference(int n) {
		// Write your code here
		int sum = 0;
		int prod = 1;
		while (n > 0) {
			int digit = n % 10;
			sum += digit;
			prod *= digit;
			n /= 10;
		}
		return prod - sum;
	}
}