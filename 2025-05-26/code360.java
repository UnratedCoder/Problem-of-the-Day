import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static boolean selfDividing(int n) {
		int num = n;
		while (n > 0) {
			int lastDigit = n % 10;
			if (lastDigit == 0 || num % lastDigit != 0) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

	public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = lower; i <= upper; i++) {
			if (selfDividing(i)) {
				list.add(i);
			}
		}
		return list;
	}

	// 6-Month Code Marathon - 1 (Day 60)
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maxSum = 0;
		long currSum = 0;
		for (int el : arr) {
			currSum += el;
			if (currSum < 0) {
				currSum = 0;
			} else {
				maxSum = Math.max(maxSum, currSum);
			}
		}
		return maxSum;
	}
}