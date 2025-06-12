import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String s = scan.next();
            String part[] = s.split(":");
            int hour = Integer.parseInt(part[0]);
            String minute = part[1];
            String period = "";
            String hr = "";
            if (hour == 0) {
                hr = "12";
                period = "AM";
            } else if (hour < 12) {
                period = "AM";
                hr = String.format("%02d", hour);
            } else if (hour == 12) {
                period = "PM";
                hr = "12";
            } else {
                period = "PM";
                hr = String.format("%02d", hour - 12);
            }
            System.out.println(hr + ":" + minute + " " + period);
        }
        scan.close();
    }
}