import java.util.Stack;

public class leetcode {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack1.isEmpty() && ch == '#') {
                stack1.pop();
            } else {
                if (ch != '#') {
                    stack1.push(ch);
                }
            }
        }
        for (char ch : t.toCharArray()) {
            if (!stack2.isEmpty() && ch == '#') {
                stack2.pop();
            } else {
                if (ch != '#') {
                    stack2.push(ch);
                }
            }
        }
        if (stack1.size() != stack2.size()) {
            return false;
        }
        while (!stack1.isEmpty()) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }
        return true;
    }
}
