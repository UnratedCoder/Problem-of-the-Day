import java.util.Scanner;

public class code360 {

	// Coding Interview Questions
	public static void main(String args[]) {
		// Write code here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int even = 0;
		int odd = 0;
		while (n > 0) {
			if ((n % 10) % 2 == 0) {
				even += n % 10;
			} else {
				odd += n % 10;
			}
			n /= 10;
		}
		System.out.println(even + " " + odd);
	}
}