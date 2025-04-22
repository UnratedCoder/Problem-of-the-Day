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
		int s = scan.nextInt();
		int e = scan.nextInt();
		int w = scan.nextInt();
		for (int i = s; i <= e; i += w) {
			System.out.println(i + " " + (i - 32) * 5 / 9);
		}
	}
}