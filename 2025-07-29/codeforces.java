import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int count = 1;
        while (idx < n) {
            sb.append(s.charAt(idx));
            idx += count;
            count++;
        }
        System.out.println(sb);
    }
}