import java.util.*;

public class unstop {

    public static char find_strict_pivot_character(String s) {
        // Write your logic here.
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Character key : map.keySet()) {
            if (map.get(key) == 2) {
                int si = s.indexOf(key);
                int ei = s.indexOf(key, si + 1);
                if (si + 1 == ei) {
                    break;
                }
                HashSet<Character> set = new HashSet<>();
                boolean isContains = false;
                for (int i = si + 1; i < ei; i++) {
                    if (set.contains(s.charAt(i))) {
                        isContains = true;
                        break;
                    } else {
                        set.add(s.charAt(i));
                    }
                }
                if (!isContains) {
                    return s.charAt(si);
                }
            }
        }
        return '1';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        char result = find_strict_pivot_character(s);
        if (result == '1') {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}