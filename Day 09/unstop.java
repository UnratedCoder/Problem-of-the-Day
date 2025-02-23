import java.util.Scanner;
import java.util.HashMap;

public class unstop {

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        int index = firstUniqChar(s);
        if (index == -1) {
            System.out.println(-1);
        } else {
            System.out.println(index);
        }
    }
}
