import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                isLowerCase = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                isUpperCase = true;
            } else if (ch >= '0' && ch <= '9') {
                isDigit = true;
            }
        }
        if (s.length() >= 5 && isUpperCase && isLowerCase && isDigit) {
            System.out.println("Correct");
        } else {
            System.out.println("Too weak");
        }
    }
}