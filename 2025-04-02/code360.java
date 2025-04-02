public class code360 {

	// Month of Code Challenge - 1 (Day 22)
	public static int isPowerOfThree(int n) {
		// Write your code here.
		if (n == 1) {
			return 1;
		}
		while (n >= 2) {
			if (n % 3 != 0) {
				return 0;
			}
			n /= 3;
		}
		return 1;
	}

	// Beginners 7 Day Challenge - 8 (Day 2)
	public static void printNum(int counter, int x, int ans[]) {
		if (counter > x) {
			return;
		}
		ans[counter - 1] = counter;
		printNum(counter + 1, x, ans);
	}

	public static int[] printNos(int x) {
		// Write Your Code Here
		int ans[] = new int[x];
		printNum(1, x, ans);
		return ans;
	}
}