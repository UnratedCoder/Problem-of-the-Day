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

	// Beginners 7 Day Challenge - 6 (Day 3)
	public static boolean findPairSum(int[] arr, int target) {
		// Write your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int el : arr) {
			if (map.containsKey(target - el)) {
				return true;
			} else {
				map.put(el, map.getOrDefault(el, 0) + 1);
			}
		}
		return false;
	}
}