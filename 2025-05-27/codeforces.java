import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();
        int x4 = scan.nextInt();
        scan.close();
        int num[] = { x1, x2, x3, x4 };
        Arrays.sort(num);
        int max = num[3];
        int a = max - num[2];
        int b = max - num[1];
        int c = max - num[0];
        System.out.println(a + " " + b + " " + c);
    }
}