public class code360 {

	public static String stringReverse(char[] arr) {
		// Write your code here.
		int si = 0;
		int ei = arr.length - 1;
		while (si < ei) {
			char temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;
			si++;
			ei--;
		}
		return new String(arr);
	}
}