public class leetcode {

    // LeetCode Problem
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int noOfDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            noOfDays[1] = 29;
        }
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += noOfDays[i];
        }
        return totalDays + day;
    }
}
