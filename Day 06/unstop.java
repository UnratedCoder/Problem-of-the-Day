import java.util.*;

public class unstop {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int box = scan.nextInt();
            map.put(box, map.getOrDefault(box, 0) + 1);
        }
        scan.close();
        for (Integer key : map.keySet()) {
            if (map.get(key) == n / 2) {
                System.out.println(key);
                return;
            }
        }
    }
}