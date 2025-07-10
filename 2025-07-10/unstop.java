import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static boolean solve(List<Integer> arr) {
        // Write your logic here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (key == 0) {
                if (map.get(key) % 2 != 0)
                    return false;
            } else {
                if (!map.containsKey(-key) || !map.get(key).equals(map.get(-key))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arr.add(sc.nextInt());
        }
        boolean result = solve(arr);
        System.out.println(result ? 1 : 0);
    }
}