import java.util.*;

public class code360 {
	public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		if (n == 1) {
			list.add(arr.get(0));
			list.add(0);
			return list;
		}
		int even = arr.get(0);
		int odd = arr.get(1);
		int diffOfEven = even;
		int diffOfOdd = odd;
		for (int i = 2; i < n; i++) {
			if (i % 2 == 0) {
				diffOfEven = Math.abs(diffOfEven - arr.get(i));
			} else {
				diffOfOdd = Math.abs(diffOfOdd - arr.get(i));
			}
		}
		list.add(diffOfEven);
		list.add(diffOfOdd);
		return list;
	}
}