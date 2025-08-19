import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static final int MAX = 100005;
	public static List<Integer> primes = new ArrayList<>();

	static {
		boolean isPrime[] = new boolean[MAX];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i < MAX; i++) {
			if (isPrime[i]) {
				primes.add(i);
				for (int j = i * 2; j < MAX; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}

	public static int rounds(int a, int b) {
		// Write your code here
		int moves = 0;
		for (int i = b + 1; i <= a; i++) {
			int num = i;
			for (int p : primes) {
				if (p * p > num) {
					break;
				}
				while (num % p == 0) {
					moves++;
					num /= p;
				}
			}
			if (num > 1) {
				moves++;
			}
		}
		return moves;
	}
}