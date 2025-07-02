import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        scan.close();
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}