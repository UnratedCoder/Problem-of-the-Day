import java.util.*;

public class unstop {

    // Unstop Code Conquest Problem (Problem of the Day)
    public static void processDashes(int n, String s) {
        // Write your logic here.
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == '_') {
                stack.pop();
            } else if (ch != '_') {
                stack.push(ch);
            }
        }
        if (stack.isEmpty()) {
            System.out.println(-1);
            return;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        scan.close();
        // Call user logic function
        processDashes(n, s);
    }
}