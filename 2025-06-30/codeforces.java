import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int home[] = new int[n];
        int guest[] = new int[n];
        for (int i = 0; i < n; i++) {
            home[i] = scan.nextInt();
            guest[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && home[i] == guest[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}