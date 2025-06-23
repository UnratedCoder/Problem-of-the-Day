import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int totalPassenger = 0;
        int maxPassenger = 0;
        for (int i = 0; i < n; i++) {
            int exitPassenger = scan.nextInt();
            int newPassenger = scan.nextInt();
            if (totalPassenger - exitPassenger >= 0) {
                totalPassenger -= exitPassenger;
            }
            totalPassenger += newPassenger;
            maxPassenger = Math.max(totalPassenger, maxPassenger);
        }
        scan.close();
        System.out.println(maxPassenger);
    }
}