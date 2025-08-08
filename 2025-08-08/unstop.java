import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String s = scan.nextLine();
            if (s.equals("exit")) {
                break;
            }
            String[] parts = s.split("\\s+");
            if (parts.length == 2) {
                String key = parts[0];
                int value = Integer.parseInt(parts[1]);
                map.put(key, value);
            } else if (parts.length == 1) {
                String prefix = parts[0];
                int sum = 0;
                for (String key : map.keySet()) {
                    if (key.startsWith(prefix)) {
                        sum += map.get(key);
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
