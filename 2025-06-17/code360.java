import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static List<String> generateBinaryNumbers(int n) {
		// Write your code here
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			String bin = Integer.toBinaryString(i);
			list.add(bin);
		}
		return list;
	}
}