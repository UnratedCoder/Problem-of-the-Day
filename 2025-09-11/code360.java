public class code360 {

	// Problem of the Day (Easy)
	public static String stringReverse(char[] arr) {
		// Write your code here.
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return new String(arr);
	}
}