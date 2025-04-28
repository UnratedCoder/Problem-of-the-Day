import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static ArrayList<Integer> searchInTheArray(ArrayList<Integer> arr, ArrayList<Integer> queries, int n,
			int q) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer query : queries) {
			int sum = 0;
			for (Integer el : arr) {
				if (el <= query) {
					sum += el;
				} else if (el > query) {
					break;
				}
			}
			list.add(sum);
		}
		return list;
	}
}