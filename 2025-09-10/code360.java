public class code360 {

	// Problem of the Day (Easy)
	public static int numberofSubarrays(int n, int[] arr) {
		// Write your code here.
		int total = 0, i = 0;
		while (i < n) {
			int curr = arr[i];
			int count = 0;
			while (i < n && arr[i] == curr) {
				count++;
				i++;
			}
			total += (count * (count + 1)) / 2;
		}
		return total;
	}
}