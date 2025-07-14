import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int crime[] = new int[n];
        for (int i = 0; i < n; i++) {
            crime[i] = scan.nextInt();
        }
        int count = crime[0] == -1 ? 1 : 0;
        int police = crime[0] == -1 ? 0 : crime[0];
        for (int i = 1; i < n; i++) {
            if (crime[i] > 0) {
                police += crime[i];
            } else if (police <= 0 && crime[i] == -1) {
                count++;
            } else if (police > 0 && crime[i] == -1) {
                police--;
            }
        }
        System.out.println(count);
    }
}