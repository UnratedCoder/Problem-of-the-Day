import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static void sortOddEven(int[] nums) {
		// Write your code here.
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		for (int el : nums) {
			if (el % 2 == 0) {
				even.add(el);
			} else {
				odd.add(el);
			}
		}
		Collections.sort(odd, Collections.reverseOrder());
		Collections.sort(even);
		for (int i = 0; i < odd.size(); i++) {
			nums[i] = odd.get(i);
		}
		int idx = 0;
		for (int i = odd.size(); i < odd.size() + even.size(); i++) {
			nums[i] = even.get(idx);
			idx++;
		}
	}

	// Beginners 7 Day Challenge - 8 (Day 5)
	public static int sumOfCube(int n) {
		String s = Integer.toString(n);
		int sum = 0;
		while (n > 0) {
			sum += Math.pow(n % 10, s.length());
			n /= 10;
		}
		return sum;
	}

	public static boolean checkArmstrong(int n) {
		// Write your code here
		return n == sumOfCube(n);
	}
}