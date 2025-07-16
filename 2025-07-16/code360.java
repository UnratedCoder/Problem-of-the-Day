import java.util.*;

public class code360 {

	// Coding Interview Questions
	static class CountPrime {
		// Write your totalPrime function here
		public boolean isPrime(int n) {
			if (n <= 1)
				return false;
			if (n == 2)
				return true;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		}

		public int totalPrime(int first, int last) {
			int count = 0;
			for (int i = first; i <= last; i++) {
				if (isPrime(i)) {
					count++;
				}
			}
			return count;
		}

		public static void main(String args[]) {
			CountPrime obj = new CountPrime();
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			int e = sc.nextInt();
			System.out.println(obj.totalPrime(s, e));
		}
	}
}