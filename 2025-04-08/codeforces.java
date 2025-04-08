import java.util.*;

public class codeforces {

    public static int value(char ch) {
        int ans = 0;
        if (ch == 'q' || ch == 'Q') {
            ans = 9;
        } else if (ch == 'r' || ch == 'R') {
            ans = 5;
        } else if (ch == 'b' || ch == 'n' || ch == 'B' || ch == 'N') {
            ans = 3;
        } else if (ch == 'p' || ch == 'P') {
            ans = 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int white = 0;
        int black = 0;
        for (int i = 0; i < 8; i++) {
            String s = scan.next();
            for (char ch : s.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    black += value(ch);
                } else {
                    white += value(ch);
                }
            }
        }
        if (white > black) {
            System.out.println("White");
        } else if (white < black) {
            System.out.println("Black");
        } else {
            System.out.println("Draw");
        }
        scan.close();
    }
}