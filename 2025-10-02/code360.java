public class code360 {

	// Problem of the Day (Easy)
	public static boolean isValidIPv4(String ipAddress) {
		// write your code here
		String parts[] = ipAddress.split("\\.");
		if (parts.length != 4) {
			return false;
		}
		for (String part : parts) {
			if (part.isEmpty() || !part.matches("\\d+")) {
				return false;
			}
			if (part.length() > 1 && part.startsWith("0")) {
				return false;
			}
			try {
				int val = Integer.parseInt(part);
				if (val < 0 || val > 255) {
					return false;
				}
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}
}