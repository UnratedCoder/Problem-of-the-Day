import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<ArrayList<Integer>> multiplyMat(ArrayList<ArrayList<Integer>> arr,
			ArrayList<ArrayList<Integer>> brr) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for (int j = 0; j < arr.size(); j++) {
				int sum = 0;
				for (int k = 0; k < arr.size(); k++) {
					sum += arr.get(i).get(k) * brr.get(k).get(j);
				}
				row.add(sum);
			}
			result.add(row);
		}
		return result;
	}

	public static boolean matrixGame(ArrayList<ArrayList<Integer>> arr) {
		// Write your code here
		ArrayList<ArrayList<Integer>> prod = multiplyMat(arr, arr);
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (!arr.get(i).get(j).equals(prod.get(i).get(j))) {
					return false;
				}
			}
		}
		return true;
	}
}