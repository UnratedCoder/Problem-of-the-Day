import java.util.*;

public class code360 {

	// Problem of the Day (Easy)
	public static boolean ninjaShikanji(ArrayList<Integer> bill, int n) {
		// Write your code here.
		int five = 0, ten = 0;
		for (Integer el : bill) {
			if (el == 5) {
				five++;
			} else if (el == 10) {
				if (five > 0) {
					five--;
					ten++;
				} else {
					return false;
				}
			} else {
				if (five >= 1 && ten >= 1) {
					ten--;
					five--;
				} else if (five >= 3) {
					five -= 3;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}