import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static String solve(String s) {
        // Write your logic here.
        if (s.length() == 0) {
            return "NULL";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> freq = new ArrayList<>(map.entrySet());
        Collections.sort(freq, (e1, e2) -> {
            if (!e1.getValue().equals(e2.getValue())) {
                return e2.getValue() - e1.getValue();
            } else {
                return Character.compare(e1.getKey(), e2.getKey());
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : freq) {
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        String result = solve(s);
        if (result.isEmpty()) {
            System.out.println("NULL");
        } else {
            System.out.println(result);
        }
    }
}