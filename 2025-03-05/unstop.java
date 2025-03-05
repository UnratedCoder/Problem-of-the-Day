import java.util.Scanner;

public class unstop {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void modifyString(int n, String s) {
        int prime = 0;
        int primeSum = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (isPrime(ch - '0')) {
                    primeSum += ch - '0';
                    prime++;
                }
            }
        }
        int avg = 0;
        if (prime > 0) {
            avg = (int) Math.floor(primeSum / prime);
        }
        char alpha[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };
        String str = "";
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                if (avg != 0) {
                    str += alpha[(ch - '0') % avg];
                } else {
                    str += alpha[(ch - '0')];
                }
            } else {
                str += ch;
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();
        modifyString(n, s);
    }
}