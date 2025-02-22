import java.util.Scanner;
import java.util.Stack;
import java.util.PriorityQueue;

public class atcoder {

    // KAJIMA CORPORATION CONTEST 2025 (AtCoder Beginner Contest 394)

    // Task A - 22222
    public static void taskA(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        String ans = "";
        for (char ch : s.toCharArray()) {
            if (ch == '2') {
                ans += ch;
            }
        }
        System.out.println(ans);
    }

    // Task B - cat
    public static void taskB(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> a.length() - b.length());
        for (int i = 0; i < n; i++) {
            // String s = scan.next();
            pq.add(scan.next());
        }
        scan.close();
        String ans = "";
        while (!pq.isEmpty()) {
            ans += pq.remove();
        }
        System.out.println(ans);
    }

    // Task C - Debug
    public static void taskC(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next().toUpperCase();
        scan.close();
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf("WA") != -1) {
            int idx = sb.indexOf("WA");
            sb.replace(idx, idx + 2, "AC");
        }
        System.out.println(sb);
    }

    // Task D - Colorful Bracket Sequence
    public static void taskD(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next().toUpperCase();
        scan.close();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '<') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("No");
                    return;
                } else if ((stack.peek() == '(' && ch == ')') || (stack.peek() == '[' && ch == ']')
                        || (stack.peek() == '<' && ch == '>')) {
                    stack.pop();
                } else {
                    System.out.println("No");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
