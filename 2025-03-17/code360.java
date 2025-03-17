public class code360 {

	// Beginners 7 Day Challenge - 5 (Day 7)
	public static int getSum(int a, int b) {
		// Write your code here.
		return a + b;
	}

	// 6-Month Code Marathon - 1 (Day 1)
	public static int totalSalary(int basic, char grade) {
		// Write your code here
		double hra = basic * 0.2;
		double da = basic * 0.5;
		double pf = basic * 0.11;
		int allowance = 0;
		if (grade == 'A') {
			allowance = 1700;
		} else if (grade == 'B') {
			allowance = 1500;
		} else {
			allowance = 1300;
		}

		double totalSalary = basic + hra + da + allowance - pf;
		return (int) Math.round(totalSalary);
	}
}