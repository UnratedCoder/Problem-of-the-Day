import java.util.*;

public class codeforces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            @SuppressWarnings("unused")
            int n = scan.nextInt();
            String s = scan.next();
            Stack<Character> stack = new Stack<>();
            for (char ch : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == 'Q' && ch == 'A') {
                    stack.pop();
                }
                if (ch == 'Q') {
                    stack.push(ch);
                }
            }
            if (stack.isEmpty()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scan.close();
    }
}