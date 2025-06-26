import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static boolean isDividing(int n) {
		int org = n;
		while (n > 0) {
			int digit = n % 10;
			if (digit == 0) {
				return false;
			} else if (org % digit != 0) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

	public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = lower; i <= upper; i++) {
			if (isDividing(i)) {
				result.add(i);
			}
		}
		return result;
	}
}