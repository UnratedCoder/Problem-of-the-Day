public class code360 {

	// POTD
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static Boolean splitString(String str) {
		// Write your code here..
		int count1 = 0;
		for (int i = 0; i < str.length() / 2; i++) {
			count1 += isVowel(Character.toLowerCase(str.charAt(i))) ? 1 : 0;
		}
		int count2 = 0;
		for (int i = str.length() / 2; i < str.length(); i++) {
			count2 += isVowel(Character.toLowerCase(str.charAt(i))) ? 1 : 0;
		}
		if (count1 == count2) {
			return true;
		} else {
			return false;
		}
	}

	// Beginners 7 Day Challenge - 4 (Day 1)
	public static int largestDig(int n) {
		int largest = Integer.MIN_VALUE;
		while (n > 0) {
			int lastDigit = n % 10;
			largest = Math.max(largest, lastDigit);
			n /= 10;
		}
		return largest;
	}

	public static int concatLargestDigit(int a, int b, int c) {
		// Write your code here.
		a = largestDig(a);
		b = largestDig(b);
		c = largestDig(c);
		return a * 100 + b * 10 + c;
	}
}