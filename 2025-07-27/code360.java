import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Long> createSequence(long n) {
		// Write your code here.
		ArrayList<Long> result = new ArrayList<>();
		Queue<String> q = new LinkedList<>();
		q.add("2");
		q.add("5");
		while (!q.isEmpty()) {
			String curr = q.poll();
			long num = Long.parseLong(curr);
			if (num > n)
				continue;
			result.add(num);
			q.add(curr + "2");
			q.add(curr + "5");
		}
		Collections.sort(result);
		return result;
	}
}