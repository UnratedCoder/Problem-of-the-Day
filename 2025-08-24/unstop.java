import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void userLogic(int n, List<Map.Entry<Integer, String>> orders) {
        // Your logic here
        @SuppressWarnings("unchecked")
        List<String>[] table = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            table[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, String> entry : orders) {
            int key = entry.getKey();
            String item = entry.getValue();
            table[key].add(item);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(table[i]);
            for (String item : table[i]) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Map.Entry<Integer, String>> orders = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int table = sc.nextInt();
            String item = sc.next();
            orders.add(new AbstractMap.SimpleEntry<>(table, item));
        }

        userLogic(n, orders);

        // Print the output in the required format
        for (int i = 0; i < n; i++) {
            // Print orders for table i
        }
        sc.close();
    }
}
