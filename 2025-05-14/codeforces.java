import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int score[] = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = scan.nextInt();
        }
        scan.close();
        int count = 0;
        int kthScore = score[k - 1];
        for (int el : score) {
            if (el >= kthScore && el > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}