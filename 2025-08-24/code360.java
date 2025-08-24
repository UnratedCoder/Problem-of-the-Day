import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int equalSum(ArrayList<Integer> token) {
		// Write your code here.
		int sum = 0;
		for (int el : token) {
			sum += el;
		}
		int preSum = 0;
		for (int i = 0; i < token.size(); i++) {
			int currSum = token.get(i);
			int suffSum = sum - preSum - currSum;
			if (preSum == suffSum) {
				return i;
			}
			preSum += currSum;
		}
		return -1;
	}
}