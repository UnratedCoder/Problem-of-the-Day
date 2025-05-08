import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<ArrayList<Integer>> ninjaCity(ArrayList<ArrayList<Integer>> mat) {
		// Write your code here
		for (int i = 0; i < mat.size(); i++) {
			ArrayList<Integer> row = mat.get(i);
			int si = 0;
			int ei = row.size() - 1;
			while (si < ei) {
				int temp = row.get(si);
				row.set(si, row.get(ei));
				row.set(ei, temp);
				si++;
				ei--;
			}
		}
		return mat;
	}
}