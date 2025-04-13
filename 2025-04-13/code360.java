import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static void main(String args[]) {
		// Write code here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int x = scan.nextInt();
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] == x) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

	// Beginners 7 Day Challenge - 9 (Day 3)
	public static String[] galaxyofStar(int n) {
		// Write your code here
		String pat[] = new String[n];
		int idx = 0;
		for (int i = 0; i <= n / 2; i++) {
			String temp = "";
			for (int j = 0; j <= i; j++) {
				temp += "*";
			}
			pat[idx++] = temp;
		}
		for (int i = idx; i < n; i++) {
			String temp = "";
			for (int j = 0; j < n - i; j++) {
				temp += "*";
			}
			pat[i] = temp;
		}
		return pat;
	}
}