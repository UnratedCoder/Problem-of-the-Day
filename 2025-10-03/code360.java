import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
		// Write your code here.
		int n = arr.size();
		int carry = 1;
		for (int i = n - 1; i >= 0; i--) {
			int sum = arr.get(i) + carry;
			arr.set(i, sum % 10);
			carry = sum /= 10;
		}
		if (carry > 0) {
			arr.add(0, carry);
		}
		while (arr.size() > 1 && arr.get(0) == 0) {
			arr.remove(0);
		}
		return arr;
	}
}