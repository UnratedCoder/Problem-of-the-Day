import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count1 = 0, count2 = 0, count3 = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                count1++;
            } else if (ch == '2') {
                count2++;
            } else if (ch == '3') {
                count3++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count1; i++) {
            sb.append(1 + "+");
        }
        for (int i = 0; i < count2; i++) {
            sb.append(2 + "+");
        }
        for (int i = 0; i < count3; i++) {
            sb.append(3 + "+");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}