import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String origin = scan.next();
        String target = scan.next();
        int totalMoves = 0;
        for (int i = 0; i < n; i++) {
            int o = origin.charAt(i) - '0';
            int t = target.charAt(i) - '0';
            int forward = (t - o + 10) % 10;
            int backward = (o - t + 10) % 10;
            totalMoves += Math.min(forward, backward);
        }
        System.out.println(totalMoves);
    }
}