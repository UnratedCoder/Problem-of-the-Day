import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        for (char ch : t.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
            } else {
                System.out.println("false");
                return;
            }
        }
        if (set.size() == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}