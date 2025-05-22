public class code360 {

	// Problem of the Day (Easy)
	public static int findAngle(int hour, int minute) {
		// Write your code here
		hour = hour % 12;
		double hourAngle = (hour * 30) + (minute * 0.5);
		double minuteAngle = minute * 6;
		double angle = Math.abs(hourAngle - minuteAngle);
		return (int) Math.floor(Math.min(angle, 360 - angle));
	}
}