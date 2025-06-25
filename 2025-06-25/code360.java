import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
		// Write your code here
		List<List<Integer>> result = new ArrayList<>();
		for (int i = s; i <= e; i += w) {
			List<Integer> currTemp = new ArrayList<>();
			int cel = (i - 32) * 5 / 9;
			currTemp.add(i);
			currTemp.add(cel);
			result.add(currTemp);
		}
		return result;
	}
}