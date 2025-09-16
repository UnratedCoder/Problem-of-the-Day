import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    public int floorDiv(int a, int b) {
        if (a * b < 0 && a % b != 0) {
            return (a / b) - 1;
        }
        return a / b;
    }

    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        for (String el : arr) {
            if (Character.isDigit(el.charAt(0)) || (el.length() > 1 && el.charAt(0) == '-')) {
                s.push(Integer.parseInt(el));
            } else {
                int val1 = s.pop();
                int val2 = s.pop();
                if (el.equals("+")) {
                    s.push(val1 + val2);
                } else if (el.equals("-")) {
                    s.push(val2 - val1);
                } else if (el.equals("*")) {
                    s.push(val2 * val1);
                } else if (el.equals("/")) {
                    s.push(floorDiv(val2, val1));
                } else if (el.equals("^")) {
                    s.push((int) Math.pow(val2, val1));
                }
            }
        }
        return s.pop();
    }
}