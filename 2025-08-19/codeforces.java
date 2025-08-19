import java.util.*;

public class codeforces {

    // CodeForces Problem
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            String pin = scan.next();
            Map<Character, Integer> position = new HashMap<>();
            position.put('1', 0);
            position.put('2', 1);
            position.put('3', 2);
            position.put('4', 3);
            position.put('5', 4);
            position.put('6', 5);
            position.put('7', 6);
            position.put('8', 7);
            position.put('9', 8);
            position.put('0', 9);
            int time = 0;
            char current = '1';
            for (char c : pin.toCharArray()) {
                time += Math.abs(position.get(c) - position.get(current));
                time += 1;
                current = c;
            }
            System.out.println(time);
        }
    }
}