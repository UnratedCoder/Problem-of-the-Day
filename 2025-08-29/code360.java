import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static int hotelBookings(List<String> queries) {
		// Write your code here.
		int count = 0;
		for (String el : queries) {
			if (el.charAt(0) == '+') {
				count++;
			}
		}
		return count;
	}
}