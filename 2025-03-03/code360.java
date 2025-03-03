public class code360 {

	public static int sumOfPow(int n) {
		String s = Integer.toString(n);
		int sum = 0;
		while (n > 0) {
			sum += Math.pow(n % 10, s.length());
			n /= 10;
		}
		return sum;
	}

	public static boolean isArmstrong(int num) {
		// wrtie your code here;
		int origin = num;
		return origin == sumOfPow(num);
	}
}