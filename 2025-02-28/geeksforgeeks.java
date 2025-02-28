import java.util.Stack;

public class geeksforgeeks {

    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        for (String el : arr) {
            if (el.matches("-?\\d+")) {
                s.push(Integer.parseInt(el));
            } else {
                int v1 = s.pop();
                int v2 = s.pop();
                switch (el) {
                    case "+":
                        s.push(v1 + v2);
                        break;
                    case "-":
                        s.push(v2 - v1);
                        break;
                    case "*":
                        s.push(v1 * v2);
                        break;
                    case "/":
                        s.push(v2 / v1);
                        break;
                }
            }
        }
        return s.pop();
    }
}