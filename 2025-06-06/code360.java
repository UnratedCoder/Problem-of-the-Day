import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int findPeakElement(ArrayList<Integer> arr) {
		// Write your code here.
		for (int i = 1; i < arr.size() - 1; i++) {
			if (arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) {
				return i;
			}
		}
		return arr.get(arr.size() - 1) > arr.get(arr.size() - 2) ? arr.size() - 1 : arr.get(0) > arr.get(1) ? 0 : -1;
	}
}