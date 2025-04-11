import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int[] getSecondOrderElements(int n, int[] a) {
		// Write your code here.
		int ans[] = new int[2];
		int large = Integer.MIN_VALUE;
		int secLarge = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		int secSmall = Integer.MAX_VALUE;
		for (int el : a) {
			if (large < el) {
				secLarge = large;
				large = el;
			} else if (large > el && secLarge < el) {
				secLarge = el;
			}
			if (small > el) {
				secSmall = small;
				small = el;
			} else if (small < el && secSmall > el) {
				secSmall = el;
			}
		}
		ans[0] = secLarge;
		ans[1] = secSmall;
		return ans;
	}

	// Beginners 7 Day Challenge - 9 (Day 1)
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		// Write your code here
		ArrayList<Integer> list = new ArrayList<>();
		Collections.sort(arr);
		list.add(arr.get(k - 1));
		list.add(arr.get(n - k));
		return list;
	}
}