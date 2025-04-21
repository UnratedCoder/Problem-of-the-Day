import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        scan.close();
        for (Integer key : map.keySet()) {
            if (map.get(key) > n / 2) {
                System.out.println(key);
                break;
            }
        }
    }
}