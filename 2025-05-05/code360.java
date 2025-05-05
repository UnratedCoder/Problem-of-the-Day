import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static void main(String[] args) {

		/*
		 * Your class should be named Solution.
		 * Read input as specified in the question.
		 * Print output as specified in the question.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}