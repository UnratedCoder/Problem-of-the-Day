import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int denominations[] = { 100, 20, 10, 5, 1 };
        int count = 0;
        for (int i = 0; i < denominations.length; i++) {
            if (denominations[i] <= n) {
                count++;
                n -= denominations[i];
                i--;
            }
        }
        System.out.println(count);
    }
}