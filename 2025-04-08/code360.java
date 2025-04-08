import java.util.Scanner;

public class code360 {

	// Coding Interview Questions
	public static void main(String args[]) {
		// Write code here
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		if (n == 0) {
			System.out.println(1);
		} else {
			System.out.println((int) Math.pow(x, n));
		}
	}
}