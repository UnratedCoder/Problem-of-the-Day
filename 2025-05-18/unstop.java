import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static boolean isPerfect(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static int canPefect(int n) {
        int canPefect = 1;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (isPerfect(i * i) && i * i < n) {
                canPefect = i * i;
            }
        }
        return canPefect;
    }

    public static int[] findNearestHospitalCodeAndDistance(int N) {
        // Write your logic here
        if (isPerfect(N)) {
            return new int[] { N, 0 };
        }
        return new int[] { canPefect(N), N - canPefect(N) };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        int[] result = findNearestHospitalCodeAndDistance(N);
        System.out.println(result[0] + " " + result[1]);
    }
}