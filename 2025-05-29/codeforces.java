import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        int availableTime = 240 - k;
        int problemSolved = 0;
        int timeSpent = 0;
        for (int i = 1; i <= n; i++) {
            timeSpent += 5 * i;
            if (timeSpent <= availableTime) {
                problemSolved++;
            } else {
                break;
            }
        }
        System.out.println(problemSolved);
    }
}