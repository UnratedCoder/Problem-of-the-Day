import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = k; i < arr.size(); i++) {
			result.add(arr.get(i));
		}
		for (int i = 0; i < k; i++) {
			result.add(arr.get(i));
		}
		return result;
	}
}