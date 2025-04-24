import java.util.*;

public class code360 {

	// Coding Interview Questions
	public static void main(String[] args) {
		// Your code goes here
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n <= 1) {
			System.out.println("false");
			return;
		} else if (n == 2) {
			System.out.println("true");
			return;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					System.out.println("false");
					return;
				}
			}
		}
		System.out.println("true");
	}

	// 6-Month Code Marathon - 1 (Day 39)
	public static int[] countEvenOdd(int[] arr, int n) {
		// Write your code here.
		int evenCount = 0;
		int oddCount = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int el : arr) {
			map.put(el, map.getOrDefault(el, 0) + 1);
		}
		for (Integer value : map.values()) {
			if (value % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		return new int[] { oddCount, evenCount };
	}
}