import java.util.*;

public class unstop {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String components = scan.next();
        int n = scan.nextInt();
        String model[] = new String[n];
        for (int i = 0; i < n; i++) {
            model[i] = scan.next();
        }
        HashSet<Character> set = new HashSet<>();
        for (char ch : components.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        for (String el : model) {
            HashSet<Character> temp = new HashSet<>();
            for (char ch : el.toCharArray()) {
                temp.add(ch);
            }
            boolean isPresent = true;
            for (Character s : temp) {
                if (!set.contains(s)) {
                    isPresent = false;
                }
            }
            count += isPresent ? 1 : 0;
        }
        System.out.println(count);
    }
}