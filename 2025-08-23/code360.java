public class code360 {

	// Problem of the Day (Easy)
	public static int getValue(char ch) {
		switch (ch) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;
		}
	}

	public static int romanToInt(String s) {
		// Write your code here
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int curr = getValue(s.charAt(i));
			int next = i + 1 < s.length() ? getValue(s.charAt(i + 1)) : 0;
			if (curr < next) {
				result -= curr;
			} else {
				result += curr;
			}
		}
		return result;
	}
}