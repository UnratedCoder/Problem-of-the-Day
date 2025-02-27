import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scan.next().toUpperCase();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        scan.close();
        int max = Integer.MIN_VALUE;
        String ans = "";
        for (String key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                ans = key;
            }
        }
        System.out.println(ans);
    }
}