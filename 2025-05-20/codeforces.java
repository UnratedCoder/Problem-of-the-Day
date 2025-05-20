import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int fashionDays = Math.min(a, b);
        int remainingSocks = Math.abs(a - b);
        int sameSocks = remainingSocks / 2;
        System.out.println(fashionDays + " " + sameSocks);
    }
}