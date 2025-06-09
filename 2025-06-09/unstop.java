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
        int m = scan.nextInt();
        int a[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int el = scan.nextInt();
            a[i] = el;
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            int el = scan.nextInt();
            if (map.containsKey(el)) {
                for (int j = 0; j < map.get(el); j++) {
                    System.out.print(el + " ");
                }
                map.remove(el);
            }
        }
        for (int el : a) {
            if (map.containsKey(el)) {
                list.add(el);
            }
        }
        Collections.sort(list);
        for (Integer el : list) {
            System.out.print(el + " ");
        }
    }
}