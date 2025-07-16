import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int score[] = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = scan.nextInt();
        }
        int count = 0;
        int max = score[0];
        int min = score[0];
        for (int i = 1; i < n; i++) {
            if (score[i] > max) {
                count++;
                max = score[i];
            } else if (score[i] < min) {
                count++;
                min = score[i];
            }
        }
        System.out.println(count++);
    }
}