import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            if (s.equals("++X") || s.equals("X++")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}