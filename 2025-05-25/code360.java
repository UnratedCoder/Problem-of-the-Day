import java.util.*;

public class code360 {

	// 6-Month Code Marathon - 1 (Day 37)
	public static int minimumReschedules(int n, int[][] intervals) {
		// Write your code here.
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
		int meeting = 1;
		int lastEnd = intervals[0][1];
		for (int i = 1; i < n; i++) {
			if (intervals[i][0] >= lastEnd) {
				meeting++;
				lastEnd = intervals[i][1];
			}
		}
		return n - meeting;
	}
}