import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int getDigitSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static int specialSum(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int sum = 0;
		for (int el : arr) {
			sum += el;
		}
		while (sum >= 10) {
			sum = getDigitSum(sum);
		}
		return sum;
	}
}