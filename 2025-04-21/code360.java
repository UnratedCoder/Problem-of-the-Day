import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int duplicateNumber(int arr[]) {
		// Your code goes here
		HashSet<Integer> set = new HashSet<>();
		for (int el : arr) {
			if (set.contains(el)) {
				return el;
			}
			set.add(el);
		}
		return -1;
	}

	// Beginners 7 Day Challenge - 10 (Day 1)
	public static long evenSumTillN(int n) {
		// Write your code here.
		long even = n / 2;
		return even * (even + 1);
	}

	// Month of Code Challenge - 2 (Day 1)
	public static int getNumberOfBlocks(int[] heights) {
		// Write your code here.
		int clone[] = heights.clone();
		Arrays.sort(clone);
		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			if (clone[i] != heights[i]) {
				count++;
			}
		}
		return count;
	}
}