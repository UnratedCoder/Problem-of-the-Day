import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < mat.size(); i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < mat.get(i).size(); j++) {
					ans.add(mat.get(i).get(j));
				}
			} else {
				for (int j = mat.get(i).size() - 1; j >= 0; j--) {
					ans.add(mat.get(i).get(j));
				}
			}
		}
		return ans;
	}
}