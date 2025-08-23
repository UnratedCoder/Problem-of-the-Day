import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            boolean isValid = true;
            char lastDigit = '0' - 1;
            char lastLetter = 'a' - 1;
            boolean seenLetter = false;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (Character.isDigit(ch)) {
                    if (seenLetter) {
                        isValid = false;
                        break;
                    }
                    if (ch < lastDigit) {
                        isValid = false;
                        break;
                    }
                    lastDigit = ch;
                } else if (Character.isLowerCase(ch)) {
                    seenLetter = true;
                    if (ch < lastLetter) {
                        isValid = false;
                        break;
                    }
                    lastLetter = ch;
                } else {
                    isValid = false;
                    break;
                }
            }
            System.out.println(isValid ? "YES" : "NO");
        }
    }
}