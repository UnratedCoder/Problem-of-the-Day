import java.util.ArrayList;
import java.util.PriorityQueue;

public class code360 {

	// POTD
	public static long reverseNumber(long n) {
		// Write your code here
		long rev = 0;
		while (n > 0) {
			long lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n /= 10;
		}
		return rev;
	}

	// Naukri’s Code360: March Virtual Hiring Drive

	// Problem 1 - Good Array
	public static int goodArray(int n, int[] arr) {

		// Write your Code here
		int count = 0;
		int max = Integer.MIN_VALUE;
		int prev = -2;
		for (int i = 0; i < n; i++) {
			if (prev == -2 && arr[i] == 1) {
				count++;
				prev = arr[i];
			} else if (prev + 1 == arr[i]) {
				count++;
				prev = arr[i];
			} else if (arr[i] == 1) {
				max = Math.max(max, count);
				count = 1;
				prev = arr[i];
			}
		}
		max = Math.max(max, count);
		return max;
	}

	// Problem 2 - D-Value
	public static class Pair implements Comparable<Pair> {
		int bit;
		int val;

		Pair(int bit, int val) {
			this.bit = bit;
			this.val = val;
		}

		public int compareTo(Pair P) {
			if (this.bit == P.bit) {
				return this.val - P.val;
			} else {
				return P.bit - this.bit;
			}
		}
	}

	static int setBit(int n) {
		int count = 0;
		while (n > 0) {
			n &= (n - 1);
			count++;
		}
		return count;
	}

	static long dValue(ArrayList<Integer> v) {
		// Write your code here
		long ans = 0;
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < v.size(); i++) {
			int setBit = setBit(v.get(i));
			int val = v.get(i);
			pq.add(new Pair(setBit, val));
		}
		int count = 1;
		while (!pq.isEmpty()) {
			ans += count * pq.remove().val;
			count++;
		}
		return ans;
	}

	// Problem 3 - Interesting Hotels
	static ArrayList<Integer> hotels(int n, int k, ArrayList<Integer> a) {
		// Write your code here
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			boolean isSafe = true;
			for (int j = i + 1; j < i + 1 + k; j++) {
				if (j < n && a.get(i) <= a.get(j)) {
					isSafe = false;
					break;
				}
			}
			if (isSafe) {
				list.add(i);
			}
		}
		return list;
	}
}