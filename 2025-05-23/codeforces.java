import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scan.nextInt();
        }
        scan.close();
        double ans = sum / n;
        System.out.printf("%.12f\n", ans);
    }
}