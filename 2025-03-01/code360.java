import java.util.Scanner;

public class code360 {

	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int ans = 0;
		int pow = 0;
		while (n > 0) {
			ans += n % 10 * Math.pow(2, pow++);
			n /= 10;
		}
		System.out.println(ans);
	}
}