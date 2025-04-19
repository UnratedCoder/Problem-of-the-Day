public class code360 {

	// Problem of the Day (Easy)
	public static int findSetBit(int n) {
		// WRITE YOUR CODE HERE
		if (Integer.bitCount(n) > 1 || n == 0) {
			return -1;
		}
		String s = Integer.toBinaryString(n);
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			count++;
			if (s.charAt(i) == '1') {
				break;
			}
		}
		return count;
	}

	// 6-Month Code Marathon - 1 (Day 34)
	public static boolean lemonadeChange(int[] bill) {
		// Write your code here.
		int five = 0;
		int ten = 0;
		for (int money : bill) {
			if (money == 5) {
				five++;
			} else if (money == 10) {
				if (five >= 1) {
					five--;
					ten++;
				} else {
					return false;
				}
			} else {
				if (five >= 1 && ten >= 1) {
					five--;
					ten--;
				} else if (five >= 3) {
					five -= 3;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}