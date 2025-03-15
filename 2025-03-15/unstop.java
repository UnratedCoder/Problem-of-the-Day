import java.util.*;

public class unstop {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        long ans = 1;
        for (int col = 1; col <= n; col++) {
            ans *= n + 1 - col;
            ans /= col;
            list.add((int) ans);
        }
        for (Integer el : list) {
            System.out.print(el + " ");
        }
    }
}