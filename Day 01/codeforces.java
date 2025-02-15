import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String guest = scan.next().toUpperCase();
        String host = scan.next().toUpperCase();
        String pile = scan.next().toUpperCase();
        scan.close();
        if (guest.length() + host.length() != pile.length()) {
            System.out.println("NO");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : guest.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : host.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : pile.toCharArray()) {
            if (map.containsKey(ch)) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                System.out.println("NO");
                return;
            }
        }
        if (map.size() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}