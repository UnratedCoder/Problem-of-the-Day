import java.util.HashSet;

public class code360 {

	public static int pairSum(int arr[], int n, int target) {
		// Write your code here.
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int el : arr) {
			if (set.contains(target - el)) {
				count++;
			} else {
				set.add(el);
			}
		}
		return count == 0 ? -1 : count;
	}
}