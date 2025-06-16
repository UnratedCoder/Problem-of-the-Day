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
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            if (map.containsKey(el)) {
                max = Math.max(max, i - map.get(el));
            } else {
                map.put(el, i);
            }
        }
        System.out.println(max);
    }
}