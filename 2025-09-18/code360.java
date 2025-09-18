import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int kthSmallest(ArrayList<Integer> v, int n, int k) {
		// Write your code here.
		Collections.sort(v);
		return v.get(k - 1);
	}
}