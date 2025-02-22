import java.util.Stack;

public class geeksforgeeks {

    static int maxLength(String s) {
        // code here
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    count = Math.max(count, i - stack.peek());
                }
            }
        }
        return count;
    }
}