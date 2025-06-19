import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int singleNonDuplicate(ArrayList<Integer> arr) {
		// Write your code here.
		int xor = 0;
		for (Integer el : arr) {
			xor ^= el;
		}
		return xor;
	}
}