import java.util.Scanner;

public class unstop {

    public static boolean isBeautiful(int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 2 || lastDigit == 3 || lastDigit == 9) {
                return true;
            }
            break;
        }
        return false;
    }

    public static int countBeautifulNumbers(int L, int R) {
        // Write your logic here.
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isBeautiful(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] results = new int[T];
        for (int i = 0; i < T; i++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            results[i] = countBeautifulNumbers(L, R);
        }
        scanner.close();
        for (int result : results) {
            System.out.println(result);
        }
    }
}