import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static int fishEater(int[] fishes) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		for (int el : fishes) {
			list.add(el);
		}
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				list.remove(i + 1);
				i--;
			}
		}
		return list.size();
	}

	// Beginners 7 Day Challenge - 9 (Day 2)
	public static long factorial(int n, int mod) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = (fact * i) % mod;
		}
		return fact;
	}

	public static long sumOrProduct(int n, int q) {
		// Write your code here
		int mod = 1000000007;
		if (q == 1) {
			return ((n * (n + 1)) / 2) % mod;
		} else {
			return factorial(n, mod);
		}
	}
}