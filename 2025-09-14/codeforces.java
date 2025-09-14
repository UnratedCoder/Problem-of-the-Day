import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            int s1 = scan.nextInt();
            int s2 = scan.nextInt();
            int s3 = scan.nextInt();
            int s4 = scan.nextInt();
            int winner1 = Math.max(s1, s2);
            int winner2 = Math.max(s3, s4);
            int[] finalists = { winner1, winner2 };
            Arrays.sort(finalists);
            int[] skills = { s1, s2, s3, s4 };
            Arrays.sort(skills);
            if (finalists[0] == skills[2] && finalists[1] == skills[3]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}