import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Long> createSequence(long n) {
		// Write your code here.
		ArrayList<Long> result = new ArrayList<>();
		Queue<Long> q = new LinkedList<>();
		if (n < 5) {
			result.add(2L);
			return result;
		}
		q.add(2L);
		q.add(5L);
		while (!q.isEmpty()) {
			long curr = q.poll();
			if (curr >= n) {
				continue;
			}
			result.add(curr);
			long next1 = curr * 10 + 2;
			long next2 = curr * 10 + 5;
			if (next1 < n) {
				q.add(next1);
			}
			if (next2 < n) {
				q.add(next2);
			}
		}
		Collections.sort(result);
		return result;
	}
}