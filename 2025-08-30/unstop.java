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
        int countF = 0, countB = 0, countL = 0, countR = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'F':
                    countF++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'L':
                    countL++;
                    break;
                case 'R':
                    countR++;
                    break;
            }
        }
        int netX = Math.abs(countL - countR);
        int netY = Math.abs(countF - countB);
        int moves = netX + netY;
        int minDel = s.length() - moves;
        System.out.println(minDel);
    }
}
