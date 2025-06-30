import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static List<Integer> findAnagramIndices(String secret1, String secret2) {
        // Write your logic here.
        List<Integer> result = new ArrayList<>();
        if (secret2.length() > secret1.length()) {
            return result;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : secret2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i <= secret1.length() - secret2.length(); i++) {
            String sub = secret1.substring(i, i + secret2.length());
            HashMap<Character, Integer> temp = new HashMap<>(map);
            for (char ch : sub.toCharArray()) {
                if (temp.containsKey(ch)) {
                    if (temp.get(ch) == 1) {
                        temp.remove(ch);
                    } else {
                        temp.put(ch, temp.get(ch) - 1);
                    }
                } else {
                    break;
                }
            }
            if (temp.size() == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secret1 = scanner.next();
        String secret2 = scanner.next();
        List<Integer> result = findAnagramIndices(secret1, secret2);

        if (result.isEmpty()) {
            System.out.println("Empty Array");
        } else {
            for (int index : result) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}