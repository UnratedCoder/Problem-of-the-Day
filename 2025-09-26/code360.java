import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int[] linearProbing(List<Integer> keys) {
		// Write your code here.
		int result[] = new int[keys.size()];
		Arrays.fill(result, 0);
		for (int key : keys) {
			int idx = key % keys.size();
			while (result[idx] != 0) {
				idx = (idx + 1) % keys.size();
			}
			result[idx] = key;
		}
		return result;
	}
}