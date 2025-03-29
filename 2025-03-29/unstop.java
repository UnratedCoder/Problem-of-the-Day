import java.util.*;

public class unstop {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        scan.close();
        HashSet<Integer> set = new HashSet<>();
        for (int el : a) {
            if (set.contains(target - el)) {
                System.out.println("FOUND");
                return;
            } else {
                set.add(el);
            }
        }
        System.out.println("NOT FOUND");
    }
}