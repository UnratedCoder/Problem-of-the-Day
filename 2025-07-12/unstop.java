import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void calculateLcmWithConstraints(int n, int[][] gears) {
        // Write your logic here.
        int lcmOfNum = gears[0][0];
        for (int i = 1; i < n; i++) {
            lcmOfNum = lcm(lcmOfNum, gears[i][0]);
        }
        boolean result = true;
        for (int i = 0; i < n; i++) {
            if (lcmOfNum % gears[i][1] == 0) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println(lcmOfNum);
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] gears = new int[n][2];
        for (int i = 0; i < n; i++) {
            gears[i][0] = scanner.nextInt();
            gears[i][1] = scanner.nextInt();
        }
        calculateLcmWithConstraints(n, gears);
        scanner.close();
    }
}