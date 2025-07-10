import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String prev = scan.next();
        int group = 1;
        for (int i = 1; i < n; i++) {
            String s = scan.next();
            if (!s.equals(prev)) {
                group++;
                prev = s;
            }
        }
        System.out.println(group);
    }
}