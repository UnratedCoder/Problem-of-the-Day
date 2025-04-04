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

	// Beginners 7 Day Challenge - 8 (Day 4)
	public static int sumOfMaxMin(int[] arr, int n) {
		// Write your code here.
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int el : arr) {
			min = Math.min(el, min);
			max = Math.max(el, max);
		}
		return max + min;
	}
}