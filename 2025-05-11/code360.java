import java.util.Scanner;

public class code360 {

	// Coding Interview Questions
	public static void main(String[] args) {
		// Write your code
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		while (test-- > 0) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < n - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}