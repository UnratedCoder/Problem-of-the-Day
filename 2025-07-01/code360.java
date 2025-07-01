import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> arr,
			ArrayList<ArrayList<Integer>> queries) {
		// Write your code here
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < queries.size(); i++) {
			int sum = 0;
			for (int j = queries.get(i).get(0); j <= queries.get(i).get(2); j++) {
				for (int k = queries.get(i).get(1); k <= queries.get(i).get(3); k++) {
					sum += arr.get(j).get(k);
				}
			}
			result.add(sum);
		}
		return result;
	}
}