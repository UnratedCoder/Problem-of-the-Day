import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static String reformDate(String s) {
		// Write your code here
		String date[] = s.split(" ");
		String mon[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < mon.length; i++) {
			String monNum = (i + 1 < 10) ? "0" + (i + 1) : String.valueOf(i + 1);
			map.put(mon[i], monNum);
		}
		String year = date[2];
		String month = map.get(date[1]);
		String day = date[0].substring(0, date[0].length() - 2);
		if (day.length() == 1) {
			day = "0" + day;
		}
		return year + "-" + month + "-" + day;
	}
}