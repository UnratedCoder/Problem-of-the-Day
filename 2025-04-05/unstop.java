import java.util.*;

public class unstop {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            if (set.contains(el)) {
                System.out.println(0);
                return;
            }
            set.add(el);
        }
        System.out.println(1);
    }
}