import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            long n = scan.nextLong();
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            long pattern[] = { a, b, c };
            long cycleSum = a + b + c;
            long completeCycle = n / cycleSum;
            long totalDistance = completeCycle * cycleSum;
            int days = (int) completeCycle * 3;
            for (int i = 0; i < 3 && totalDistance < n; i++) {
                totalDistance += pattern[i];
                days++;
            }
            System.out.println(days);
        }
        scan.close();
    }
}