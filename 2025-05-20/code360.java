public class code360 {

	// Problem of the Day (Easy)
	public static boolean isValidIPv4(String ipAddress) {
		// write your code here
		String ip[] = ipAddress.split("\\.");
		if (ip.length != 4) {
			return false;
		}
		for (String el : ip) {
			if (!el.matches("\\d+")) {
				return false;
			}
			try {
				int num = Integer.parseInt(el);
				if (num < 0 || num > 255) {
					return false;
				}
				if (!String.valueOf(num).equals(el)) {
					return false;
				}
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}
}