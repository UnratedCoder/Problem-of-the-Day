import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int getFourthLargest(int[] arr) {
		// Your code goes here
		int ans = -2147483648;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int el : arr) {
			pq.add(el);
		}
		if (pq.size() < 4) {
			return ans;
		}
		int i = 1;
		while (i <= 4) {
			ans = pq.remove();
			i++;
		}
		return ans;
	}

	// 6-Month Code Marathon - 1 (Day 5)
	public static String stringSort(String s) {
		// Write your code here.
		char words[] = s.toCharArray();
		Arrays.sort(words);
		return new String(words);
	}
}