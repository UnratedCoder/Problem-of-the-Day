public class code360 {

	// Coding Interview Questions
	public static void print(int n) {
		// Write your code here.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (i % 2 == 0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}