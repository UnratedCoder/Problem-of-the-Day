import java.util.Scanner;

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
			int count = i;
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(count++);
			}
			System.out.println();
		}

	}
}