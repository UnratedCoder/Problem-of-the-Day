import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int red[] = new int[10];
        int green[] = new int[10];
        int blue[] = new int[10];
        for (int i = 0; i < s.length(); i += 2) {
            char ch = s.charAt(i);
            int rod = s.charAt(i + 1) - '0';
            if (ch == 'g') {
                green[rod]++;
            } else if (ch == 'r') {
                red[rod]++;
            } else {
                blue[rod]++;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (green[i] != 0 && blue[i] != 0 && red[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}