import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void processQueries(int q, List<String[]> queries) {
        // Placeholder function for user logic
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < q; i++) {
            String[] query = queries.get(i);
            int type = Integer.parseInt(query[0]);
            String name = query[1];
            int quantity = Integer.parseInt(query[2]);
            if (type == 1) {
                map.put(name, map.getOrDefault(name, 0) + quantity);
            } else {
                int available = map.getOrDefault(name, 0);
                int sold = Math.min(quantity, available);
                System.out.println(sold);
                map.put(name, available - sold);
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        List<String[]> queries = new ArrayList<>();
        for (int i = 0; i < q; ++i) {
            String[] parts = scanner.nextLine().split(" ");
            queries.add(parts);
        }
        processQueries(q, queries);
    }
}