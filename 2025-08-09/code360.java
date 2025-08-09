import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int findSum(int n, ArrayList<Integer> arr) {
		// Write your code here
		int sum = 0;
		for (Integer el : arr) {
			if (el % 2 == 0 || el % 3 == 0) {
				sum += el;
			}
		}
		return sum;
	}
}