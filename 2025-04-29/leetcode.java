import java.util.*;

public class leetcode {

    // LeetCode Problem
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && Character.toLowerCase(stack.peek()) == Character.toLowerCase(ch)
                    && ((Character.isUpperCase(stack.peek()) == Character.isLowerCase(ch))
                            || (Character.isLowerCase(stack.peek()) == Character.isUpperCase(ch)))) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
