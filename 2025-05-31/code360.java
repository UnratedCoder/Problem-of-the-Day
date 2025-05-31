public class code360 {

	// Problem of the Day (Easy)
	public static int countColumns(String[] strings) {
		// Write your code here.
		int count = 0;
		int col = strings[0].length();
		for (int j = 0; j < col; j++) {
			for (int i = 1; i < strings.length; i++) {
				if (strings[i].charAt(j) < strings[i - 1].charAt(j)) {
					count++;
					break;
				}
			}
		}
		return count;
	}

	// 6-Month Code Marathon - 1 (Day 74)
	public static String decodeSequence(int n, String s) {
		// Write your code here
		StringBuilder sb = new StringBuilder();
		if (s.substring(0, 3).equals("000")) {
			sb.append("DNA: ");
		} else {
			sb.append("RNA: ");
		}
		for (int i = 3; i < n; i++) {
			String sub = s.substring(i, i + 3);
			if (sub.equals("001")) {
				sb.append("A");
			} else if (sub.equals("010")) {
				sb.append("C");
			} else if (sub.equals("011")) {
				sb.append("G");
			} else if (sub.equals("100") && s.substring(0, 3).equals("000")) {
				sb.append("T");
			} else if (sub.equals("101") && s.substring(0, 3).equals("111")) {
				sb.append("U");
			}
			i += 2;
		}
		return sb.toString();
	}
}