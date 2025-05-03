import java.util.*;

public class atcoder {

    // Task A - Not Found
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!set.contains(ch)) {
                System.out.println(ch);
                break;
            }
        }
    }

}