import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem
    public static int repeat(String init, String goal) {
        // Write your logic here.
        int count = 1;
        StringBuilder sb = new StringBuilder(init);
        while (sb.indexOf(goal) == -1) {
            count++;
            sb.append(init);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String init = scanner.next();
        String goal = scanner.next();

        int result = repeat(init, goal);
        System.out.println(result);
    }
}