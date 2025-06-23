import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static ArrayList<Integer> corpFlightBookings(ArrayList<ArrayList<Integer>> bookings, int n) {
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<>();
		int arr[] = new int[n];
		for (int i = 0; i < bookings.size(); i++) {
			int first = bookings.get(i).get(0);
			int last = bookings.get(i).get(1);
			int seats = bookings.get(i).get(2);
			for (int j = first; j <= last; j++) {
				arr[j - 1] = arr[j - 1] + seats;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		return result;
	}
}