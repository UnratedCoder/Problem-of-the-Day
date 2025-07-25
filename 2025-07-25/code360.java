public class code360 {

	// Problem of the Day (Easy)
	public static int stringMania(int n, int m, String str1, String str2) {
		// Write your code here.
		if (str1.compareTo(str2) < 0) {
			return -1;
		} else if (str1.compareTo(str2) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}