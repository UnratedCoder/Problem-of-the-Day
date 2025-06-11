public class code360 {

	// Problem of the Day (Easy)
	public static int makeBeautiful(String str) {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			char expexted1 = i % 2 == 0 ? '0' : '1';
			char expexted2 = i % 2 == 0 ? '1' : '0';
			if (str.charAt(i) != expexted1) {
				count1++;
			}
			if (str.charAt(i) != expexted2) {
				count2++;
			}
		}
		return Math.min(count2, count1);
	}
}