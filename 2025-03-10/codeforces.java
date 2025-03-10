import java.util.HashSet;
import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < p; i++) {
            set.add(scan.nextInt());
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            set.add(scan.nextInt());
        }
        if (set.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
        scan.close();
    }
}