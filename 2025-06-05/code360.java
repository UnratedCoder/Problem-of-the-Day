public class code360 {

	// Problem of the Day (Easy)
	public static int binaryGap(int num) {
		// Write your code here.
		String bin = Integer.toBinaryString(num);
		int max = 0;
		int prevIdx = -1;
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '1') {
				if (prevIdx != -1) {
					int gap = i - prevIdx;
					max = Math.max(max, gap);
				}
				prevIdx = i;
			}
		}
		return max;
	}
}