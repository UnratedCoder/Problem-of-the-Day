import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int countPairs = 0;
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= 1000; j++) {
                if (i * i + j == n && i + j * j == m) {
                    countPairs++;
                }
            }
        }
        System.out.println(countPairs);
    }
}