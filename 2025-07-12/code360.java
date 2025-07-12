import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static String decrypt(String message, ArrayList<ArrayList<Integer>> operations) {
		// Write your code here.
		StringBuilder sb = new StringBuilder(message);
		for (int i = 0; i < operations.size(); i++) {
			int rotate = operations.get(i).get(0);
			int time = operations.get(i).get(1);
			for (int j = 0; j < time; j++) {
				if (rotate == -1) {
					sb.append(sb.charAt(0));
					sb.deleteCharAt(0);
				} else {
					sb.insert(0, sb.charAt(sb.length() - 1));
					sb.deleteCharAt(sb.length() - 1);
				}
			}
		}
		return sb.toString();
	}
}