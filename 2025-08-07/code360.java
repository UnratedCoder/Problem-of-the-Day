import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int maximumChocolates(ArrayList<Integer> arr, int k) {
		// Write your code here.
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (Integer el : arr) {
			pq.add(el);
		}
		int result = 0;
		while (k-- > 0) {
			int val = pq.remove();
			result += val % 1000000007;
			pq.add(val / 2);
		}
		return result;
	}
}